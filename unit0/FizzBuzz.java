public class FizzBuzz
{
    public static void main(String[] args)
    {
        System.out.println("FizzBuzz");

        // initialization: int i=1
        // condition: i<31
        // update: i++

        // || means or
        // && means and

        for (int i=1; i<31; i++)
        {
                if (i%5==0 && i%3==0)
            {
                System.out.println("FizzBuzz");
            }
           else if (i%3 == 0)
            {
                System.out.println("Fizz");
            }
           else if (i%5 == 0)
            {
                System.out.println("Buzz");
            } 
        
            else
            {
                System.out.println(i);
            }
        }
    }
}
