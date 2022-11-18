
package clasemiercoles_17;

public class ClaseMiercoles_17 {

    public static AlquilerCliente alquiler;
    public static Turismo turismo;
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente("1212-24563098-109-3",
        "Juan","Perez");
        Vehiculo vehiculo = new Vehiculo("123","nissan","rojo",40.00, true);
        alquiler = new AlquilerCliente(cliente, vehiculo, 17, 8, 2022, 5);
        alquiler.mostrarAlquiler();
        
        turismo = new Turismo("123","TOYOTA","negro",40.00,true,2,true);
        System.out.println("VEHICULO DE TURISMO > "+turismo.marca);
        
        vehiculo.getAtributos();
        
        turismo.getAtributos();
        
        Vehiculo miVehiculo = new Turismo("1234","KIA","GRIS",40.00,true,4,true);
        
        miVehiculo.getAtributos();
    }
    
}
