import java.util.Scanner;

public class Main
{
    public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         String frase = sc.nextLine();
         char a = frase.charAt(0);
         char b = frase.charAt(frase.length()-1);
         
         if(frase.length()<5) {
        	 System.out.println("invalida");
         }
         else if (a == b) {
        	 System.out.println("iguais");
         }
         else System.out.println("diferentes");
         sc.close();
    }
}
