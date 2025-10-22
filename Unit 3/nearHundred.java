public class nearHundred{ 
    public static void testnearHundred(int n, boolean expected){
		boolean result = nearHundred(n);
		System.out.print("n:" + n + "expected:" + expected + "result:" + result + " ");
		if (expected==result){
			  System.out.println("YIPPEE!!");
		}
		else {
		System.out.println("Oh no");
}	
	}
public static boolean nearHundred(int n){
  return ((Math.abs(100 - n) <= 10) ||
    (Math.abs(200 - n) <= 10));
    }
public static void main(String[] args){
	testnearHundred(10, false);
	testnearHundred(100, true);
	testnearHundred(98, true);
	testnearHundred(-8, false);
}
}
