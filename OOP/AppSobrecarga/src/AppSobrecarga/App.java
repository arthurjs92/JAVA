package AppSobrecarga;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		int op;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "             FIGURAS GEOM�TRICAS\n1 - C�rculo\n2 - Tri�ngulo\n3 - Quadrado\n4 - SAIR\nDIGITE A OP��O:", "Menu", 1));
			
			switch(op) {
			case 1 : 					
						Circulo c = new Circulo(4,6);
						c.exibe();
						Circulo circulo = new Circulo(3, 4, 5);
						circulo.exibe();
						break;
						
			case 2 : 													
						Triangulo t = new Triangulo(5,7);
						t.exibe();
						break;
						
			case 3 : 													
						Quadrado q = new Quadrado(6);
						q.exibe();
						break;
			
			}
		} while(op != 4);

	}
}
