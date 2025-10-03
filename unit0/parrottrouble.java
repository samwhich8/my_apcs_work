public class parrottrouble {
    public static void main(String[] args){
		if (parrotTrouble(true,6)==true ){
			  System.out.println("OK");
		}
		else {
		System.out.println("FAIL");
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
}
