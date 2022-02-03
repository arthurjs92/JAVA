import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int vet [] = new int[N];

        for (int i = 0; i < N; i++) {
        	
            String texto = sc.next();
            
            char a = texto.charAt(0);
            char b = texto.charAt(2);
            char c = texto.charAt(1);
            
            int m = Character.getNumericValue(a);
            int n = Character.getNumericValue(b);

            if (a == b) {
                vet[i] = m * n;
            } else if (c >= 'A' && c <= 'Z') {
                vet[i] = n - m;
            } else if (c >= 'a' && c <= 'z') {
                vet[i] = m + n;
            }
        }
        
        for(int i = 0; i < N;i++){   
            System.out.println(vet[i]);
        }
        
    }
}