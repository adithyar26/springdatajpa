package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Emp")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eid;

    private String name;

    private int age;

    private int salary;

    @Column(name = "role")
    private String designation;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {

        return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + ", salary=" + salary + ", designation="
                + designation + "]";
    }
}
