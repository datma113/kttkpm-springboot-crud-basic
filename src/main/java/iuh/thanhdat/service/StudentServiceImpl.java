package iuh.thanhdat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import iuh.thanhdat.entity.Student;
import iuh.thanhdat.repository.StudentRepository;

public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {		
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String deleteStudentById(int id) {
		studentRepository.deleteById(id);
		return "deleted id:" + id;
	}
	
	

}
