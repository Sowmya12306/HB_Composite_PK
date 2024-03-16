package in.ineuron.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class StudentPKId implements Serializable{

	@Column(name ="id", length=2)
	private Integer rollno;

	@Column(name ="phone", length=10)
	private String mobile;

	public StudentPKId(Integer rollno, String mobile) {
		this.rollno = rollno;
		this.mobile = mobile;
	}

	public StudentPKId() {
	}

	@Override
	public String toString() {
		return "StudentPKId [rollno=" + rollno + ", mobile=" + mobile + "]";
	}



}
