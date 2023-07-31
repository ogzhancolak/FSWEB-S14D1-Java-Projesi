package com.workintech.inheritance.model.developercompany;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer");
        setSalary(getSalary() + 2000);
    }
}
