
package clasemiercoles_17;

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
    public void getAtributos(){
        System.out.println("MARCA > "+this.marca);
    }
}
