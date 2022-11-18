package ejemplojava2;

import java.util.Scanner;

/*
Determinar el preco del billete de ida y vuelta en avión,
conociendo la distancia a recorrer,
sabiendo que si el número de días de estancia es superior a 7 y 
la distancia superior a 800 km el billete tiene una reducción del 30%
El precio por km es de 2.5 dólares. Cree un programa en java que permita
realizar dicho cálculo
*/
public class EjemploJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables
        int numDias;
        double kmRecorridos, precioFinal;
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
    }
    
}
