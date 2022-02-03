import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String texto;
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        while(a != 0 && b != 0){
            
            texto = Integer.toString(a + b);
            
            System.out.println(texto.replaceAll("0", ""));
            
            a = sc.nextInt();
            
            b = sc.nextInt();
        }
        sc.close();
	}

}
