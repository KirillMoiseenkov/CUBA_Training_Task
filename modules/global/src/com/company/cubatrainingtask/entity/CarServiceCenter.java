package com.company.cubatrainingtask.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

@NamePattern("%s|name")
@Table(name = "CUBATRAININGTASK_CAR_SERVICE_CENTER")
@Entity(name = "cubatrainingtask$CarServiceCenter")
public class CarServiceCenter extends StandardEntity {
    private static final long serialVersionUID = 8405169547240925449L;

    @Column(name = "NAME", nullable = false, length = 100)
    protected String name;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "center")
    protected List<Employee> employers;

    @JoinTable(name = "CUBATRAININGTASK_CAR_SERVICE_CENTER_CITY_LINK",
        joinColumns = @JoinColumn(name = "CAR_SERVICE_CENTER_ID"),
        inverseJoinColumns = @JoinColumn(name = "CITY_ID"))
    @ManyToMany
    protected List<City> city;

    @Column(name = "PHONE", nullable = false)
    protected Integer phone;

    @Column(name = "ADRESS", nullable = false)
    protected String adress;

    public void setEmployers(List<Employee> employers) {
        this.employers = employers;
    }

    public List<Employee> getEmployers() {
        return employers;
    }


    public void setCity(List<City> city) {
        this.city = city;
    }

    public List<City> getCity() {
        return city;
    }


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

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }


}