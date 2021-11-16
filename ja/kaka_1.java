import javax.swing.*; 
import java.lang.Math;


public class kaka_1 {
    public static void main(String[] args) {
		String summa = "";
		String a =	JOptionPane.showInputDialog("Välj tabell?");
		String b =	JOptionPane.showInputDialog("Välj start?");
		String c =	JOptionPane.showInputDialog("Välj antal?");

		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		int z = Integer.parseInt(c);
		int k = 0;
		
		
		        for (int i=1; i<=z; i++)
        {
            k = x * y;
            summa = summa + y + "*" + x + " = ";
            summa = summa + k + '\n';
            y++;
        }

			System.out.println(summa);

            
			
	}
}