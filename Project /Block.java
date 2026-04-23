import processing.core.*; 
public class Block 
{
	public int value;
    public int x;
    public int y;
    public int w;
    public int h;
    private PApplet p;
    
    public Block(PApplet p, int value, int x, int y, int w, int h)
    {
		this.p = p;
        this.value = value;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
      }  
      
      
      public Block(Block other)
    {
		this.p = other.p;
        this.value = other.value;
        this.x = other.x;
        this.y = other.y;
        this.w = other.w;
        this.h = other.h;
      }  
    public void display_elipse(int i, int j){
	
	//System.out.println(this.value);
	
	     if(this.value==0){		
					   p.fill(0);			               
                
                    
                  					
                 }  
                 
                  else if(this.value==1){		
					   p.fill(44,161,247);			               
                   
                  
                    p.ellipse(150+300*i, 150+300*j, 50, 50);    					
                 }        
                  else{		
					   p.fill(40,241,194);			               
                   	
		
		
	                  p.ellipse(150+300*i, 150+300*j, 50, 50);    
		
		
    }

}
   
   
}
