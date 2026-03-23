import processing.core.*; 

public class Project2 extends PApplet
{
      
private static Block[][] tictactoe_board = new Block[3][3];
      
private static final int SCENE_START = 0;
private static final int SCENE_PLAY  = 1;
private int current = SCENE_START;

private static final int SCENE_END = 2;

private int currentPlayer = 1; 

private int winner = 0;






private int btnX = 450, btnY = 450, btnW = 200, btnH = 70;

private PFont TitleFont;
      
      
       public void settings() // 4
    {
        size(900, 900);
       
        
    }
    public void setup()
{
    TitleFont = createFont("ComicSansMS", 70);
}

    public void draw()
    {
		if (current == SCENE_START) 
		{
			displayStart();
              
		 for(int i = 0; i<3; i++)
		 {
			 for(int j= 0; j<3; j++)
			 {
				 
				 int x = 900/3 * i;
				 int y = 900/3 * j;
			
				 
				tictactoe_board[i][j] = new Block(this,0,x,y,300,300);
				
				
			 }
		 }   
			
			
		return;
    
	   }
	
       background(0); 
     for(int i = 0; i<3; i++)
     {
	 for(int j= 0; j<3; j++)
	 {
		//tictactoe_board[i][j].x; 
		 
      int x = tictactoe_board[i][j].x;
      int y = tictactoe_board[i][j].y;
      int w = tictactoe_board[i][j].w;
      int h = tictactoe_board[i][j].h;
      
      fill(69,20,64);
      rectMode(CORNER);
      rect(x,y,w,h); 
        
     }
 }   
        
        
        
        
        
        
        

		
		
		
		for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {         
                  tictactoe_board[i][j].display_elipse(i,j);
                  					
                    

            }          
		}
	if (current == SCENE_END) {
    displayEnd();
    return;	
   
    }
}
 private void displayEnd()

{
	
    background(0);

    fill(135, 206, 235);
    textAlign(CENTER, CENTER);
    textSize(70);
    textFont(TitleFont);
    text("Winner is player " + winner, width/2, 250);

  fill(255, 182, 193);
    stroke(255, 105, 180);
strokeWeight(3);
rectMode(CENTER);
    rect(btnX, btnY, btnW, btnH, 12);

    fill(0);
    textSize(32);
    text("Replay", btnX, btnY);

  
}
    private void displayStart()
    
{
	
    background(0);

    fill(135, 206, 235);
    textAlign(CENTER, CENTER);
    textSize(70);
    textFont(TitleFont);
    text("Tic Tac Toe", width/2, 250);

    fill(255, 182, 193);
    stroke(255, 105, 180);
strokeWeight(3);
rectMode(CENTER);
    rect(btnX, btnY, btnW, btnH, 12);

    fill(0);
    textSize(32);
    text("PLAY", btnX, btnY);
    
   
}
public void reset(){
	 for(int i = 0; i<3; i++)
     {
	 for(int j= 0; j<3; j++)
	 {
		
		tictactoe_board[i][j].value = 0;
 winner = 0; 
currentPlayer = 1;
checkforwinner();



	}
}
}
	 

public void mousePressed()
{
 
    if (current == SCENE_START) {
        if (mouseX >= btnX - (btnW)/2 && mouseX <= btnX + (btnW)/2 &&
           mouseY >= btnY - (btnH)/2 && mouseY <= btnY + (btnH)/2) {
			   

            current = SCENE_PLAY;
        } 
        return; 
	}
        if (current == SCENE_END) {
        if (mouseX >= btnX - (btnW)/2 && mouseX <= btnX + (btnW)/2 &&
           mouseY >= btnY - (btnH)/2 && mouseY <= btnY + (btnH)/2) {
				reset();
            current = SCENE_PLAY;
        }
        return;
	}
    

    if (current == SCENE_PLAY) {

        int i = mouseX / 300; 
        int j = mouseY / 300; 

       
System.out.println(i + " " +j);
      
        if (tictactoe_board[i][j].value == 0) {
            tictactoe_board[i][j].value = currentPlayer;

           
            currentPlayer = (currentPlayer == 1) ? 2 : 1;
            
            
		}
     checkforwinner();
	System.out.println("player winner" + winner );
	
	if(winner == 0){
		
		cpuplay();
	    currentPlayer = (currentPlayer == 1) ? 2 : 1;
	
}
	
	if(winner != 0){
	current = SCENE_END;
	
	
	
    }
    
}
}


   public static void doStuff(int[][] values)
    {
        System.out.println("Hello, 2D Arrays!\n");

        System.out.println("values.length: " + values.length);
        System.out.println("values[0][0]: " + values[0][0]);
        System.out.println("values[2][1]: " + values[2][0]);
        System.out.println();

        System.out.println("values:");
        printStuff(values);
    }

    public static void printStuff(int[][] values)
    {

        for (int i=0; i<values.length; i++) 
        {
         
            for (int j=0; j<values[i].length; j++) 
            {
                System.out.print(values[i][j] + " ");
            }

            System.out.println(); 
        }

        System.out.println();
    }

    public static void printStuff2(int[][] values)
    {
     

        for (int[] row : values) 
        {
            for (int value : row) 
            {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
	
	public static void UpdateTicTacToeBoard(int p, int q, int player)
	{
	  
		
		if (tictactoe_board[p][q].value == 0) {
			tictactoe_board[p][q].value = player;
		}
		else {
			System.out.println("CAN'T TAKE THIS SPOT! ITS TAKEN!");
		
		
}
		
	}	 

  


    public static int sum(int[][] values)
    {
        int total = 0;

        for (int[] row : values)
        {
            for (int value : row)
                total += value;
        }

        return total;
    }
    
    public void cpuplay(){
		 for (int i=0; i<tictactoe_board.length; i++) 
        {
         
            for (int j=0; j<tictactoe_board[i].length; j++) 
            {
			if(tictactoe_board[i][j].value == 0)
			 {
				tictactoe_board[i][j].value = 2;
			
			checkforwinner();
			return;
			
			}
			
		}
	
}
}
	public void checkforwinner(){
		 for (int i=0; i<3 ; i++) 
		 {
			 if(tictactoe_board[i][0].value == tictactoe_board[i][1].value &&  tictactoe_board[i][0].value == tictactoe_board[i][2].value && tictactoe_board[i][0].value != 0)
			 {
				 winner = tictactoe_board[i][0].value;
			 }
		}
		 if(tictactoe_board[0][0].value == tictactoe_board[1][1].value &&  tictactoe_board[1][1].value == tictactoe_board[2][2].value && tictactoe_board[0][0].value != 0)
		  {
			winner = tictactoe_board[0][0].value;
		}
		else if(tictactoe_board[2][0].value == tictactoe_board[1][1].value &&  tictactoe_board[1][1].value == tictactoe_board[0][2].value && tictactoe_board[2][0].value != 0)
		 {
			winner = tictactoe_board[2][0].value;
		}
	for (int j=0; j<3 ; j++) 
		 {
			 if(tictactoe_board[0][j].value == tictactoe_board[1][j].value &&  tictactoe_board[0][j].value == tictactoe_board[2][j].value && tictactoe_board[0][j].value != 0){
				 winner = tictactoe_board[0][j].value;
			 }
		 }
	 }
			

    public static void main(String[] args)
    {     
       
        System.out.println("Tic Tac Toe:");
            

    //printStuff2(tictactoe_board);
        
	//UpdateTicTacToeBoard(0,0,1);
	//UpdateTicTacToeBoard(0,1,1);
	//UpdateTicTacToeBoard(0,2,1);
	
	//UpdateTicTacToeBoard(2,1,2);
	//UpdateTicTacToeBoard(2,1,1);

	
	 
	
	 
	
		//printStuff2(tictactoe_board);
		PApplet.main("Project2"); 
    }
}
