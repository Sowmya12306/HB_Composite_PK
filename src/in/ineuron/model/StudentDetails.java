package in.ineuron.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class StudentDetails implements Serializable{

	@EmbeddedId
	private StudentPKId student_Pk_id;
	
	private String name; 
	private Integer age;
	private String address;
	
	
	public StudentDetails() {
	}
	
	public StudentDetails(StudentPKId student_Pk_id, String name, Integer age, String address) {
		super();
		this.student_Pk_id = student_Pk_id;
		this.name = name;
		this.age = age;
		this.address = address;
	}


	@Override
	public String toString() {
		return "StudentDetails [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
