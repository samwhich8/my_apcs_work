public class ReverseAll
{
    public static String reverse(String s)
    {
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        return reversed;
    }

    public static String[] reverseAll(String[] arr)
    {
        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = reverse(arr[i]);
        }

        return result;
    }

    public static void TestReverseAll(String[] expected, String[] arr)
    {
        String[] result = reverseAll(arr);

        for (int i = 0; i < arr.length; i++) {

            System.out.print(" expected: " + expected[i] +
                             " result: " + result[i] + " ");

            if (expected[i].equals(result[i]))
                System.out.println("YAY!!!");
            else
                System.out.println("NO!!!");
        }
    }

    public static void main(String[] args)
    {
        String[] test1 = {"abcd", "xyz"};
        String[] expected1 = {"dcba", "zyx"};

        String[] test2 = {"1234", "5678"};
        String[] expected2 = {"4321", "8765"};

        String[] test3 = {"racecar", "tacocat", "izzi"};
        String[] expected3 = {"racecar", "tacocat", "izzi"};

        TestReverseAll(expected1, test1);
        TestReverseAll(expected2, test2);
        TestReverseAll(expected3, test3);
    }
}
