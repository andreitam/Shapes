package com.andreitam;

public class Rectangle extends Shape {
    private Double length;
    private Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public Double calculatePerimeter() {
        return 2*length+2*width;
    }

    @Override
    public Double calculateSurface() {
        return length*width;
    }
}
