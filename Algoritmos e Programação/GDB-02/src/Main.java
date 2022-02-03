import java.util.Scanner;
public class Main
{
    public static void custoVida(double custo, String cidade){
        if (cidade.equals("Uberlandia")){
            System.out.println("O custo de vida em Uberlandia e R$ "+ String.format("%.2f", custo));
        }
        else if (cidade.equals("Brasilia")){
            System.out.println("O custo de vida em Brasilia e R$ "+ String.format("%.2f", custo*2));
        }
        else  System.out.println("O custo de vida em " + cidade + " e R$ "+ String.format("%.2f", custo/2));
    }
    public static void main(String args[]){
         Scanner sc = new Scanner (System.in);
         double custo;
         String cidade;
         custo = sc.nextDouble();
         sc.nextLine(); 
         cidade = sc.nextLine();
         custoVida(custo, cidade);
         sc.close();
    }
}