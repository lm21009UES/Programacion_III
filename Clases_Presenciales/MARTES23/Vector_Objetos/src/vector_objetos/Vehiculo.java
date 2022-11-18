/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vector_objetos;

/**
 *
 * @author Administrador
 */
public class Vehiculo {
    public String placa;
    public String color;
    public String modelo;
    public String marca;
    public double tarifa;
    public boolean disponibilidad;
    public int capacidad;

    public Vehiculo() {
    }
    
    public void ImprimirDatos(){
        System.out.println("PLACA => "+this.placa);
        System.out.println("COLOR => "+this.color);
        System.out.println("MODELO => "+this.modelo);
        System.out.println("MARCA => "+this.marca);
        System.out.println("TARIFA => "+this.tarifa);
        System.out.println("DISPONIBILIDAD => "+this.disponibilidad);
        System.out.println("CAPACIDAD => "+this.capacidad);
    }
}
