package com.example.demo;

import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Employee {

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private Date dateStarted;
    private char middleInitial;
    private boolean isActive;

    Employee() {}

    Employee(String name, String lastName, char middleInitial, String birthday, String dateStarted, boolean isActive) {

        this.firstName = name;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.birthday = Date.from((LocalDate.parse(birthday)).atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.dateStarted = Date.from((LocalDate.parse(dateStarted)).atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.isActive = isActive;
    }

    public Long getId() {
        return this.id;
    }
    public String getName() { return this.firstName; }
    public String getLastName() {return this.lastName;}
    public char getMiddleInitial() {return this.middleInitial;}
    public Date getBirthday() {return this.birthday;}
    public Date getDateStarted() {return this.dateStarted;}
    public boolean getisActive() {return this.isActive;}

    public void setId(Long id) {
        this.id = id;
    }
    public void setFirstName(String name) {this.firstName = name; }
    public void setLastName(String name) {this.lastName = name; }
    public void setMiddleInitial(char middleInital) {this.middleInitial = middleInital; }
    public void setBirthday(Date birthday) {this.birthday = birthday; }
    public void setDateStarted(Date dateStarted){this.dateStarted = dateStarted;}
    public void setActive(boolean active){this.isActive = active;}


    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id)
                && Objects.equals(this.firstName, employee.firstName)
                && Objects.equals(this.lastName, employee.lastName)
                && Objects.equals(this.middleInitial, employee.middleInitial)
                && Objects.equals(this.dateStarted, employee.dateStarted)
                && Objects.equals(this.birthday, employee.birthday)
                && Objects.equals(this.isActive, employee.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.middleInitial, this.birthday, this.dateStarted, this.isActive);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.firstName+ " "+this.middleInitial+" "+this.lastName + '\'' + ", birthday ='" + this.birthday.toString() + '\'' +
                ", dateStarted ='" + this.dateStarted.toString() + '\''+ ", isActive ='" + this.isActive + '\''+'}';
    }
}