
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables
        int numDias;
        double kmRecorridos, precioFinal;
        String respuesta = "si";
        while(respuesta.equals("si")){
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
        }
        
    }
    
}
