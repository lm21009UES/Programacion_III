/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplodo;

import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class EjemploDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numDias;
        double kmRecorridos, precioFinal;
        String respuesta;
        do{
            Scanner entrada = new Scanner(System.in);
            System.out.println("INSERTE EL NUMERO DE DIAS DEL VIAJE");
            numDias = entrada.nextInt();
            System.out.println("INSERTE LA DISTANCIA A RECORRER");
            kmRecorridos = entrada.nextDouble();
            if(numDias>7 && kmRecorridos>800){
                precioFinal = kmRecorridos*2.5;
                precioFinal/=1.30;
            }
            else{
                precioFinal = kmRecorridos*2.5;
            }
        
            System.out.println("EL TOTAL A PAGAR ES DE: "+precioFinal);
            System.out.println("DESEA REPETIR EL PROCESO, ESCRIBA SI PARA CONTINUAR");
            respuesta = entrada.next();
        }while(respuesta.equalsIgnoreCase("si"));
            
    }
    
}
