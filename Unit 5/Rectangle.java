public class Rectangle
{
    private double base;
    private double height;

    public Rectangle(double b, double h)
    {
        base = b;
        height = h;
    }

    public double getBase()
    {
        return base;
    }

    public double getHeight()
    {
        return height;
    }

    public double getArea()
    {
        return base * height;
    }

    public double getPerimeter()
    {
        return 2 * (base + height);
    }

    public double getDiagonal()
    {
        return Math.sqrt(base * base + height * height);
    }

    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(3.0, 4.0);

        System.out.print("Area expected: 12.0 result: " + r1.getArea() + " ");
        if (Math.abs(r1.getArea() - 12.0) < 1e-6)
            System.out.println("YAY!!!");
        else
            System.out.println("NO!!!");

        System.out.print("Perimeter expected: 14.0 result: " + r1.getPerimeter() + " ");
        if (Math.abs(r1.getPerimeter() - 14.0) < 1e-6)
            System.out.println("YAY!!!");
        else
            System.out.println("NO!!!");

        System.out.print("Diagonal expected: 5.0 result: " + r1.getDiagonal() + " ");
        if (Math.abs(r1.getDiagonal() - 5.0) < 1e-6)
            System.out.println("YAY!!!");
        else
            System.out.println("NO!!!");
    }
}
