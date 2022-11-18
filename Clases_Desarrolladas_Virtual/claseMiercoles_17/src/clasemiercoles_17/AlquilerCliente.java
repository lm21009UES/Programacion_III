
package clasemiercoles_17;

public class AlquilerCliente {
    public Cliente cliente;
    public Vehiculo vehiculo;
    public int diaAlquiler;
    public int mesAlquiler;
    public int añoAlquiler;
    public int totalDiasAlquiler;

    public AlquilerCliente(Cliente cliente, Vehiculo vehiculo, int diaAlquiler, int mesAlquiler, int añoAlquiler, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.añoAlquiler = añoAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }
    public void mostrarAlquiler(){
        System.out.println("CLIENTE > "+cliente.getNombre()+" "+cliente.getApellido());
        System.out.println("NIT > "+cliente.getNit());
        System.out.println("MARCA DEL VEHICULO > "+vehiculo.marca);
        System.out.println("DIAS > "+ totalDiasAlquiler);
    }
}
