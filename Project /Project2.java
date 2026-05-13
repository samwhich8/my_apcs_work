import processing.core.*;

public class Project2 extends PApplet {

    private static Block[][] tictactoe_board = new Block[3][3];

    private static final int SCENE_START = 0;
    private static final int SCENE_PLAY = 1;
    private static final int SCENE_END = 2;
    private int current = SCENE_START;

    private int currentPlayer = 1;
    private int winner = 0;


    private int btnX = 450, btnY = 450, btnW = 200, btnH = 70;
    private PFont TitleFont;

    public void settings() {
        size(900, 900);
    }

    public void setup() {
        TitleFont = createFont("ComicSansMS", 70);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int x = 300 * i;
                int y = 300 * j;
                tictactoe_board[i][j] = new Block(this, 0, x, y, 300, 300);
            }
        }
    }

    public void draw() {
        if (current == SCENE_START) {
            displayStart();
            return;
        }

        if (current == SCENE_END) {
            displayEnd();
            return;
        }

        background(0);
        
        // Draw the grid background
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int x = tictactoe_board[i][j].x;
                int y = tictactoe_board[i][j].y;
                int w = tictactoe_board[i][j].w;
                int h = tictactoe_board[i][j].h;

                fill(20, 150, 256);
                rectMode(CORNER);
                rect(x, y, w, h);
            }
        }

        // Display symbols and check values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tictactoe_board[i][j].displaySymbol(i, j);

                if (tictactoe_board[i][j].value == 1) {
                    stroke(20, 256, 180);
                } else if (tictactoe_board[i][j].value == 2) {
                    stroke(256, 3, 90);
                }
            }
        }
    }

    private void displayEnd() {
        background(0);

        textAlign(CENTER, CENTER);
        textFont(TitleFont);

        if (winner == 1) {
            fill(0, 255, 0);
            text("YOU WON!!!", width / 2, 250);
        } else if (winner == 2) {
            fill(255, 0, 0);
            text("YOU LOST!!", width / 2, 250);
        }

        // Replay Button
        fill(255, 182, 193);
        stroke(255, 105, 180);
        strokeWeight(3);
        rectMode(CENTER);
        rect(btnX, btnY, btnW, btnH, 12);

        fill(0);
        textSize(32);
        text("Replay", btnX, btnY);
    }

    private void displayStart() {
        background(0);

        fill(135, 206, 235);
        textAlign(CENTER, CENTER);
        textFont(TitleFont);
        text("Tic Tac Toe", width / 2, 250);

        // Play Button
        fill(5, 88, 250);
        stroke(99, 37, 180);
        strokeWeight(3);
        rectMode(CENTER);
        rect(btnX, btnY, btnW, btnH, 12);

        fill(0);
        textSize(32);
        text("PLAY", btnX, btnY);
    }

    public void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tictactoe_board[i][j].value = 0;
            }
        }
        winner = 0;
        currentPlayer = 1;
    }

    public void mousePressed() {
        // Handle Start Screen Click
        if (current == SCENE_START) {
            if (mouseX >= btnX - (btnW / 2) && mouseX <= btnX + (btnW / 2) &&
                mouseY >= btnY - (btnH / 2) && mouseY <= btnY + (btnH / 2)) {
                current = SCENE_PLAY;
            }
            return;
        }

        // Handle End Screen Click
        if (current == SCENE_END) {
            if (mouseX >= btnX - (btnW / 2) && mouseX <= btnX + (btnW / 2) &&
                mouseY >= btnY - (btnH / 2) && mouseY <= btnY + (btnH / 2)) {
                reset();
                current = SCENE_PLAY;
            }
            return;
        }

        // Handle Gameplay Click
        if (current == SCENE_PLAY) {
            int i = mouseX / 300;
            int j = mouseY / 300;

            if (i >= 0 && i < 3 && j >= 0 && j < 3) {
                if (tictactoe_board[i][j].value == 0) {
                    tictactoe_board[i][j].value = 1;
                    winner = checkforwinner(tictactoe_board);

                    if (winner == 0) {
                        cpuplay();
                        winner = checkforwinner(tictactoe_board);
                    }

                    if (winner != 0) {
                        current = SCENE_END;
                    }
                }
            }
        }
    }

    public void cpuplay() {
        // Try to win
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tictactoe_board[i][j].value == 0) {
                    tictactoe_board[i][j].value = 2;
                    if (checkforwinner(tictactoe_board) == 2) {
                        return;
                    }
                    tictactoe_board[i][j].value = 0;
                }
            }
        }

        // Otherwise, take the first available spot
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tictactoe_board[i][j].value == 0) {
                    tictactoe_board[i][j].value = 2;
                    return;
                }
            }
        }
    }

    public int checkforwinner(Block[][] blocks) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (blocks[i][0].value == blocks[i][1].value && 
                blocks[i][0].value == blocks[i][2].value && 
                blocks[i][0].value != 0) {
                return blocks[i][0].value;
            }
        }
        
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (blocks[0][j].value == blocks[1][j].value && 
                blocks[0][j].value == blocks[2][j].value && 
                blocks[0][j].value != 0) {
                return blocks[0][j].value;
            }
        }

        // Check diagonals
        if (blocks[0][0].value == blocks[1][1].value && 
            blocks[1][1].value == blocks[2][2].value && 
            blocks[0][0].value != 0) {
            return blocks[0][0].value;
        }
        
        if (blocks[2][0].value == blocks[1][1].value && 
            blocks[1][1].value == blocks[0][2].value && 
            blocks[2][0].value != 0) {
            return blocks[2][0].value;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Tic Tac Toe:");
        PApplet.main("Project2");
    }
}
