class GoodDeal
{
    public static boolean GoodDeal(double originalPrice, 
                                   double salePrice)
    {
		if (salePrice < originalPrice * 0.75){
        return true;
	}
		else {
		return false;
	}   
    }

    public static void testGoodDeal(double originalPrice, 
                                    double salePrice,
                                    boolean expected)
    {
        boolean result = GoodDeal(originalPrice, salePrice);
        System.out.print("originalPrice:" + originalPrice + "salePrice:" + salePrice + "expected:" + expected + "result:" + " ");
        if (expected==result){
			System.out.println("YAY!");
		}
		else{
			System.out.println("NO");
		}
       
    }

    public static void main(String[] args)
    {
        testGoodDeal(100, 50, true);
        testGoodDeal(100, 80, false);
        testGoodDeal(100, 74, true);
        testGoodDeal(100, 75, false);
    }
}
