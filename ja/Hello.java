import javax.swing.*; 
 

public class Hello { 
    public static void main(String[] args) {
		char c0;
		char c1;
		char c2;
		String C0;
		String C1;
		String C2;
		
		c0 = '\u00D8';
		c1 = '\u00F8';
		c2 = '\u03C0';
		C0 = "" + c0;
		C1 = "" + c1;
		C2 = "" + c2;
		JOptionPane.showMessageDialog(null, C0 + C1 + C2);
    } 
}

