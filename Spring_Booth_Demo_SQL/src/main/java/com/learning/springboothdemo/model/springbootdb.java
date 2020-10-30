package com.learning.springboothdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class springbootdb {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Name;
	@Column(unique = true)
	private String Email;
	private String Addr;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddr() {
		return Addr;
	}
	public void setAddr(String addr) {
		Addr = addr;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Addr=" + Addr + "]";
	}
	public springbootdb() {
		super();
		// TODO Auto-generated constructor stub
	}
	public springbootdb(int id, String name, String email, String addr) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Addr = addr;
	}
	
}
