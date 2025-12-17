public class CountLucky
{
    public static double CheckForSeven(double[] values)
    {
        int total = 0;

        for (double x : values)
            if (x%7 ==0 || x%10==7) {
				total++;
				}
        return total;
    }

    public static void TestCountLucky(double[] values, double expected)
    {
        double result = CheckForSeven(values);

        for (double value : values)
            System.out.print(value + " ");

        System.out.print(" expected: " + expected +
                           " result: " + result + " ");

        if (Math.abs(result-expected) < 1e-6) 
            System.out.println("YAY!!!");
        else if (Double.isNaN(expected) && Double.isNaN(expected))
            System.out.println("YAY!!!");
        else
            System.out.println("NO!!!");
    }

    public static void main(String[] args)
    {
        double[] values = {24, 207, 8};
        double[] values2 = {7, 700, 29};
        double[] values3 = {};
        
        TestCountLucky(values, 1);
        TestCountLucky(values2, 2);
        TestCountLucky(values3, Float.NaN);
    }
}


