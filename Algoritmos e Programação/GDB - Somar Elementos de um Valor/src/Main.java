import java.util.Scanner;

public class Main
{
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        double valores[] = new double[s.nextInt()];
        for(int i=0;i<valores.length;i++){ valores[i] = s.nextDouble();};
        System.out.println(somaVetor(valores, valores.length-1));
    }

    public static double somaVetor(double valores[], int r){
        if(r == 0)
            return valores[r];
                else
                    return valores[r] + somaVetor(valores,r-1);
    }
}