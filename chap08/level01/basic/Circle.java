package com.kihongkim.level01.basic;

public class Circle extends Shape implements Resizable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * radius;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}
