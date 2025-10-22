public class backAround{ 
    public static void testbackAround(String str, String expected){
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
  String last = str.substring(str.length() - 1);
  return last + str + last;
    }
public static void main(String[] args){
	testbackAround("calculus", "scalculuss");
	testbackAround("kessner", "rkessnerr");
	testbackAround("tuesday", "ytuesdayy");
	testbackAround("englishessay", "yenglishessayy");
}
}




