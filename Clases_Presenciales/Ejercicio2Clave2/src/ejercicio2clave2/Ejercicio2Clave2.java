/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2clave2;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio2Clave2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Clientes arregloCliente[] = new Clientes[10];
        for(int i=0; i<arregloCliente.length; i++){
            arregloCliente[i] = new Clientes();
            System.out.println("INSERTE EL NOMBRE:");
            arregloCliente[i].nombre = entrada.next();
            System.out.println("INSERTE EL EDAD:");
            arregloCliente[i].edad = entrada.nextInt();
            System.out.println("INSERTE EL TELEFONO:");
            arregloCliente[i].telefono = entrada.next();
            System.out.println("INSERTE EL PESO:");
            arregloCliente[i].peso = entrada.nextDouble();
        }
        double pesoMayor = 0;
        int indice =0;
        for(int i=0; i<arregloCliente.length; i++){
            if(pesoMayor < arregloCliente[i].peso){
                pesoMayor = arregloCliente[i].peso;
                indice =i;
            }
        }
        System.out.println("LA PERSONA QUE MESA MAS ES:");
        arregloCliente[indice].mostrarClientes();
        
        int contador=0;
        for(int i=0; i<arregloCliente.length; i++){
            if(arregloCliente[i].peso <=53){
                contador++;
            }
        }
        System.out.println("EL NUMERO DE PERSONAS CON CONTEXTURA DELGADO ES: >> "+contador);
        System.out.println("******************************************");
        for(int i=0; i<arregloCliente.length; i++){
            arregloCliente[i].mostrarClientes();
        }
    }
    
}
