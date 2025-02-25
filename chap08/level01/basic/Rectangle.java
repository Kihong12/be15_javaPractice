package com.kihongkim.level01.basic;

public class Rectangle extends Shape implements Resizable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return (width * 2) + (height * 2);
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }
}
