import java.util.*;

class Shape
{
    public Shape(String name, int sides)
    {
        this.name = name;
        this.sides = sides;
    }

    public String getName() { return name; }
    public int getSides() { return sides; }

    private String name;
    private int sides;
}


class ShapeCollection
{
    public ShapeCollection()
    {
        shapes = new ArrayList<Shape>();
    }

    public void addShape(String name, int sides)
    {
        shapes.add(new Shape(name, sides));
    }

    public int numberOfSides(String shapeName)
    {
        for (Shape s : shapes)
        {
            if (s.getName().equals(shapeName))
                return s.getSides();
        }

        return -1;
    }

    public double averageSides()
    {
        double sum = 0;

        for (Shape s : shapes)
        {
            sum += s.getSides();
        }

        return sum / shapes.size();
    }

    public ArrayList<Shape> evenShapes()
    {
        ArrayList<Shape> result = new ArrayList<Shape>();

        for (Shape s : shapes)
        {
            if (s.getSides() % 2 == 0)
                result.add(s);
        }

        return result;
    }

    public void printShapes(ArrayList<Shape> list)
    {
        for (Shape s : list)
        {
            System.out.println(s.getName() + " " + s.getSides());
        }
        System.out.println();
    }

    private ArrayList<Shape> shapes;
}


public class ShapeCollectionTest
{
    public static void main(String[] args)
    {
        System.out.println("ShapeCollectionTest\n");

        ShapeCollection sc = new ShapeCollection();

        sc.addShape("Triangle", 3);
        sc.addShape("Square", 4);
        sc.addShape("Pentagon", 5);
        sc.addShape("Hexagon", 6);

        System.out.println("number of sides (Square): " +
                           sc.numberOfSides("Square"));

        System.out.println("average sides: " +
                           sc.averageSides());
        System.out.println();

        System.out.println("even shapes:");
        ArrayList<Shape> even = sc.evenShapes();
        sc.printShapes(even);

        if (sc.numberOfSides("Square") == 4)
            System.out.println("numberOfSides test passed");
        else
            System.out.println("numberOfSides test failed");

        if (sc.averageSides() == 4.5)
            System.out.println("averageSides test passed");
        else
            System.out.println("averageSides test failed");

        if (even.size() == 2 &&
            even.get(0).getName().equals("Square") &&
            even.get(1).getName().equals("Hexagon"))
            System.out.println("evenShapes test passed");
        else
            System.out.println("evenShapes test failed");
    }
}
