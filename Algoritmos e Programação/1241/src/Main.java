import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String x = "encaixa";
		String y = "nao encaixa";
		
		String vet [] = new String[N];

        for (int i = 0; i < N; i++) {
        	
            String A = sc.next();
            String B = sc.next();
            
            if(A.endsWith(B)) {
            	vet[i] = x;
            }
            else	vet[i] = y;
        }
        
        for(int i = 0; i < N;i++){   
            System.out.println(vet[i]);
        }

	}

}
