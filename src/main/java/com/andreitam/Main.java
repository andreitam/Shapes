package com.andreitam;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Shape r = new Rectangle(2.0, 5.0);
        Shape s = new Square(3.0);
        Shape c = new Circle(5.0);
        Shape t = new RightTriangle(1.0, 2.0);
        Shape t2 = new Rectangle(10.0, 20.0);

        DrawingTool tool = new DrawingTool();
        tool.addShapes(r);
        tool.addShapes(s);
        tool.addShapes(c);
        tool.addShapes(t);
        // tool.addShapes(t2); //Illegal Argument Exception is thrown

        Double totalP = tool.totalPerimeter();
        Double totalS = tool.totalSurface();

        System.out.println("Total perimeter is: "+totalP+" and total surface is: "+totalS);

    }
}
