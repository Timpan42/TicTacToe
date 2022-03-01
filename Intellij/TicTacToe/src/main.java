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
}

