import javax.swing.*;

public class Git_Arbete {
    public static  void main(String[] args){
        /** Fråga efter hur många numer */
        String numbers = JOptionPane.showInputDialog("How many numbers are you going to wright?");
            int x = Integer.parseInt("numbers");
            int y = 1;
        /** Fråga efter vilka numer */
        while (y>x);{
            String num = JOptionPane.showInputDialog("with number? For space " + y);
            int z = Integer.parseInt("num");


            y =y+1;
        }

    }
}
