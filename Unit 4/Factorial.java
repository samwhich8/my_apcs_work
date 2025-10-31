public class Factorial{ 	
	public static void testFactorial(int n, int expected){
		if (factorial(n) == expected) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
	}

	public static int factorial(int n){
		int result = 1;
		for (int i = 1; i <= n; i++)
		{
			result = result * i;
		}
		return result;
	}

	public static void main(String[] args)
	{
		testFactorial(0, 1);
		testFactorial(1, 1);
		testFactorial(2, 2);
		testFactorial(3, 6);
	}
}
