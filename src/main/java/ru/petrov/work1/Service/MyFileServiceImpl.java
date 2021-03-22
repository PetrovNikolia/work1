package ru.petrov.work1.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.petrov.work1.Date.FileRepository.MyFileRepository;
import ru.petrov.work1.Model.ConverterImpl.MyFileConverter;
import ru.petrov.work1.Model.MyFileDto;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MyFileServiceImpl implements MyFileService {

    private final MyFileRepository fileRepository;

    private final MyFileConverter myFileConverter;

    @Override
    public List<MyFileDto> findAll() {

        return fileRepository.findAll().stream()
                .map(myFileConverter::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public MyFileDto findById(UUID id) {
        return fileRepository.findById(id).map(myFileConverter::convertToDto).orElse(null) ;
    }

    @Override
    public void deleteById(UUID id) {
        fileRepository.deleteById(id);
    }

    @Override
    public MyFileDto save(MyFileDto myFileDto) {
        return myFileConverter.convertToDto(
                fileRepository.save(
                        myFileConverter.convertToEntity(myFileDto)
                )
        );
    }


}
