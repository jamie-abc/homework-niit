package com.example;
import com.example.Address;
public class Student {
    private String name;
    private Address address;
    public String getName(){
        return name;
    }
    public Address getAddress(){
        return address;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setAddress(Address address){
        this.address=address;
    }
    public void displayInfo(){
        System.out.println("Student name"+name);
        System.out.println("Student address"+address);
    }
}
