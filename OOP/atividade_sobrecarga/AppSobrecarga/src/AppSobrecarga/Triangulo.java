package AppSobrecarga;

import javax.swing.JOptionPane;

public class Triangulo {
	
	private double base, altura;
	
	public Triangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double area(double base, double altura){
        return ((base*altura)/2);
    }
    
    
    public void exibe(){
    	JOptionPane.showMessageDialog(null, "A �rea do tri�ngulo de base = " +base +" e de altura = "+ altura +" vale: "+ area(base, altura), null, 1, null);
    }  
    
}
