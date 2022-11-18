/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probando2;

/**
 *
 * @author ERICK
 */
public class DatosTrabajo {
    private PersonaEmpleada empleado;
    private String carnetAsignado;

    public PersonaEmpleada getEmpleado() {
        return empleado;
    }

    public void setEmpleado(PersonaEmpleada empleado) {
        this.empleado = empleado;
    }

    public String getCarnetAsignado() {
        return carnetAsignado;
    }

    public void setCarnetAsignado(String carnetAsignado) {
        this.carnetAsignado = carnetAsignado;
    }
    public void Generalidades(){
        System.out.println("NOMBRE => "+empleado.getNombre());
        System.out.println("APELLIDOS => "+empleado.getApellido());
        System.out.println("CARNET => "+getCarnetAsignado());
        System.out.println("OCUPACION = > "+empleado.getOcupacion());
    }
}
