package com.example.studentInfo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentData")
public class StudentInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name="sreg_num")
	private String reg_num;
	public StudentInformation(long id, String reg_num, String email, String name, int age, String state, String city) {
		super();
		this.id = id;
		this.reg_num = reg_num;
		this.email = email;
		this.name = name;
		this.age = age;
		this.state = state;
		this.city = city;
	}

	@Column(name="semail")
	private String email;
	@Column(name="sname")
	private String name;
	@Column(name="sage")
	private int age;
	@Column(name="sstate")
	private String state;
	@Column(name="scity")
	private String city;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getReg_num() {
		return reg_num;
	}

	public void setReg_num(String reg_num) {
		this.reg_num = reg_num;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "StudentInformation [id=" + id + ", reg_num=" + reg_num + ", email=" + email + ", name=" + name
				+ ", age=" + age + ", state=" + state + ", city=" + city + "]";
	}
	

}
