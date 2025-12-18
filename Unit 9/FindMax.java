public class FindMax
{
    public static double findMax(double[] arr)
    {
        double max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void TestFindMax(double expected, double[] arr)
    {
        double result = findMax(arr);

        System.out.print(" expected: " + expected +
                         " result: " + result + " ");

        if (Math.abs(result - expected) < 1e-6)
            System.out.println("YAY!!!");
        else
            System.out.println("NO!!!");
    }

    public static void main(String[] args)
    {
        double[] test1 = {1.0, 2.1, 5.3};
        double[] test2 = {-35.0, 90.1, 0.0, 6.7};
        double[] test3 = {-5.0, -2.0, -10.0};
        double[] test4 = {7.7};

        TestFindMax(5.3, test1);
        TestFindMax(90.1, test2);
        TestFindMax(-2.0, test3);
        TestFindMax(7.7, test4);
    }
}
