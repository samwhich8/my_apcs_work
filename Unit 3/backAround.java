public class backAround{ 
    public static void main(String[] args){
		if (backAround("test").equals("ttestt")){
			  System.out.println("OK");
		}
		else {
		System.out.println("FAIL");
		}
		if (!backAround("cat").equals("tcat")){
			  System.out.println("OK");
		}
		else {
		System.out.println("FAIL");
		}
		if (backAround("sam").equals("msamm")){
			  System.out.println("OK");
		}
		else {
		System.out.println("FAIL");
		}
		System.out.println(backAround("sam"));
	}
	
  public static String backAround(String str) {
  String last = str.substring(str.length() - 1);
  return last + str + last;
    }
}




