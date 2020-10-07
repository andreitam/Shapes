package com.andreitam;

public class Square extends Shape {
    private Double length;

    public Square(Double length) {
        this.length = length;
    }
    @Override
    public Double calculatePerimeter() {
        return 4*length;
    }

    @Override
    public Double calculateSurface() {
        return length*length;
    }
}
