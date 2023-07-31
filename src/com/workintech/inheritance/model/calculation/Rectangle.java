package com.workintech.inheritance.model.calculation;

public class Rectangle {
    private double width;
    private double lenght;

    public Rectangle(double width, double lenght) {
        if(width <= 0 || lenght <= 0) {
            this.lenght = 0;
            this.width = 0;
        }else {
            this.lenght = lenght;
            this.width = width;
        }
    }

    public double getWidth() {
        return width;
    }

    public  double getLenght() {
        return lenght;
    }

    public double getArea() {
        return width * lenght;
    }
}
