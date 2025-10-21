public class icyhot {
    public static void testicyhot(int temp1, int temp2, boolean expected){
		boolean result = icyhot(temp1,temp2);
		System.out.print("temp1:" + temp1 + ":" + temp2 + "temp2:" + "expected:" + expected + "result:" + result + " ");
		if (expected==result){
			  System.out.println("YIPPEE!!");
		}
		else {
		System.out.println("FAIL");
	}
		}
public static boolean icyhot(int temp1, int temp2) {
	if ((temp1<0 && temp2>100) || (temp1>100 && temp2<0)){
		return true;
	}
	else{
		return false;
	}
}
public static void main(String[] args){
	testicyhot(-1,-8,false);
	testicyhot(-8,128,true);
	testicyhot(110,14,false);
	testicyhot(108,-2,true);
}
}

