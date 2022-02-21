package gui;

import javax.swing.*;

public class Gui extends JFrame{
    private JPanel tic;
    private JButton button9;
    private JButton button1;
    private JButton button8;
    private JButton button7;
    private JButton button6;
    private JButton button5;
    private JButton button4;
    private JButton button3;
    private JButton button2;

    public Gui(){
        setContentPane(tic);
        setTitle("Nej");
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        Gui guiFrame = new Gui();

    }
}
