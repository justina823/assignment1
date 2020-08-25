
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import java.awt.Point;
import java.awt.*;
public class LightCycle {
    private int x,y;
    private int xDir, yDir;
    private final int VELOCITY = 5;
    private boolean alive = true;
    private ArrayList<Point> points = new ArrayList<Point>();
    private int size;
    private Color color;
    private static final Random random = new Random();
    LightCycle(int size, Color color) {
        x = 0;
        y = 0;
        xDir = VELOCITY;
        yDir = 0;
        this.size = size;
        this.color = color;
    }

    void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(x,y,size,size);

    }
    void getRandomStart(){
        x = size*random.nextInt(50);
        y = size*random.nextInt(50);
    }

}



