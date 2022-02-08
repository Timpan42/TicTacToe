import javax.swing.*;

public class gubbe {
    public static void main(String args[]){
    /* början fråga efter ett ord / ge ett random ord */
    /* spara ordet */
    String wordlist = JOptionPane.showInputDialog("what is your word");
    int trys = 0;
    int t = 0;

    /* della upp ordet var för sig */
    String[] leter = wordlist.split("");
    String[] under = new String[leter.length];

    /* vissa ordet för spelaren i form av _ _ _***** */
    for (int u = 0; u < leter.length; u++){
         under[u] = "_";
    }
    /* fråga spelare efter en bokstav*/
    /* spara bokstav*/
         String QuestionWord = JOptionPane.showInputDialog("Put your letter in");
         String lowWord = QuestionWord.toLowerCase();
         for (int i = 0; i < leter.length; i++) {
             if (lowWord.equals(leter[i])) {
                 System.out.print(i + " " + leter[i] + " ");
             } else {
                 System.out.print(under[i] + " ");
             }
         }



        /* kolar vilken bokstaven är sak*/

    /* om bokstav är rätt så vissas bokstaven av ordet. om fel, rita */

    /* gör så det inte går att skriva bokstaven igen*/

    /* vissa vad spelaren gisade */

    /* loppa*/

    /* fortsät tills spelaren van / förlorade */
    }
}
