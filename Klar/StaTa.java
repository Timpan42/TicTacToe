import javax.swing.*; 
 

public class StaTa {
    public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Vill du veta priset av 'Arskort' eller en 'Biljet'");
		
		if (x.equals("arskort"))
			JOptionPane.showMessageDialog(null, "priset ar: 10,000 kr per year.");
		else if (x.equals("Arskort"))
			JOptionPane.showMessageDialog(null, "priset ar: 10,000 kr per year.");
		
		else if (x.equals("biljet"))
			JOptionPane.showMessageDialog(null, "En biljet kostar: 100 kr " + "\n" + "Om du kommer hit varge dag i ett year kosta det: 36,500 kr.");
		else if (x.equals("Biljet"))
			JOptionPane.showMessageDialog(null, "En biljet kostar: 100 kr " + "\n" + "Om du kommer hit varge dag i ett year kosta det: 36,500 kr.");

		else 
			JOptionPane.showMessageDialog(null, "You dident anser the question. I think you will regret doing that.");
			JOptionPane.showMessageDialog(null, "death will go to your door step.");
	}
}