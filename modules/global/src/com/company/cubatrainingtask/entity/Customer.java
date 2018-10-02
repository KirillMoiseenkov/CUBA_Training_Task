package com.company.cubatrainingtask.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.Inheritance;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;

@DiscriminatorValue("C")
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.JOINED)
@NamePattern("%s|name")
@Table(name = "CUBATRAININGTASK_CUSTOMER")
@Entity(name = "cubatrainingtask$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -6571337340734926173L;

    @Column(name = "NAME", nullable = false, length = 100)
    protected String name;

    @Column(name = "PHONE", nullable = false)
    protected Integer phone;

    @Column(name = "EMAIL", length = 100)
    protected String email;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


}