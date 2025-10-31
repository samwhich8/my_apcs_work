public class CountO{ 	
	public static void testCountO(String text, String pattern, int expected){
		if (countO(text, pattern) == expected) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
	}

	public static int countO(String text, String pattern){
		int count = 0;
		int index = 0;

		while ((index = text.indexOf(pattern, index)) != -1)
		{
			count++;
			index = index + 1;   
		}

		return count;
	}

	public static void main(String[] args)	{
		testCountO("banananana", "na", 4);
		testCountO("aaaaa", "aa", 4);
		testCountO("hello", "z", 0);
	}
}
