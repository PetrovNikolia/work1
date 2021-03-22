package ru.petrov.work1.Model;

import lombok.Data;

import java.util.UUID;

@Data
public class MyFileDto {

    UUID id;
    String name;
    String type;
    String time;
    Long size;
    String download;

    private String getDownload(){
        return "app/file" + id.toString();
    }

}
