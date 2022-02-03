import java.util.Scanner;
// String - Exercicio12 - (06/10) - Exercicio calculadora - Double.parseDouble e split
public class Main
{
    public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         String frase = sc.nextLine();
         String[] separa = frase.split(" ");
         double result;
         if(separa[0]=="" || separa[1]==""){
    	 System.out.println("Formula invalida.");
         }
         else if (separa[1].equals("+")) {
             result = Double.parseDouble(separa[0])+Double.parseDouble(separa[2]);
             System.out.println(result);
         }
         else if (separa[1].equals("*")) {
             result = Double.parseDouble(separa[0])*Double.parseDouble(separa[2]);
             System.out.println(result);
         }
         else if (separa[1].equals("-")) {
             result = Double.parseDouble(separa[0])-Double.parseDouble(separa[2]);
             System.out.println(result);
         }
         else if (separa[1].equals("/") && separa[2].equals("0")) {
        	 System.out.println("Formula invalida.");
         }
         else {
             result = Double.parseDouble(separa[0])/Double.parseDouble(separa[2]);
             System.out.println(result);
         }
    }
}