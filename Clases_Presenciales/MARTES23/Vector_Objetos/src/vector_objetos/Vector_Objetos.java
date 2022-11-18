/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector_objetos;

/**
 *
 * @author Administrador
 */
public class Vector_Objetos {

    public static Vehiculo[] vectorVehiculos;
    public static void main(String[] args) {
        // TODO code application logic here
        vectorVehiculos = new Vehiculo[2];
        for(int i = 0; i<vectorVehiculos.length;i++){
            vectorVehiculos[i] = new Vehiculo();
            vectorVehiculos[i].placa = "P227-8";
            vectorVehiculos[i].color = "Blanco";
            vectorVehiculos[i].modelo = "PIKUP";
            vectorVehiculos[i].marca = "NISSAN";
            vectorVehiculos[i].tarifa = 50.00;
            vectorVehiculos[i].disponibilidad = true;
            vectorVehiculos[i].capacidad = 4;
        }
        for(int j=0; j<vectorVehiculos.length; j++){
            System.out.println("************************************");
            vectorVehiculos[j].ImprimirDatos();
        }
        for(Vehiculo var : vectorVehiculos){
            System.out.println("************************************");
            var.ImprimirDatos();
        }
        for(Object vehiculo : vectorVehiculos){
            Vehiculo vehiculoTemp = (Vehiculo)vehiculo;
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
            vehiculoTemp.ImprimirDatos();
        }
    }
    
}
