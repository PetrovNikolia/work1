package ru.petrov.work1.Controller.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.petrov.work1.Model.MyFileDto;
import ru.petrov.work1.Service.MyFileServiceImpl;

import java.util.List;

@RequestMapping("/api/v1/file")
@RestController
@RequiredArgsConstructor
public class MyFileRestController {

    private final MyFileServiceImpl myFileService;

    @GetMapping(path = "/{id}")
    public MyFileDto getFile(@PathVariable String id){
        return null;
    }

    @GetMapping(path = "/all")
    public List<MyFileDto> getAllFile(){
        return null;
    }

    @PostMapping()
    public MyFileDto createFile(){
        return null;
    }

    @DeleteMapping(path = "/{id}")
    public void deleteFile(@PathVariable String id){

    }

    @PutMapping(path = "/{id}/edit")
    public MyFileDto editFile(@PathVariable String id){
        return null;
    }
}
