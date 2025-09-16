public class Fibonacci {
    public static void main(String[] args) {
        int terms = 30;

        int first = 1;
        int second = 1;

        System.out.println(first);
        System.out.println(second);

        for (int i = 3; i <= terms; i++) {
            int temp = first + second;
            System.out.println(temp);

            first = second;
            second = temp;
        }
    }
}
