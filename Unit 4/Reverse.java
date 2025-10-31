public class Reverse{ 	
	public static void testReverse(String s, String expected){
		if (reverse(s).equals(expected)) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
	}

	public static String reverse(String s){
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) 
		{
			result = result + s.substring(i, i + 1);
		}
		return result;
	}

	public static void main(String[] args)
	{
		testReverse("robot", "tobor");               
		testReverse("Java", "avaJ");                 
		testReverse("12345", "54321");               	        
	}
}
