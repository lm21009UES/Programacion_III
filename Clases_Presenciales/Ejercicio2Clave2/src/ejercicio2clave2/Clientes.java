
package ejercicio2clave2;

public class Clientes {
    public String nombre;
    public int edad;
    public String telefono;
    public double peso;

    public Clientes() {
    }
    public void mostrarClientes(){
        System.out.println("NOMBRE >> "+this.nombre);
        System.out.println("EDAD >> "+this.edad);
        System.out.println("TELEFONO >> "+this.telefono);
        System.out.println("PESO >> "+this.peso);
    }
}
