/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploarrays;

import java.util.Scanner;


/**
 *
 * @author Administrador
 */
public class EjemploArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); //se declara una variable para leer entrada de datos
        int [] notas;
        notas = new int[5];
        notas[0] = 1;
        notas[1] = 2;
        notas[2] = 0;
        notas[3] = 6;
        notas[4] = 7;
        //RELLENAR DATOS DE VECTOR
        for(int i=0; i<notas.length; i++){
            System.out.println("INSERTE EL VALOR EN LA POSICIÓN "+i);
            notas[i]=entrada.nextInt();
        }
        //MOSTRAR LOS DATOS DEL VECTOR
        for(int i=0;i<notas.length;i++){
            System.out.println("["+i+"] => "+notas[i]);
        }
        
        for(int nota : notas){ //for each
            System.out.println("=> "+nota);
        }
    }
    
}
