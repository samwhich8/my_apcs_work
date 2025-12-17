import processing.core.*; // 1


public class HelloProcessing extends PApplet // 2, 3
{
    public void settings() // 4
    {
        size(400, 400);
    }

    public void setup()
    {
        x = 0;        
    }

    public void draw()
    {
        background(0);
        ellipse(x, 200, 100, 50);
        x++;
    }

    private float x; // 2

    public static void main(String[] args)
    {
        PApplet.main("HelloProcessing"); // 5
    }
}
