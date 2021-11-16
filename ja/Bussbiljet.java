import javax.swing.*; 

public class Bussbiljet {
    public static void main(String[] args) {
		String ålder = JOptionPane.showInputDialog ("Hur gammal");
		double x = Double.parseDouble(ålder);
		
		if (x<=6){
			JOptionPane.showMessageDialog(null, "Gratis det blir.");
		}
		if(7<=x && x<=18){
			JOptionPane.showMessageDialog(null,"Du barn: Det blir 15 kr");
		}
		if(19<=x && x<=26){
			JOptionPane.showMessageDialog(null,"Du ungdom: Det blir 21 kr");
		}
		if(27<=x && x<=64){
			JOptionPane.showMessageDialog(null,"Du vuxen: Det blir 28 kr");
		}
		if(x>=65){
			JOptionPane.showMessageDialog(null,"Du gammal: Det blir 21 kr");
		};
		
		
	}
}