public class Greetings{ 
    public static void testGreetings(String str, String expected){
		String result=backAround(str);
		System.out.print("str:" + str + "expected:" + expected + "result:" + result + " ");
		if (result.equals(expected)){
			  System.out.println("WOOHOO!");
		}
		else {
		System.out.println("SAD");
		}
	}
	
  public static String backAround(String str) {
  String start = "Hello, ";
  String end = ", how are you?";
  return start + str + end;
    }
public static void main(String[] args){
	testGreetings("Sally Mustang", "Hello, Sally Mustang, how are you?");
	testGreetings("Sam", "Hello, Sam, how are you?");
	testGreetings("Dr. Kessner", "Hello, Dr. Kessner, how are you?");
	testGreetings("Mr. Witman", "Hello, Mr. Witman, how are you?");
}
}
