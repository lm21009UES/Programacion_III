/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplolistvector;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class EjemploListVector {

    public static List<Integer> numeros;
    public static List<Vehiculo> listaVehiculo;
    public static void main(String[] args) {
        // TODO code application logic here
        numeros = new ArrayList<Integer>();
        numeros.add(5);
        String respuesta;
        System.out.println("ESTE ES EL DATO > "+numeros.get(0));
        Scanner entrada = new Scanner(System.in);
        listaVehiculo.add(new Vehiculo("P232","TOTOTA","ROJO",90.00, true));
        listaVehiculo.add(new Vehiculo("P233","mrs","blanco",70.00, true));
        listaVehiculo.add(new Vehiculo("P234","Tt","negro",60.00, true));
        listaVehiculo.add(new Vehiculo("P235","mv","gris",50.00, true));
        do{
            Vehiculo vehiculoInsert = new Vehiculo();
            System.out.println("inserte la placa del vehiculo");
            vehiculoInsert.matricula = entrada.next();
            System.out.println("INSERTE EL COLOR DEL VEHICULO");
            vehiculoInsert.color = entrada.next();
            System.out.println("INSERTE EL MODELO DEL VEHICULO");
            vehiculoInsert.marca = entrada.next();
            System.out.println("INSERTE LA TARIFA");
            vehiculoInsert.tarifa = entrada.nextDouble();
            vehiculoInsert.disponible = true;
            listaVehiculo.add(vehiculoInsert);
            System.out.println("DESEA INSERTAR UN REGISTRO MAS \n S para si\n N para no");
            respuesta = entrada.next();
        }while(respuesta.equalsIngoreCase("S"));
        for(int i=0; i<listaVehiculo.size(); i++){
            System.out.println("REGISTRO EN LA POSICION > "+i);
            listaVehiculo.get(i).getAtributos();
        }
        System.out.println("*****************************************");
        int contador =0;
        for(Vehiculo itemVehiculo: listaVehiculo){
            System.out.println("REGISTRO EN LA POSICION > "+contador);
            itemVehiculo.getAtributos();
            contador++;
        }
    }
    
}
