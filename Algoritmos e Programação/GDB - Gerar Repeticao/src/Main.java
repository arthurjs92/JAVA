import java.util.Scanner;

public class Main
{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        System.out.println(geraRepeticao(s.next(), s.nextInt()));
    }

    public static String geraRepeticao(String t, int r){
              if(r==0) {
            	  return "";
              }
              else if (r==1)
            	  return t;
              else
            		  return t + "-" + geraRepeticao(t,r-1);
    }
}