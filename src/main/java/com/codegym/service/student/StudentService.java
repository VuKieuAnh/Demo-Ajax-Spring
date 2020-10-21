package com.codegym.service.student;

import com.codegym.model.Student;
import com.codegym.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findOne(id);
    }

    @Override
    public void update(Student model) {
        studentRepository.save(model);
    }

    @Override
    public void save(Student model) {
        studentRepository.save(model);
    }

    @Override
    public void remove(Long id) {
        studentRepository.delete(id);
    }

    @Override
    public Iterable<Student> findAllByNameContaining(String name) {
        return studentRepository.findAllByNameContaining(name);
    }
}
