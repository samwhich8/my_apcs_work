public class attention{ 
    public static void testattention(String str, boolean expected){
		boolean result =attention(str);
		System.out.print("str:" + str + "expected:" + expected + "result:" + result + " ");
		if (result == expected){
			  System.out.println("WOOHOO!");
		}
		else {
		System.out.println("SAD");
		}
	}
	
  public static boolean attention(String str) {
	String first = str.substring(0,9);
	System.out.println(first);
	return first.equals("Hey, you!"); 
    }
public static void main(String[] args){
	testattention("Hi! My name is Sam", false);
	testattention("Hey, you! You can't have my code!", true);
	testattention("Hello, it's an amazing Tuesday", false);
	testattention("Hey, you! Help me with math", true);
}
}
