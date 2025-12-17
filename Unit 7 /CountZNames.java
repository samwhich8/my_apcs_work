public class CountZNames
{
    public static double CheckForZ(String[] values)
    {
        int total = 0;

        for (String item : values)
            if (item.startsWith("Z") || item.startsWith("z")) {
				total=total+item.length();
				}
        return total;
    }

    public static void TestZNames(String[] values, double expected)
    {
        double result = CheckForZ(values);

        for (String value : values)
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
        String[] values = {"Dr. Kessner", "Sam", "Mr. Witman"};
        String[] values2 = {"Zebra", "Zoo", "Zinc"};
        
        TestZNames(values, 0);
        TestZNames(values2, 12);
    }
}


