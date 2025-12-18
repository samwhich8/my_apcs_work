import java.util.ArrayList;

public class FilterBadScores
{
    public static ArrayList<Integer> filterBadScores(ArrayList<Integer> scores)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) < 50) {
                result.add(scores.get(i));
            }
        }

        return result;
    }

    public static void TestFilterBadScores(ArrayList<Integer> expected, ArrayList<Integer> scores)
    {
        ArrayList<Integer> result = filterBadScores(scores);

        for (int i = 0; i < expected.size(); i++) {

            System.out.print(" expected: " + expected.get(i) +
                             " result: " + result.get(i) + " ");

            if (expected.get(i).equals(result.get(i)))
                System.out.println("YAY!!!");
            else
                System.out.println("NO!!!");
        }

        if (expected.size() == result.size())
            System.out.println("Size check: YAY!!!");
        else
            System.out.println("Size check: NO!!!");
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> test1 = new ArrayList<Integer>();
        test1.add(51);
        test1.add(49);
        test1.add(37);
        test1.add(100);

        ArrayList<Integer> expected1 = new ArrayList<Integer>();
        expected1.add(49);
        expected1.add(37);

        ArrayList<Integer> test2 = new ArrayList<Integer>();
        test2.add(92);
        test2.add(89);
        test2.add(90);
        test2.add(99);

        ArrayList<Integer> expected2 = new ArrayList<Integer>();

        TestFilterBadScores(expected1, test1);
        TestFilterBadScores(expected2, test2);
    }
}
