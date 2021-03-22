package ru.petrov.work1.Model;

public interface Converter <E, D> {

    D convertToDto(E entity);

    E convertToEntity(D dto);

}

