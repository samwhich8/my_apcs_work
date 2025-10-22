class isVampire
{
    public static boolean isVampire(float hour, boolean awake)
    {
		if(((hour>=6 && hour<=20) && (awake==true)) || ((hour<=6 && hour>=20) && (awake==false))){
        return true;
	}
		else {
		return false;
	}   
    }

    public static void testisVampire(float hour, boolean awake, boolean expected)
    {
        boolean result = isVampire(hour, awake);
        System.out.print("hour:" + hour + "awake:" + awake + "expected:" + expected + "result:" + " ");
        if (expected==result){
			System.out.println("YAY!");
		}
		else{
			System.out.println("NO");
		}
       
    }

    public static void main(String[] args)
    {
        testisVampire(8, true, true);
        testisVampire(19, true, true);
        testisVampire(24, false, false);
        testisVampire(5, false, false);
    }
}
