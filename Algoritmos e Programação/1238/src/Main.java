import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        String[] entrada = new String[sc.nextInt()];
        sc.nextLine();
        
        for (int i = 0; i < entrada.length; i++) {

            entrada[i] = sc.nextLine();
        }
        
        for(int i = 0; i< entrada.length; i++){
            String saida = new String();
            String[] palavras = entrada[i].split(" ");
            char[] palavra = palavras[0].toCharArray();
            char[] palavra2 = palavras[1].toCharArray();
            
            for(int j=0; j< palavra.length + palavra2.length; j++){
                
                if(j < palavra.length){
                    saida = saida.concat(Character.toString(palavra[j]));
                }
                if(j< palavra2.length){
                    saida = saida.concat(Character.toString(palavra2[j]));
                }
            }
            System.out.println(saida);
        }
        
        sc.close();

	}

}
