import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.Timer;
import java.util.Random;
import java.util.TimerTask;
import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int NumPlayer;
//      NumPlayer =Integer.parseInt(  JOptionPane.showInputDialog("how many player in this game? Please enter between 3 and 10"));
        while (true) {
            try {
                NumPlayer = Integer.parseInt(JOptionPane.showInputDialog("how many player in this game? Please enter between 3 and 10"));
                if (NumPlayer < 3 || NumPlayer > 10) {
                    JOptionPane.showMessageDialog(null, "invalid input! how many player in this game? Please enter between 3 and 10");

                } else {
                    JOptionPane.showMessageDialog(null, "enjoy " + NumPlayer + " players game!!");
                    break;
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "invalid input! Please entre number ");

            }

        }
        int num = NumPlayer;



//        String player = JOptionPane.showInputDialog("Hello!! Please enter your name: ");
//        Color c = JColorChooser.showDialog(null, "Choose a color for your Light Cycle", Color.RED);
//        ArrayList<String> PlayerList;
        String PlayerList[] = new String[num];
        Color colors[] = new Color[num];


        for (int i=0; i < num; i++){
            String player = JOptionPane.showInputDialog("Hello!! Please enter your name: ");
            Color c = JColorChooser.showDialog(null, "Choose a color for your Light Cycle", Color.RED);

            PlayerList[i]= player ;
            colors[i] =(c);
        }


        //Create frame of game, game title
        JFrame frame = new JFrame("Light Cycle");

        Grid grid = new Grid();


        ScoreBoard scoreBoard = new ScoreBoard();
        frame.add(grid, BorderLayout.CENTER);
        frame.add(scoreBoard, BorderLayout.EAST);
        for (int x=0;x<num;x++){

            LightCycle light = new LightCycle(5, colors[x]);
            JLabel name1 = new JLabel("Name: " + PlayerList[x] + " | ");
            final JLabel scoreDisplay1 = new JLabel("Score: 50");

            scoreBoard.add(name1, BorderLayout.EAST);
            scoreBoard.add(scoreDisplay1, BorderLayout.EAST);
            light.getRandomStart();
            grid.addLightCycle(light);

        }



        frame.add(grid, BorderLayout.CENTER);




        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        }


}

