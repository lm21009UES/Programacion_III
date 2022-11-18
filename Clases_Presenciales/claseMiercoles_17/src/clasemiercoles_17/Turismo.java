
package clasemiercoles_17;


public class Turismo extends Vehiculo {
    public int puertas;
    public boolean marchaAutomatica;
    
    public Turismo(String matricula, String marca, String color, double tarifa, boolean disponible, int puertas, boolean marchaAutomatica) {
        super(matricula, marca, color, tarifa, disponible);
        
        this.puertas = puertas;
        this.marchaAutomatica = marchaAutomatica;
    }
    public void getAtributos(){
        System.out.println("PUERTAS > "+this.puertas);
    }
}
