import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(mdc(x, y));
		sc.close();
	}
	
	public static long mdc(int x, int y) {
		if (y <= x && x % y == 0) {
			return y;
		}
		else if (x < y) {
			return mdc(y, x);
		}
		else (x >= y) {
			return mdc(y, x % y);
		}
	}

}
