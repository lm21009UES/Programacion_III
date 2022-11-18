
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        int numeroEntradas;
        Scanner entrada = new Scanner(System.in);
        Persona[] arrayPersona;
        System.out.println("CUANTOS REGISTROS DESEA ALMACENAR");
        numeroEntradas = entrada.nextInt();
        arrayPersona = new Persona[numeroEntradas];
        
        for(int i=0; i<arrayPersona.length; i++){
            arrayPersona[i] = new Persona();
            System.out.append("DIGITE LA EDAD");
            arrayPersona[i].edad = entrada.nextInt();
            System.out.println("INSERTE EL NOMBRE");
            arrayPersona[i].nombre = entrada.next();
            System.out.println("INSERTE EL TELEFONO");
            arrayPersona[i].telefono = entrada.next();
        }
        int menor = 100;
        int indice=0;
        for(int i=0; i<arrayPersona.length; i++){
            if(menor > arrayPersona[i].edad){
                menor = arrayPersona[i].edad;
                indice = i;
            }
        }
        arrayPersona[indice].mostrarInformacion();
        int contadorPersonas =0;
        for(int i=0; i<arrayPersona.length; i++){
            if(arrayPersona[i].edad>=30 && arrayPersona[i].edad<=50){
                contadorPersonas++;
            }
        }
        System.out.println("EL NUMERO DE PERSONAS ENTRE 30 Y 50 A ES: >"+contadorPersonas);
        for(int i=0; i<arrayPersona.length; i++){
            arrayPersona[i].mostrarInformacion();
        }
    }
    
}
