import javax.swing.*;

public class Server {
    public static void main(String[] args){
        int NumPlayer;
//      NumPlayer =Integer.parseInt(  JOptionPane.showInputDialog("how many player in this game? Please enter between 3 and 10"));
        while(true){
            try{
                NumPlayer =Integer.parseInt(  JOptionPane.showInputDialog("how many player in this game? Please enter between 3 and 10"));
                if(NumPlayer<3 || NumPlayer> 10){
                    JOptionPane.showMessageDialog(null,"invalid input! how many player in this game? Please enter between 3 and 10");

                }
                else{
                    JOptionPane.showMessageDialog(null,"enjoy "+NumPlayer +" players game!!");
                    break;
                }
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"invalid input! Please entre number ");

            }




        }


        Main.main(args);




    }


}

