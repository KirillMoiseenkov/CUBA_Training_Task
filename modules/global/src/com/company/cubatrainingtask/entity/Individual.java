package com.company.cubatrainingtask.entity;

import javax.persistence.*;

import com.haulmont.chile.core.annotations.NamePattern;

import javax.validation.constraints.NotNull;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "CUBATRAININGTASK_INDIVIDUAL")
@Entity(name = "cubatrainingtask$Individual")
@NamePattern("%s|name")
public class Individual extends Customer {
    private static final long serialVersionUID = -4819744584537902941L;

    @NotNull
    @Column(name = "PASSPORT_NO", nullable = false, length = 10)
    protected String passportNo;

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getPassportNo() {
        return passportNo;
    }


}