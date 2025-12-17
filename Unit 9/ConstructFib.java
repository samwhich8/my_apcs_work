public class ConstructFib
{
    public static double[] ConstructFib(int terms)
    {
      double[] Fib = new double[terms];
  
    if (terms==0){
		return Fib;
      }
       else if (terms==1){
		   Fib[0]=1;
		   return Fib;
       }
       else if (terms==2){
		   Fib[1]=1;
		   return Fib;
	   }
	  else {Fib[0]=1;
		  Fib[1]=1;

        for (int i = 2; i <s terms; i++) {
            Fib[i] = Fib[i-1] + Fib[i-2];
           }
           return Fib;
     
        }
	}

    public static void TestFib(double[] expected, int terms)
    {
        double[] result = ConstructFib(terms);

        for (int i=0; i<terms; i++){

        System.out.print(" expected: " + expected[i] +
                           " result: " + result[i] + " ");

        if (Math.abs(result[i]-expected[i]) < 1e-6) 
            System.out.println("YAY!!!");
        else
            System.out.println("NO!!!");
    }
}
    public static void main(String[] args)
    {
        double[] expected1 = {1, 1, 2};
        double[] expected2 = {1, 1, 2, 3, 5};
        
        TestFib(expected1, 3);
        TestFib(expected2, 5);
    }
}



