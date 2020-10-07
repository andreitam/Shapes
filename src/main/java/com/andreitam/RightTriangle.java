package com.andreitam;

public class RightTriangle extends Shape {
    private Double base;
    private Double height;

    public RightTriangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public Double calculatePerimeter() {
        return base+height+Math.sqrt(base*base+height*height);
    }

    @Override
    public Double calculateSurface() {
        return (base*height)/2;
    }
}
