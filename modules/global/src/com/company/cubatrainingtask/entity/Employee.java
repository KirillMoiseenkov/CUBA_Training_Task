package com.company.cubatrainingtask.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|firstName")
@Table(name = "CUBATRAININGTASK_EMPLOYEE")
@Entity(name = "cubatrainingtask$Employee")
public class Employee extends StandardEntity {
    private static final long serialVersionUID = -350996816371844898L;

    @Column(name = "FIRST_NAME", nullable = false, length = 100)
    protected String firstName;

    @Column(name = "LAST_NAME", nullable = false, length = 100)
    protected String lastName;

    @Temporal(TemporalType.DATE)
    @Column(name = "BITH_DATE", nullable = false)
    protected Date bithDate;

    @Column(name = "EMAIL", length = 100)
    protected String email;

    @Column(name = "SALARY", nullable = false, length = 20)
    protected String salary;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CENTER_ID")
    protected CarServiceCenter center;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setBithDate(Date bithDate) {
        this.bithDate = bithDate;
    }

    public Date getBithDate() {
        return bithDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setCenter(CarServiceCenter center) {
        this.center = center;
    }

    public CarServiceCenter getCenter() {
        return center;
    }


}