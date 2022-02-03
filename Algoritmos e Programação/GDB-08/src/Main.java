import java.util.Scanner;

public class Main
{
    public static void main(String args[]){
         Scanner s = new Scanner (System.in);
         String T = s.nextLine();
         String S = s.nextLine();
         int cont=0;
         String separa[] = T.split(" ");
         
         for(int i=0;i<separa.length;i++){
             if(separa[i].contains(S)){
                 cont++;
             }
         }
         System.out.println(cont);
    }
}