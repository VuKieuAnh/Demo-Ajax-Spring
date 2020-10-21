package com.codegym.repository;

import com.codegym.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Long> {
    Iterable<Student> findAllByNameContaining(String name);
}
