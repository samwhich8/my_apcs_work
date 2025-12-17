import java.util.*;

public class CountZNamesArrayList
{
    public static double CheckForZ(ArrayList<String> values)
    {
        int total = 0;

        for (String item : values)
            if (item.startsWith("Z") || item.startsWith("z")) {
				total=total+item.length();
				}
        return total;
    }

    public static void TestZNames(ArrayList<String> values, double expected)
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
        ArrayList<String> values = new ArrayList<String>();
        values.add("Dr. Kessner");
        values.add("Sam");
        values.add("Mr. Witman");
        
        
        ArrayList<String> values2 = new ArrayList<String>();
        values2.add("Zebra");
        values2.add("Zoo");
        values2.add("Zinc");
        
        
        TestZNames(values, 0);
        TestZNames(values2, 12);
    }
}


