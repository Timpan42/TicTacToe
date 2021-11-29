import javax.swing.*;


public class Stefan_Lov {
    public static void main(String[] args){
        String text = "abc";
        String textout = "";
        for(int i=0; i<3; i++){
           textout += (char)(text.charAt(i) + 2);
        }
        System.out.print(textout);
    }
}

