public class icyhot {
    public static void main(String[] args){
		if (icyhot(120,-1)==true){
			  System.out.println("OK");
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
}

