import javax.swing.*;

public class gubbe {
    public static void main(String args[]){
    /* början fråga efter ett ord / ge ett random ord */
    /* spara ordet */
    String wordlist = "word";


    /* della upp ordet var för sig */
    String[] leter = wordlist.split("");

    /* gör boksäverna till ett tall*/

    /* vissa ordet för spelaren i form av _ _ _***** */

    /* fråga spelare efter en bokstav*/
    /* spara bokstav*/

    for (int i=0; i <= leter.length; i++) {
        String QuestionWord = JOptionPane.showInputDialog("Put your letter in");
        String lowWord = QuestionWord.toLowerCase();
        if (lowWord == leter[i]){
            System.out.print("true" + leter[i]);
        }

    }

        /* kolar vilken bokstaven är*/

    /* om bokstav är rätt så vissas bokstaven av ordet. om fel, rita */

    /* gör så det inte går att skriva bokstaven igen*/

    /* vissa vad spelaren gisade */

    /* loppa*/

    /* fortsät tills spelaren van / förlorade */
    }
}
