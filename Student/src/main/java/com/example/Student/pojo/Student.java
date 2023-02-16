package com.example.Student.pojo;

import jakarta.persistence.*;

@Entity
@Table(name="Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="gender")
    private String gender;
    @Column(name="dept_id")
    private long departmentId;
    public Student(){

    }
    public Student(String firstName,String lastName,String gender,long departmentId){
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.departmentId=departmentId;
        this.gender=gender;

    }

    public long getDepartmentId() {
        return departmentId;
    }

    public long getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
