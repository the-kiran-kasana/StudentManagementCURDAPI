package example.StudentManagementCURDAPI.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import example.StudentManagementCURDAPI.model.Student;
import example.StudentManagementCURDAPI.repository.StudentRepository;

@Service
public class StudentService {
    

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        // Implement update logic based on your requirements
        return studentRepository.save(updatedStudent);
    }
}
