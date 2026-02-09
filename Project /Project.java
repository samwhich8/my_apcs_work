import processing.core.*; 

public class Project extends PApplet
{
      
      private static int[][] tictactoe_board = new int[3][3];
      
      private static final int SCENE_START = 0;
private static final int SCENE_PLAY  = 1;
private int current = SCENE_START;



private int currentPlayer = 1; 




private int btnX = 300, btnY = 430, btnW = 200, btnH = 70;

private PFont TitleFont;
      
      
       public void settings() // 4
    {
        size(800, 800);
       
        
    }
    public void setup()
{
    TitleFont = createFont("ComicSansMS", 70);
}

    public void draw()
    {
		if (current == SCENE_START) {
    displayStart();
    return;
    
}
          background(0);
        noStroke();
        //fill(50,40,250);
        ellipse(100, 100, 50, 50);
        ellipse(100, 400, 50, 50);
        ellipse(100, 700, 50, 50);   
        ellipse(400, 100, 50, 50);
        ellipse(400, 400, 50, 50);
        ellipse(400, 700, 50, 50);    
        ellipse(700, 100, 50, 50);
        ellipse(700, 400, 50, 50);
        ellipse(700, 700, 50, 50);    
        
        stroke(255,182,193);
		strokeWeight(4);
        line(250,0,250,800);
		line(550,0,550,800);
		line(0,250,800,250);
		line(0,550,800,550);
		
		
	
		
		
		
		
		
		for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {         
                   if(tictactoe_board[i][j]==0){		
					   fill(0);			               
                
                    
                  					
                 }  
                 
                  else if(tictactoe_board[i][j]==1){		
					   fill(44,161,247);			               
                   
                  					
                 }        
                  else{		
					   fill(40,241,194);			               
                   
                    
                  					
                 }     
                  ellipse(100+300*i, 100+300*j, 50, 50);    
            }
           
           
           
            
		}
		
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
    rect(btnX, btnY, btnW, btnH, 12);

    fill(0);
    textSize(32);
    text("PLAY", btnX + btnW/2, btnY + btnH/2);
}
public void mousePressed()
{
 
    if (current == SCENE_START) {
        if (mouseX >= btnX && mouseX <= btnX + btnW &&
            mouseY >= btnY && mouseY <= btnY + btnH) {
            current = SCENE_PLAY;
        }
        return;
    }

    if (current == SCENE_PLAY) {

        int i = mouseX / 250; 
        int j = mouseY / 250; 

       

      
        if (tictactoe_board[i][j] == 0) {
            tictactoe_board[i][j] = currentPlayer;

           
            currentPlayer = (currentPlayer == 1) ? 2 : 1;
            
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
	  
		
		if (tictactoe_board[p][q] == 0) {
			tictactoe_board[p][q] = player;
		}
		else {
			System.out.println("CAN'T TAKE THIS SPOT! ITS TAKEN!");
		
		
}
		
	}	 

    public static void createTicTacToeArray()
    {

        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {         
                    tictactoe_board[i][j] = 0;
            }
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

	public static int checkforwinner(){
		if(tictactoe_board[0][0] == tictactoe_board[0][1] &&  tictactoe_board[0][1] == tictactoe_board[0][2] && tictactoe_board[0][0] != 0) {
			return tictactoe_board[0][0];
		}
			
		if(tictactoe_board[0][0] == tictactoe_board[1][0] &&  tictactoe_board[1][0] == tictactoe_board[2][0] && tictactoe_board[0][0] != 0) {
			return tictactoe_board[0][0];
		}
		if(tictactoe_board[0][1] == tictactoe_board[1][1] &&  tictactoe_board[1][1] == tictactoe_board[2][1] && tictactoe_board[0][0] != 0) {
			return tictactoe_board[0][0];
		}
		if(tictactoe_board[0][2] == tictactoe_board[1][2] &&  tictactoe_board[1][2] == tictactoe_board[2][2] && tictactoe_board[0][0] != 0) {
			return tictactoe_board[0][0];
		}
		if(tictactoe_board[1][0] == tictactoe_board[1][1] &&  tictactoe_board[1][1] == tictactoe_board[1][2] && tictactoe_board[0][0] != 0) {
			return tictactoe_board[0][0];
		}
		if(tictactoe_board[2][0] == tictactoe_board[2][1] &&  tictactoe_board[2][1] == tictactoe_board[2][2] && tictactoe_board[0][0] != 0) {
			return tictactoe_board[0][0];
		}
		if(tictactoe_board[0][0] == tictactoe_board[1][1] &&  tictactoe_board[1][1] == tictactoe_board[2][2] && tictactoe_board[0][0] != 0) {
			return tictactoe_board[0][0];
		}
		if(tictactoe_board[2][0] == tictactoe_board[1][1] &&  tictactoe_board[1][1] == tictactoe_board[0][2] && tictactoe_board[0][0] != 0) {
			return tictactoe_board[0][0];
		}
			else{
				return 0;
			}
}
    public static void main(String[] args)
    {     
       
        System.out.println("Tic Tac Toe:");
             createTicTacToeArray();

        printStuff2(tictactoe_board);
        
	//UpdateTicTacToeBoard(0,0,1);
	//UpdateTicTacToeBoard(0,1,1);
	//UpdateTicTacToeBoard(0,2,1);
	
	//UpdateTicTacToeBoard(2,1,2);
	//UpdateTicTacToeBoard(2,1,1);
	
	int winner=checkforwinner();
	System.out.println("player " + winner );
	
	
		printStuff2(tictactoe_board);
		PApplet.main("Project"); 
    }
}
