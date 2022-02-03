import java.util.Scanner;

public class Main
{
    public static void main(String args[]){
         Scanner s = new Scanner (System.in);
         String T = s.nextLine();
         int i, cont=0;
         String separa[] = T.split(" ");
         for(i=0;i<separa.length;i++) {
        	 String nova = separa[i];
        	 if(nova.length()>3) {
        		 System.out.println(nova.substring(0,3));
        	 }
         }
    }
}
