package AppSobrecarga;

import javax.swing.JOptionPane;

public class Quadrado {
	
	private double lado;
	
	public Quadrado (double lado) {
		this.lado = lado;
	}

	public double area(double lado){
        return (lado*lado);
    }
    
    public void exibe(){
    	JOptionPane.showMessageDialog(null, "A área do quadrado de lado = " + lado +" vale: "+ area(lado), null, 1, null);
    }  

}
