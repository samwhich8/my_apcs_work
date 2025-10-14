public class nearHundred{ 
    public static void main(String[] args){
		if (nearHundred(93)){
			  System.out.println("OK");
		}
		else {
		System.out.println("FAIL");
		}
		if (!nearHundred(-120)){
			  System.out.println("OK");
		}
		else {
		System.out.println("FAIL");
		}
		if (nearHundred(110)){
			  System.out.println("OK");
		}
		else {
		System.out.println("FAIL");
		}
	}
public static boolean nearHundred(int n){
  return ((Math.abs(100 - n) <= 10) ||
    (Math.abs(200 - n) <= 10));
    }
}
