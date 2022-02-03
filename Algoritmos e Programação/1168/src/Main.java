import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        String texto;
	        int n = sc.nextInt();
	        int [] vet = new int [n];
	        int led = 0;
	        
	        for(int i=0;i<n;i++){
	            texto = sc.next();
	           for(int j = 0; j < texto.length(); j++){
	               
	            if(texto.charAt(j) == '1')
	                led +=2;
	            if(texto.charAt(j) == '2' || texto.charAt(j) == '3' || texto.charAt(j) == '5')
	                led +=5;
	            if(texto.charAt(j) == '4')
	                led +=4;
	            if(texto.charAt(j) == '6' || texto.charAt(j) == '9' || texto.charAt(j) == '0')
	                led +=6;
	            if(texto.charAt(j) == '7')
	                led +=3;
	            if(texto.charAt(j) == '8')
	                led +=7;
	           }
	           int result = led;
	           vet[i] = result;
	           led = 0;
	        }
	        for(int i = 0; i < n; i++){
	            System.out.println(vet[i] +" leds");
	        }
	        sc.close();
	            
	    }
}

