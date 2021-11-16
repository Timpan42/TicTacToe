import javax.swing.*; 

public class kaka {
    public static void main(String[] args) {
		String summa = "";
		String a =	JOptionPane.showInputDialog("Välj tabell?");
		String b =	JOptionPane.showInputDialog("Välj start?");
		String c =	JOptionPane.showInputDialog("Välj antal?");

		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		int z = Integer.parseInt(c);
		int k = 0;
		
		
		while(y <= z){
			k = x * y;
			summa = summa + y + "*" + x + " = " + k + '\n';
			y = y + 1;
		}
			System.out.println(summa);

            
			
	}
}