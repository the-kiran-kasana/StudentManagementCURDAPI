package example.StudentManagementCURDAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import example.StudentManagementCURDAPI.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
    
}
