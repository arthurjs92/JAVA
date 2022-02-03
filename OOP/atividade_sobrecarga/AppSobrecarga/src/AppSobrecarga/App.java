package AppSobrecarga;

import java.util.Locale;
import javax.swing.JOptionPane;


public class App {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Locale.setDefault(Locale.US);
			int opcao_menu;
			
			do {
				opcao_menu =Integer.parseInt( JOptionPane.showInputDialog("    Menu\n1 - Círculo\n2 - Triângulo\n3 - Quadrado\n4) SAIR"));
				switch (opcao_menu) {
					case 1:
						Circulo circulo = new Circulo(6, 8);
						circulo.exibe(5);
						Circulo circulo2 = new Circulo(5, 6, 8);
						circulo2.exibe();
						break;
					case 2:
						Triangulo triangulo = new Triangulo(4, 6);
						triangulo.exibe();
						break;
					case 3:
						Quadrado quadrado = new Quadrado(5);
						quadrado.exibe();
						break;
				}
			}while(opcao_menu != 4);
		}

	}
