package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Address extends Model {
    @Id
    private Long id;
    
    @Constraints.Required
    private String address;

    @OneToOne
    private Employee employee;

    public Address() {
    }

    public Address(Long id, String address, Employee employee) {
        this.id = id;
        this.address=address;
        this.employee=employee;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public void setEmployee(Employee employee){
        this.employee=employee;
    }
    public Employee getEmployee(){
        return this.employee;
    }

    public static Finder<Long, Address> find = new Finder<Long, Address>(Address.class);

    public static List<Address> findAll() {
        return Address.find.query().where().orderBy("id asc").findList();
    }

    

}