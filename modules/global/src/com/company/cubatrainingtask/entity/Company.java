package com.company.cubatrainingtask.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@Table(name = "CUBATRAININGTASK_COMPANY")
@Entity(name = "cubatrainingtask$Company")
public class Company extends Customer {
    private static final long serialVersionUID = -6314676918430802422L;

    @NotNull
    @Column(name = "INN", nullable = false)
    protected Integer inn;

    public void setInn(Integer inn) {
        this.inn = inn;
    }

    public Integer getInn() {
        return inn;
    }


}