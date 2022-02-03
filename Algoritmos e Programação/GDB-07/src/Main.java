import java.util.Scanner;

public class Main
{
    public static void main(String args[]){
         Scanner s = new Scanner (System.in);
         String data = s.nextLine();
         String d = data.substring(0,2);
         System.out.println("Estamos no dia " + d + " do mes.");
    }
}
