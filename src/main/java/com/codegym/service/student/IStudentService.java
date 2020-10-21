package com.codegym.service.student;

import com.codegym.model.Student;
import com.codegym.service.IService;

public interface IStudentService extends IService<Student> {
    Iterable<Student> findAllByNameContaining(String name);
}
