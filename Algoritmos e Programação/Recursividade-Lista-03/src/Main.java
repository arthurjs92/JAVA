import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(soma(n));
		sc.close();

	}
	
	public static int soma(int n) {
		if(n==0)
			return 0;
		else
			return soma(n-1) + n;
	}

}