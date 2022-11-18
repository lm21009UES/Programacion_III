/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probando2;

/**
 *
 * @author ERICK
 */
public class Personas {
    private String nombre;
    private String apellido;
    
    public void Personas(){};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void MostrarDatos(){
        System.out.println("Nombre => "+getNombre());
        System.out.println("Apellidos => "+getApellido());
    }
}
