import java.util.ArrayList;

public class SumOfSquares
{
    public static double sumOfSquares(ArrayList<Double> arr)
    {
        double sum = 0.0;

        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i) * arr.get(i);
        }

        return sum;
    }

    public static void TestSumOfSquares(double expected, ArrayList<Double> arr)
    {
        double result = sumOfSquares(arr);

        System.out.print(" expected: " + expected +
                         " result: " + result + " ");

        if (Math.abs(result - expected) < 1e-6)
            System.out.println("YAY!!!");
        else
            System.out.println("NO!!!");
    }

    public static void main(String[] args)
    {
        ArrayList<Double> test1 = new ArrayList<Double>();
        test1.add(0.0);

        ArrayList<Double> test2 = new ArrayList<Double>();
        test2.add(1.0);
        test2.add(2.0);
        test2.add(3.0);

        ArrayList<Double> test3 = new ArrayList<Double>();
        test3.add(2.0);
        test3.add(2.0);
        test3.add(2.0);

        TestSumOfSquares(0.0, test1);
        TestSumOfSquares(14.0, test2);
        TestSumOfSquares(12.0, test3);
    }
}
