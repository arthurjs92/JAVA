import java.util.Scanner;

public class Main
{
    public static void main(String args[]){
         Scanner s = new Scanner (System.in);
         String s1 = s.nextLine();
         String s2 = s.nextLine();
         int inicio = s1.indexOf(s2);
         
         System.out.println(s1.substring(inicio));
    }
}