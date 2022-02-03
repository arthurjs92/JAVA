import java.util.Scanner;

public class Main
{
    public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         String frase = sc.nextLine();
         String frasemod = frase.replace('a', '@');
         String frasemod2 = frasemod.replace('A', '@');
         System.out.println(frasemod2+"\n");
         String[] separa = frasemod2.split(" ");
         String palavra1 = separa[0];
         String palavra2 = separa[separa.length-1];
         if(separa.length<3) {
        	 System.out.println("Frase invalida.");
         }
         else if (palavra1.compareTo(palavra2) == 0) {
        	 System.out.println("palavra1 == palavra2");
         }
         else if (palavra1.compareTo(palavra2) < 0) {
        	 System.out.println("palavra1 < palavra2");
         }
         else if (palavra1.compareTo(palavra2) > 0) {
        	 System.out.println("palavra1 > palavra2");
         }  		 
    }
}