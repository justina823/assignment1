
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
public class Grid extends JPanel{
    private int i = 0;
    private ArrayList<LightCycle> lightCycles = new ArrayList<LightCycle>();
    private static final Font font = new Font("Arial",Font.BOLD, 24);
    //constructor
    Grid() {
        setFocusable(true); // is false by default...
        setPreferredSize(new Dimension(600,600));
        setBackground(new Color(45, 45, 45));
        setBorder(BorderFactory.createLineBorder(Color.WHITE));
        setFocusable(true);
    }
    void addLightCycle(LightCycle lightCycle) {
        lightCycles.add(lightCycle);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(LightCycle lightCycle : lightCycles)
        {
            lightCycle.draw(g);
        }
    }
}
