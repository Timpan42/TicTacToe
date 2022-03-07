import javax.swing.*;
import java.util.Scanner;

public class main {

    public static void main(String args[]) {

        char[][] bord = new char[3][3];

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++) {
                bord[i][j] = '-';
            }
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Let's a go, Tic Tac Toe of deaf?");
        System.out.print("Player 1, your name plez? ");
        String p1 = in.nextLine();
        System.out.print("Player 2, your name plez? ");
        String p2 = in.nextLine();

        boolean player1 = true;
        boolean gameEnded = false;

        while (!gameEnded){
            drawBorde(bord);
            if (player1){
                System.out.println(p1 + "'s Turn (x):");
            } else {
                System.out.println(p2 + "'s Turn (o):" );
            }
            char c = '-';
            if (player1) {
                c = 'x';
            } else {
                c = 'o';
            }
            int x_led = 0;
            int y_led = 0;

            while (true) {
                System.out.print("Enter a row number (0, 1, or 2): ");
                x_led = in.nextInt();
                System.out.print("Enter a column number (0, 1 or 2): ");
                y_led = in.nextInt();
                if (x_led < 0 || x_led > 2 || y_led < 0 || y_led > 2){
                    System.out.println("your cheating peace of s*it. try again");
                } else if (bord[x_led][y_led] != '-'){
                    System.out.println("Wrong move do a again");
                } else {
                    break;
                }
            }
            bord[x_led][y_led] = c;

            if (playerWon(bord) == 'x'){
                System.out.println(p1 + " Has won. " + p2 + " bad!");
                gameEnded = true;
            } else if (playerWon(bord) == 'o'){
                System.out.println(p2 + " Has won. " + p1 + " bad!");
                gameEnded = true;
            } else {
                if (gameTie(bord)){
                    System.out.println("How did a tie happen?");
                    gameEnded = true;
                } else {
                    player1 = !player1;
                }
            }
        }
        drawBorde(bord);
    }

    public static void drawBorde(char[][] bord) {
        System.out.println("bord:");
        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord[i].length; j++){
                System.out.print(bord[i][j]);
            }
            System.out.println();
        }
    }

    public  static char playerWon(char[][] bord){
        for (int i=0; i< bord.length; i++){
         boolean ix_ledd= true;
         char value = bord[i][0];
         if (value == '-'){
             ix_ledd = false;
         } else {
             for (int j=1; j< bord.length; j++) {
                 if (bord[i][j] != value) {
                     ix_ledd = false;
                     break;
                     }
                }
            }
         if (ix_ledd){
             return value;
         }
        }

        for (int j=0; j< bord.length; j++){
            boolean iy_ledd= true;
            char value = bord[0][j];
            if (value == '-'){
                iy_ledd = false;
            } else {
                for (int i=1; i< bord.length; i++) {
                    if (bord[i][j] != value) {
                        iy_ledd = false;
                        break;
                    }
                }
            }
            if (iy_ledd){
                return value;
            }
        }
        boolean diagonal1 = true;
        char value1 =bord[0][0];

        if (value1 == '-'){
            diagonal1 = false;
        } else {
            for (int i = 1; i<bord.length; i++){
                if (bord[i][i] != value1){
                    diagonal1 = false;
                    break;
                }
            }
        }
        if (diagonal1){
            return value1;
        }

        boolean diagonal2 = true;
        char value2 =bord[0][bord.length-1];

        if (value2 == '-'){
            diagonal2 = false;
        } else {
            for (int i = 1; i<bord.length; i++){
                if (bord[i][bord.length-1-i] != value2){
                    diagonal2 = false;
                    break;
                }
            }
        }
        if (diagonal2){
            return value2;
        }
        return ' ';
    }

    public static boolean gameTie(char[][] bord){
        for (int i = 0; i < bord.length; i++){
            for (int j = 0; j < bord.length; j++){
                if (bord[i][j] =='-'){
                    return false;
                }
            }
        }
        return true;
    }
}

