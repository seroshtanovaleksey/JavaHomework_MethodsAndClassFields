package com.example.circle;

/**
 * Заполните этот класс в соответсвии с заданием из лекции.
 */
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        if(newRadius <= 0){
            throw new IllegalArgumentException("A cannot be less then 0");
        }
        this.radius = newRadius;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
}
