package com.example.demo.student;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> existingStudent =
                studentRepository.findStudentByEmail(student.getEmail());

        if (existingStudent.isPresent()) {
            throw new IllegalArgumentException(
                    "Student with email " + student.getEmail() + " already exists");
        }

        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Student with id " + id + " does not exist");
        }
    }

    public void updateStudent(Long id, Student student) {
        if (studentRepository.existsById(id)) {
            student.setId(id);
            studentRepository.save(student);
        } else {
            throw new IllegalArgumentException("Student with id " + id + " does not exist");
        }
    }
}
