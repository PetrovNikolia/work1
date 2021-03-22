package ru.petrov.work1.Service;

import ru.petrov.work1.Model.MyFileDto;

import java.util.List;
import java.util.UUID;

public interface MyFileService {

    List<MyFileDto> findAll();

    MyFileDto findById(UUID id);

    void deleteById(UUID id);

    MyFileDto save(MyFileDto myFileDto);

}
