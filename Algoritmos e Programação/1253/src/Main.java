import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String retorno = "";
		
		int N = sc.nextInt();
		
		int vet[] = new int[N];
		
		String vet1[] = new String[50];
		
		for(int i=0;i<N;i++) {
			
			String texto = sc.next();
			
			vet[i] = sc.nextInt();
			
			for(int j=0; j<texto.length();j++) {
				char temp = texto.charAt(j);
				if(temp != ' ') {
					temp +=vet[i];
				}
				retorno += temp;
			}
			vet1[i] = retorno;
		}
		
        for(int i = 0; i < N;i++){   
            System.out.println(vet1[i]);
        }

	}

}
