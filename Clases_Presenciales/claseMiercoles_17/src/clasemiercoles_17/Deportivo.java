
package clasemiercoles_17;

public class Deportivo extends Vehiculo {
    private int cilindrada;

    public Deportivo(int cilindrada, String matricula, String marca, String color, double tarifa, boolean disponible) {
        super(matricula, marca, color, tarifa, disponible);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
}
