package com.workintech.inheritance.model.calculation;

public class Circle {
    private double radius;

    public Circle() {
        this(0);
    }

    public Circle(double radius) {
        if(radius <= 0) {
            this.radius = 0;
        }else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
