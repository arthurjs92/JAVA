import javax.swing.JOptionPane;

public class App {
	
	private static int le() {
		return Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
	}
	
	public static void menu() {
		int op, num1, num2;
		Operacoes calc;
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("    Menu\n1) Adicao\n2) Subtracao\n3) Multiplicacao\n4) Divisao\n5) Sair"));
			
			switch(op) {
			case 1 : 	num1 = le();
						num2 = le();
						calc = new Operacoes(num1, num2);
						JOptionPane.showMessageDialog(null,  "O resultado e: " + calc.adicao(),"Resultado", 1);
						break;
						
			case 2 : 	num1 = le();
						num2 = le();
						calc = new Operacoes(num1, num2);
						JOptionPane.showMessageDialog(null,  "O resultado e: " + calc.subtracao(),"Resultado", 1);
						break;
						
			case 3 : 	num1 = le();
						num2 = le();
						calc = new Operacoes(num1, num2);
						JOptionPane.showMessageDialog(null,  "O resultado e: " + calc.multiplicacao(),"Resultado", 1);
						break;
			
			case 4 : 	num1 = le();
						num2 = le();
						calc = new Operacoes(num1, num2);
						if(calc.validacao())
							JOptionPane.showMessageDialog(null,  "O resultado e: " + calc.divisao(),"Resultado", 1);
						else
							JOptionPane.showMessageDialog(null,  "Divisao por zero e impossivel","Resultado", 0);
						break;
			}

		}
		while(op != 5);
	}
	
	public static void main(String args[]) {
		menu();
	}
}



