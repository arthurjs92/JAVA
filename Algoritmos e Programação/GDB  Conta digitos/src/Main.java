import java.util.Scanner;

public class Main
{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);       
        String N = s.next();       
        int d = s.nextInt();        
        System.out.println(contaDigitos(N,d,N.length()-1));
    }

    public static int contaDigitos(String N, int d, int pos){    	
    	if(pos < 0) {
    		return 0;
    	}
    	else {
    		if(N.charAt(pos)-48 == d) {
    			return 1 + contaDigitos(N,d,pos-1);
    		}
    		else {
    			return contaDigitos(N,d,pos-1);
    		}   		
    	}
    }
}