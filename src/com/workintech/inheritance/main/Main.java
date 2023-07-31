package com.workintech.inheritance.main;

import com.workintech.inheritance.model.calculation.Circle;
import com.workintech.inheritance.model.calculation.Cuboid;
import com.workintech.inheritance.model.calculation.Cylinder;
import com.workintech.inheritance.model.calculation.Rectangle;
import com.workintech.inheritance.model.developercompany.HRManager;
import com.workintech.inheritance.model.developercompany.JuniorDeveloper;
import com.workintech.inheritance.model.developercompany.MidDeveloper;
import com.workintech.inheritance.model.developercompany.SeniorDeveloper;

public class Main {
    public static void main(String[] args) {
        //Silindir Hesaplama

        System.out.println("\nSİLİNDİR HESAPLAMA\n");

        Circle circle = new Circle(3.75);

        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.println("Circle Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("Cylinder Radius: " + cylinder.getRadius());
        System.out.println("Cylinder Height: " + cylinder.getHeight());
        System.out.println("Cylinder Area: " + cylinder.getArea());
        System.out.println("Cylinder Volume: " + cylinder.getVolume());

        System.out.println("\nHAVUZ ALANI HESAPLAMA\n");

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("Rectangle Width: " + rectangle.getWidth());
        System.out.println("Rectangle Lenght: " + rectangle.getLenght());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);

        System.out.println("Cuboid Width: " + cuboid.getWidth());
        System.out.println("Cuboid Lenght: " + cuboid.getLenght());
        System.out.println("Cuboid Area: " + cuboid.getArea());
        System.out.println("Cuboid Height: " + cuboid.getHeight());
        System.out.println("Cuboid Volume: " + cuboid.getVolume());

        System.out.println("\nDEVELOPER COMPANY\n");

        HRManager hrManager = new HRManager(1, "Doğancan Kınık", 5000);

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(2,"Oğuzhan",1000);
        MidDeveloper midDeveloper = new MidDeveloper(3,"Emre", 2500);
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(4, "Serkan", 3000);

        hrManager.addEmployee(juniorDeveloper);
        hrManager.addEmployee(midDeveloper);
        hrManager.addEmployee(seniorDeveloper);

        System.out.println("HR Manager: " + hrManager.getName() + ", Salary: " + hrManager.getSalary());
        System.out.println("Junior Developer: " + juniorDeveloper.getName() + ", Salary: " + juniorDeveloper.getSalary());
        System.out.println("Mid Developer: " + midDeveloper.getName() + ", Salary: " + midDeveloper.getSalary());
        System.out.println("Senior Developer: " + seniorDeveloper.getName() + ", Salary: " + seniorDeveloper.getSalary() + "\n");

        hrManager.work();
        juniorDeveloper.work();
        midDeveloper.work();
        seniorDeveloper.work();

        //Salary Uptaded
        System.out.println("\nHR Manager uptaded salary: " + hrManager.getSalary());
        System.out.println("Junior Developer uptaded salary: " + juniorDeveloper.getSalary());
        System.out.println("Mid Developer uptaded salary: " + midDeveloper.getSalary());
        System.out.println("Senior Developer uptaded salary: " + seniorDeveloper.getSalary());
    }
}