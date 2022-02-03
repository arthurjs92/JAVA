
public class Operacoes {
	private int num1, num2;
	
	public Operacoes(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
	
	public int adicao() {
		return num1+num2;
	}
	
	public int subtracao() {
		return num1-num2;
	}
	
	public int multiplicacao() {
		return num1*num2;
	}

	public double divisao() {
		return ((double)num1)/((double)num2);
	}
	
	public boolean validacao() {
		if(num2==0)
			return false;
		 return true;
	}
}
