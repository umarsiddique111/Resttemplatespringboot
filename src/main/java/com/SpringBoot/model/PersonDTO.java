package com.SpringBoot.model;

public class PersonDTO {
	
	
	private String firstName;
    private String secondName;
    private String profession;
    private int salary;
    private int id;
    public PersonDTO(String firstName, String secondName, String profession, int salary,int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.profession = profession;
        this.salary = salary;
        this.id = id;
    }
    public PersonDTO() {}
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    
    public String getProfession() {
        return profession;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}


