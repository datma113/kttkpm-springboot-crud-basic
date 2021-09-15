package iuh.thanhdat.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int lastname;
	private int firstname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLastname() {
		return lastname;
	}
	public void setLastname(int lastname) {
		this.lastname = lastname;
	}
	public int getFirstname() {
		return firstname;
	}
	public void setFirstname(int firstname) {
		this.firstname = firstname;
	}
	public Student() {
		super();
	}
	public Student(int lastname, int firstname) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
	}
	
	
}
