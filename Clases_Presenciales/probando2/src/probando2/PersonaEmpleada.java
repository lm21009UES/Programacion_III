
package probando2;

public class PersonaEmpleada extends Personas {
    private String ocupacion;

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    public void MostrarDatos(){
        System.out.println("NOMBRE => "+getNombre());
        System.out.println("APELLIDOS => "+getApellido());
        System.out.println("OCUPACION => "+getOcupacion());
    }
}
