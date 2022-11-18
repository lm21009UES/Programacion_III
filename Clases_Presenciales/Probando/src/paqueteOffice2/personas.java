/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteOffice2;

/**
 *
 * @author ERICK
 */
public class personas {
    private String nombre;
    private String apellidos;
    
    public void personas(){};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void PropiedadesPersonas(){
        System.out.println("Nombres => "+this.nombre);
        System.out.println("Apellidos => "+this.apellidos);
    }
}
