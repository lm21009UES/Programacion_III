
package ejericicio1_clave2;

import java.util.Scanner;

public class EJERICICIO1_CLAVE2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int datos[][] = new int[3][3];
        int vectorSuma[]= new int[3];
        
        for(int i=0;i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("DIGITE DATOS");
                datos[i][j] = entrada.nextInt();
            }
        }
        for(int i=0;i<3; i++){
            for(int j=0; j<3; j++){
                vectorSuma[i]+=datos[i][j];
            }
        }
        for(int i=0; i<3; i++){
            System.out.println("FILA >>"+i+" >> "+vectorSuma[i]);
        }
    }
    
}
