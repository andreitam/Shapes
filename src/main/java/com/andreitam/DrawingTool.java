package com.andreitam;

import java.util.ArrayList;
import java.util.List;

public class DrawingTool {
    private List<Shape> shapes = new ArrayList<>();
    private Double totalSurface=0.0;
    private Double totalPerimeter=0.0;

    public void addShapes(Shape s) {
        Integer type = 0; // 0-Shape, 1-Rectangle, 2-Square, 3-Circle, 4-RightTriangle
        if (s instanceof Rectangle) { type = 1; }
        else if (s instanceof Square) { type = 2; }
        else if (s instanceof Circle) { type = 3; }
        else if (s instanceof RightTriangle) { type = 4;}

        for (Shape shape: shapes) {
            if (shape instanceof Rectangle & type == 1) {
                throw new IllegalArgumentException("Rectangle already added");
            }
            if (shape instanceof Square & type == 2) {
                throw new IllegalArgumentException("Square already added");
            }
            if (shape instanceof Circle & type == 3) {
                throw new IllegalArgumentException("Circle already added");
            }
            if (shape instanceof RightTriangle & type == 4) {
                throw new IllegalArgumentException("Right triangle already added");
            }
        }

        shapes.add(s);
    }

    public Double totalPerimeter() {
        for (Shape shape: shapes) {
            totalPerimeter = totalPerimeter + shape.calculatePerimeter();
        }
        return totalPerimeter;
    }

    public Double totalSurface() {
        for (Shape shape: shapes) {
            totalSurface = totalSurface + shape.calculateSurface();
        }
        return totalSurface;
    }

}
