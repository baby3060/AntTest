package com.anttest.model;

public class Employee implements ModelInterface{
	private String name;
	private int age;
	
	// Default Constructor
	public Employee() {}
	public Employee(String name) {
		this(name, 20);
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;	
	}
	
	/**
	 * Get Employee.Name 
	 * @return this.name
	 */
	public String getName() {
		return this.name;	
	}
	
	/**
	 * Get Employee.Age 
	 * @return this.age
	 */
	public int getAge() {
		return this.age;	
	}
	
	/**
	* Setting Name
	* @param name Employee Name
	*/
	public void setName(String name) {
		this.name = name;	
	}
	
	/**
	* Setting Age
	* @param age Employee Age
	*/
	public void setAge(int age) {
		this.age = age;	
	}
	
	public String toString() {
		return "Name : " + this.name + ", Age : " + this.age;	
	}
	
}