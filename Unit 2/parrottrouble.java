public class parrottrouble {
    public static void testparrottrouble(boolean talking, int hour, boolean expected){
		boolean result = parrotTrouble(talking,hour);
		System.out.print("talking:" + talking + "hour:" + hour + "expected:" + expected + "result:" + result + " ");
		if (expected==result){
			  System.out.println("YIPPEE!!");
		}
		else {
		System.out.println("Oh no");
}		
		}
public static boolean parrotTrouble(boolean talking, int hour) {
	if ((hour<7||hour>20) && (talking)){
		return true;
	}
	else{
		return false;
	}
}
public static void main(String[] args){
	testparrottrouble(true,6,true);
	testparrottrouble(true,28,true);
	testparrottrouble(false,14,false);
	testparrottrouble(false,2,false);
	
}
}
