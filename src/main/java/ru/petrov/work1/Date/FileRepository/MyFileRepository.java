package ru.petrov.work1.Date.FileRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.petrov.work1.Date.Entity.MyFile;

import java.util.UUID;

@Repository
public interface MyFileRepository extends JpaRepository<MyFile, UUID> {
}
