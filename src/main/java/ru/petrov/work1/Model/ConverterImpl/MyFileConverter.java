package ru.petrov.work1.Model.ConverterImpl;

import org.springframework.stereotype.Component;
import ru.petrov.work1.Date.Entity.MyFile;
import ru.petrov.work1.Model.Converter;
import ru.petrov.work1.Model.MyFileDto;

@Component
public class MyFileConverter implements Converter<MyFile, MyFileDto> {

    @Override
    public MyFileDto convertToDto(MyFile entity) {
        MyFileDto myFileDto = new MyFileDto();
        myFileDto.setId(entity.getId());
        myFileDto.setName(entity.getName());
        myFileDto.setType(entity.getType());
        myFileDto.setSize(entity.getSize());
        myFileDto.setDownload("app/file" + entity.getId());
        return myFileDto;
    }

    @Override
    public MyFile convertToEntity(MyFileDto dto) {
        MyFile myFile = new MyFile();
        myFile.setId(dto.getId());
        myFile.setName(dto.getName());
        myFile.setType(dto.getType());
        myFile.setSize(dto.getSize());
        return myFile;
    }
}
