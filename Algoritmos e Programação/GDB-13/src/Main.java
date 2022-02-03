import java.util.Scanner;
public class Main
{
	public static String cript(String entrada) {
		StringBuilder retorno = new StringBuilder();
		for(int i=0;i<entrada.length();i++) {
			char temp = entrada.charAt(i);
			if(temp != ' ') {
				if(i<entrada.length()/2) {
					temp +=3;
				}
				else {
					temp -=2;
				}
			}
			retorno.append(temp);
		}
		return retorno.toString();
	}
    public static void main(String args[]){
    	
         Scanner sc = new Scanner (System.in);
         
         String entrada = sc.nextLine();
         String saida = cript(entrada);
         System.out.println(saida);
         
         //System.out.println(cript(sc.nextLine()));
         
         sc.close();
    }
}