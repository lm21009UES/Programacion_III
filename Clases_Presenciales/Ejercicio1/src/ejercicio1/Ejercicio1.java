
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int arregloDatos[][];
        int m,n, sumatoria =0;
        System.out.println("INGRESE EL VALOR DE M");
        m= entrada.nextInt();
        System.out.println("INGRESE EL VALOR DE N");
        n = entrada.nextInt();
        arregloDatos = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0; j<n; j++){
                System.out.println("INSERTE EL VALOR DE LA CASILLA");
                arregloDatos[i][j]= entrada.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    sumatoria+=arregloDatos[i][j];
                }
            }
        }
        System.out.println("LA SUMATORIA ES: "+sumatoria);
    }
}
