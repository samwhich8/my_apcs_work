import processing.core.*; 

public class Project extends PApplet
{
     
       public void settings() // 4
    {
        size(300, 300);
    }

    public void draw()
    {
        background(0);
        fill(255,0,0);
        ellipse(50, 50, 50, 50);
        ellipse(50, 150, 50, 50);
        fill(255,0,0);
        ellipse(50, 250, 50, 50);   
        ellipse(150, 50, 50, 50);
        ellipse(150, 150, 50, 50);
        ellipse(150, 250, 50, 50);    
        ellipse(250, 50, 50, 50);
        ellipse(250, 150, 50, 50);
        ellipse(250, 250, 50, 50);   
         
    }

    public static void doStuff(int[][] values)
    {
        System.out.println("Hello, 2D Arrays!\n");

        System.out.println("values.length: " + values.length);
        System.out.println("values[0][0]: " + values[0][0]);
        System.out.println("values[2][1]: " + values[2][0]);
        // System.out.println("values[2][1]: " + values[2][1]); // array out of bounds exception
        System.out.println();

        System.out.println("values:");
        printStuff(values);
    }

    public static void printStuff(int[][] values)
    {
        // demonstration of a for loop to iterate through 2D array

        for (int i=0; i<values.length; i++) // for each row
        {
            // print the ith row

            for (int j=0; j<values[i].length; j++) 
            {
                System.out.print(values[i][j] + " "); // no newline
            }

            System.out.println(); // print a newline
        }

        System.out.println();
    }

    public static void printStuff2(int[][] values)
    {
        // demonstration of a for-each loop to iterate through 2D array

        for (int[] row : values) // for each row
        {
            for (int value : row) 
            {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
	
	public static int[][] UpdateTicTacToeBoard(int[][] board, int i, int j, int player)
	{
		board[i][j] = player;
		return board;
		
	}	 

    public static int[][] createTicTacToeArray()
    {

        int[][] result = new int[3][3];


        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {         
                    result[i][j] = 0;
            }
        }
        
        return result;
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

    public static void main(String[] args)
    {     
        int[][] tictactoe_board = createTicTacToeArray();
        System.out.println("Tic Tac Toe:");
        printStuff2(tictactoe_board);
        
		tictactoe_board=UpdateTicTacToeBoard(tictactoe_board,1,2,1);
		printStuff2(tictactoe_board);
		PApplet.main("Project"); 
    }
}
