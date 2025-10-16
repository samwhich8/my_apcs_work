public class Geometric
{
    public static void main(String[] args)
    {
	  int firstTerm = 3;  
        int ratio = 2;     
        int terms = 10;      

        int value = firstTerm; 
        for (int i = 1; i <= terms; i++) {
            System.out.println(value);
            value = value * ratio;
	}
}
} 



      
     
