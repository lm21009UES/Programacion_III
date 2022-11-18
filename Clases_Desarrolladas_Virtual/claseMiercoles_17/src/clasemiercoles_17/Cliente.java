
package clasemiercoles_17;

public class Cliente {
    private String nit;
    private String nombre;
    private String apellido;

    public Cliente(String nit, String nombre, String apellido) {
        this.nit = nit;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

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
    
}
