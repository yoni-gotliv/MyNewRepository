package com.collections;

public class Student implements Comparable<Student>{

	public Integer age;
	public String firstName;
	public String lastName;
	
	public Student(Integer age, String firstName, String lastName) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int compareTo(Student st) {
		if (!this.firstName.equals(st.firstName)){
			return this.firstName.compareTo(st.getFirstName());
		}else {
			return this.age - st.age;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return ("First Name: " + firstName + ", Last Name: " + lastName + ", Age: " + age);
		return String.format("%s: %s: %d", firstName, lastName, age);
	}

	
}
