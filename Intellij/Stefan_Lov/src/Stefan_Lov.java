import javax.swing.*;


public class Stefan_Lov {
    public static void main(String[] args){
        String text = JOptionPane.showInputDialog("Vad vill du?");
        String onion = "";
        for(int i=0; i < text.length(); i++){
           onion += (char)(text.charAt(i) + 2);
        }
        System.out.print(onion);

        String ja = JOptionPane.showInputDialog("Whant to decode (yes/no)");
            if (ja == "yes") {
                for (int i = 0; i < text.length(); i++) {
                    onion += (char) (text.charAt(i) + 2);
                }
            }
            else (ja == "no"){

        }


        }
}

