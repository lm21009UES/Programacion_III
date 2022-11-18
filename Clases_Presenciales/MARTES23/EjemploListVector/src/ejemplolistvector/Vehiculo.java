
package ejemplolistvector;

/**
 *
 * @author ERICK
 */
public class Vehiculo {
    public String matricula;
    public String marca;
    public String color;
    public double tarifa;
    public boolean disponible;

    public Vehiculo(String matricula, String marca,String color, double tarifa, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }
    public Vehiculo(){
    }
    public void getAtributos(){
        System.out.println("MARCA > "+this.marca);
        System.out.println("MATRICULA > "+this.matricula);
        System.out.println("COLOR > "+this.color);
        System.out.println("TARIFA > "+this.tarifa);
    }
}
