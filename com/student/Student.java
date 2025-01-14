package com.student;


public class Student {
	
	private int id;
	private String name;
	private String add;
	
	private Country con;

	public Student() {
		
	}

	public Student(int id, String name, String add, Country con) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.con = con;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public Country getCon() {
		return con;
	}

	public void setCon(Country con) {
		this.con = con;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + ", con=" + con + "]";
	}
	
	
}

