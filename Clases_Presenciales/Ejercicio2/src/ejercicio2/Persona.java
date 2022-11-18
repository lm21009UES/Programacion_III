
package ejercicio2;

public class Persona {
    public int edad;
    public String nombre;
    public String telefono;

    public Persona() {
    }

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public void mostrarInformacion(){
        System.out.println("EDAD > "+this.edad);
        System.out.println("NOMBRE > "+this.nombre);
        System.out.println("TELEFONO > "+this.telefono);
    }
}
