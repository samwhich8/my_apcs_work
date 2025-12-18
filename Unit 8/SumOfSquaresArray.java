public class SumOfSquaresArray
{
    public static double sumOfSquares(double[] arr)
    {
        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * arr[i];
        }

        return sum;
    }

    public static void TestSumOfSquares(double expected, double[] arr)
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
        double[] test1 = {0.0};
        double[] test2 = {1.0, 2.0, 3.0};
        double[] test3 = {2.0, 2.0, 2.0};

        TestSumOfSquares(0.0, test1);
        TestSumOfSquares(14.0, test2);
        TestSumOfSquares(12.0, test3);
    }
}
