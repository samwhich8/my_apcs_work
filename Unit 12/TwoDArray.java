public class TwoDArray
{
    public static void printDoubleArray(double[][] values)
    {
        for (int i=0; i<values.length; i++)
        {
            for (int j=0; j<values[i].length; j++)
            {
                System.out.print(values[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void printIntArray(int[][] values)
    {
        for (int i=0; i<values.length; i++)
        {
            for (int j=0; j<values[i].length; j++)
            {
                System.out.print(values[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void printStringArray(String[][] values)
    {
        for (int i=0; i<values.length; i++)
        {
            for (int j=0; j<values[i].length; j++)
            {
                System.out.print(values[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static double[][] createDiagonalArray()
    {
        double[][] result = new double[5][5];

        for (int i=0; i<5; i++)
        {
            for (int j=0; j<5; j++)
            {
                if (i == j)
                    result[i][j] = 2.0;
                else
                    result[i][j] = 0.0;
            }
        }

        return result;
    }

    public static int[][] createNumberRows()
    {
        int[][] result = new int[6][5];

        for (int i=0; i<result.length; i++)
        {
            for (int j=0; j<result[i].length; j++)
            {
                result[i][j] = i + 1;
            }
        }

        return result;
    }

    public static double[][] createDoublePattern()
    {
        double[][] result = new double[5][5];

        for (int i=0; i<result.length; i++)
        {
            for (int j=0; j<result[i].length; j++)
            {
                result[i][j] = (i + 1) * 10 + (j + 1);
            }
        }

        return result;
    }

    public static int smallest(int[][] values)
    {
        int smallest = values[0][0];

        for (int i=0; i<values.length; i++)
        {
            for (int j=0; j<values[i].length; j++)
            {
                if (values[i][j] < smallest)
                    smallest = values[i][j];
            }
        }

        return smallest;
    }

    public static float sum(float[][] values)
    {
        float total = 0;

        for (int i=0; i<values.length; i++)
        {
            for (int j=0; j<values[i].length; j++)
            {
                total += values[i][j];
            }
        }

        return total;
    }

    public static int countA(String[][] values)
    {
        int count = 0;

        for (int i=0; i<values.length; i++)
        {
            for (int j=0; j<values[i].length; j++)
            {
                if (values[i][j].startsWith("A"))
                    count++;
            }
        }

        return count;
    }

    public static double averagePerimeter(Rectangle[][] rects)
    {
        double sum = 0;
        int count = 0;

        for (int i=0; i<rects.length; i++)
        {
            for (int j=0; j<rects[i].length; j++)
            {
                sum += rects[i][j].getPerimeter();
                count++;
            }
        }

        return sum / count;
    }

    public static Rectangle largestArea(Rectangle[][] rects)
    {
        Rectangle biggest = rects[0][0];

        for (int i=0; i<rects.length; i++)
        {
            for (int j=0; j<rects[i].length; j++)
            {
                if (rects[i][j].getArea() > biggest.getArea())
                    biggest = rects[i][j];
            }
        }

        return biggest;
    }

    public static void main(String[] args)
    {
        System.out.println("Hello, 2D Arrays!\n");

        double[][] diagonal = createDiagonalArray();
        System.out.println("diagonal:");
        printDoubleArray(diagonal);

        String[][] words = {
            {"Apple", "Banana", "Cherry"},
            {"Dog", "Elephant", "Fox"}
        };

        System.out.println("words:");
        printStringArray(words);

        int[][] rows = createNumberRows();
        System.out.println("number rows:");
        printIntArray(rows);

        double[][] pattern = createDoublePattern();
        System.out.println("double pattern:");
        printDoubleArray(pattern);

        int[][] testInts = {
            {5, 3, 9},
            {4, -2, 8},
            {6, 1, 7}
        };

        System.out.println("smallest: " + smallest(testInts));
        System.out.println();

        float[][] testFloats = {
            {1.5f, 2.0f},
            {3.5f, 4.0f}
        };

        System.out.println("sum: " + sum(testFloats));
        System.out.println();

        String[][] testStrings = {
            {"Apple", "Banana", "Ant"},
            {"Dog", "Arrow", "Cat"}
        };

        System.out.println("count A: " + countA(testStrings));
        System.out.println();

        Rectangle[][] rects = {
            {new Rectangle("A", 2, 3), new Rectangle("B", 4, 5)},
            {new Rectangle("C", 1, 10), new Rectangle("D", 6, 2)}
        };

        System.out.println("average perimeter: " + averagePerimeter(rects));

        Rectangle biggest = largestArea(rects);
        System.out.println("largest area rectangle: " +
                           biggest.getName() + " " +
                           biggest.getArea());
    }
}

class Rectangle
{
    public Rectangle(String name, double width, double height)
    {
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public String getName() { return name; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }

    public double getPerimeter()
    {
        return 2 * width + 2 * height;
    }

    public double getArea()
    {
        return width * height;
    }

    private String name;
    private double width;
    private double height;
}
