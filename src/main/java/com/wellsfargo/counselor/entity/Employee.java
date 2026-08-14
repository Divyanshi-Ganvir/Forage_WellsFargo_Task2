package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Employee {

    @Id
    @GeneratedValue()
    private long employeeId;

    @Column (nullable = false)
    private String name;

    @Column (nullable = false)
    private String email;

    @Column (nullable = false)
    private long phoneNumber;

    @Column (nullable = false)
    private String company;

    @Column (nullable = false)
    private String profession;

    protected Employee() {

    }

    public Employee(String name, String email, long phoneNumber, String company, String profession) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.company = company;
        this.profession = profession;
    }

    public long getEmployeeId() { return employeeId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public long getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(long phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getCompany() { return company; }

    public void setCompany(String company) { this.company = company; }

    public String getProfession() { return profession; }

    public void setProfession(String profession) { this.profession = profession; }
}

