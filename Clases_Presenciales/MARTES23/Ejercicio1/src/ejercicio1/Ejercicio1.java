/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double[] Temperatura = new double[5];
        double promedio = 0.0;
        int diasMenor = 0;
        double temBuscar;
        boolean condicion = false;
        int opcion;
        for(int i=0; i<Temperatura.length;i++){
            System.out.println("INSERTE LA TEMPERATURA "+(i+1)+":");
            Temperatura[i] = entrada.nextDouble();
        }
        do{
            System.out.println("**********OPCIONES**************");
            System.out.println("PROMEDIO = 1");
            System.out.println("DIAS MENORES AL PROMEDIO = 2");
            System.out.println("BUSCAR = 3");
            System.out.println("SALIR = 4");
            opcion = entrada.nextInt();
            if(opcion ==1){
                for(double val : Temperatura){
                    promedio += val;
                }
                promedio = (promedio/5);
                System.out.println("PROMEDIO DE TEMPERATURA: "+promedio);
            }
            if(opcion == 2){
                for(double val : Temperatura){
                    if(val<promedio){
                        diasMenor++;
                    }
                }
                System.out.println("DIAS MENORES AL PROMEDIO: "+diasMenor);
            }
            if(opcion == 3){
                System.out.println("TEMPERATURA A BUSCAR:");
                temBuscar = entrada.nextDouble();
                for(int i=0;i<Temperatura.length;i++){
                    if(Temperatura[i] == temBuscar){
                        condicion = true;
                    }
                    else{
                        condicion = false;
                    }
                }
                if(condicion){
                    System.out.println("DATO ENCONTRADO");
                }
                else{
                    System.out.println("DATO NO ENCONTRADO");
                }
            }
            else if(opcion !=1 && opcion!=2 && opcion!=3 && opcion !=4){
                System.out.println("opcion no contemplada");
            }
        }while(opcion!=4);
    }
}
