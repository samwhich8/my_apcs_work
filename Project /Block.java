import processing.core.*;

public class Block {
    public int value;
    public int x;
    public int y;
    public int w;
    public int h;
    private PApplet p;


    public Block(PApplet p, int value, int x, int y, int w, int h) {
        this.p = p;
        this.value = value;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    // Copy Constructor
    public Block(Block other) {
        this.p = other.p;
        this.value = other.value;
        this.x = other.x;
        this.y = other.y;
        this.w = other.w;
        this.h = other.h;
    }

    public void displaySymbol(int i, int j) {
        p.strokeWeight(10);
        
        int centerX = 150 + 300 * i;
        int centerY = 150 + 300 * j;
        int offset = 80;

        // Draw X for Player 1
        if (this.value == 1) {
            p.stroke(10, 250, 50); // Greenish
            p.line(centerX - offset, centerY - offset, centerX + offset, centerY + offset);
            p.line(centerX + offset, centerY - offset, centerX - offset, centerY + offset);
        } 
        // Draw O for Player 2
        else if (this.value == 2) {
            p.stroke(250, 10, 10); // Reddish
            p.noFill();
            p.ellipse(centerX, centerY, 200, 200);
        }
    }
}
