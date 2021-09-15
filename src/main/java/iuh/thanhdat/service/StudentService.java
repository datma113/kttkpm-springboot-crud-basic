package iuh.thanhdat.service;

import java.util.List;

import org.springframework.stereotype.Service;

import iuh.thanhdat.entity.Student;

@Service
public interface StudentService {
	public Student addStudent(Student student);
	public List<Student> getAllStudents();
	public String deleteStudentById(int id);
}
