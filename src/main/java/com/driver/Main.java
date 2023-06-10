package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();

        rwOnly.setName("Sai");
        String name =  rwOnly.getName();
    }
  
}

/*
* private members of class cannot be accessed outside class.
* private member of class can be accessed only using getter and setter.
* */