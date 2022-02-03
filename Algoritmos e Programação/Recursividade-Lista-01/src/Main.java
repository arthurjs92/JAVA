import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(exp(x, n));
		sc.close();

	}
	
	public static long exp(int x, double n) {
		if (n == 0)
			return 1;
		else
			return x * exp(x, n-1);
	}

}
