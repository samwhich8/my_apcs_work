public class SumOfSquares
{ 	
	
	public static void testSumOfSquares(int n, int expected){
		if (SumOfSquares(n) == expected) {
		 System.out.println("success");
	}
		 else {
		 System.out.println("fail");
	 
}
}
	public static int SumOfSquares(int n){
		int sum = 0;
		for (int i=0; i<n+1; i++) 
		{
		sum = sum + i * i ;
	}
	return sum ;
}
    public static void main(String[] args)
    {
  
  	testSumOfSquares(2,5);
  	testSumOfSquares(3,14);
  	testSumOfSquares(4,30);
}
}
