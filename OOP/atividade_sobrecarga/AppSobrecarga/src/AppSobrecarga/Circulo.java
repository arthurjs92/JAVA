package AppSobrecarga;

import javax.swing.JOptionPane;

public class Circulo {
	
private double raio, xcentro, ycentro;
	
	public Circulo (double raio, double xcentro, double ycentro) {
		this.raio = raio;
		this.xcentro = xcentro;
		this.ycentro = ycentro;
	}
	
	public Circulo(double xcentro, double ycentro) {
		this.xcentro = xcentro;
		this.ycentro = ycentro;
	}
	
	public double area(double raio){
        return (Math.PI * Math.pow(raio, 2));
    }
	
	public double area(){
        return (Math.PI * Math.pow(raio, 2));
    }
	    
	public void exibe(double raio){
    	JOptionPane.showMessageDialog(null, "A ?rea do centro "+xcentro+", "+ycentro+" e raio = "+raio+" vale: "+ area(raio), null, 1, null);	    
    }  
	
	public void exibe(){
    	JOptionPane.showMessageDialog(null, "A ?rea do centro "+xcentro+", "+ycentro+" e raio = "+raio+" vale: "+ area(raio), null, 1, null);	    
    }  
}


