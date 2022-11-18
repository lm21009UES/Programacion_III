
package clasepresencial16;

public class ClasePresencial16 {

    
    public static Vehiculo vehiculo2;//variable de referencia
    public static Vehiculo vehiculo3;
    public static Vehiculo vehiculo4;
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo vehiculo1 = new Vehiculo("TOYOTA","rojo","FM203","Corolla",40.00,true);//instanciamiento de un objeto
        //int numeroCap = 6;
        //System.out.println(numeroCap);
        System.out.println(vehiculo1.modelo);
        imprimirModelo(vehiculo1);
        System.out.println(vehiculo1.modelo);
        /*System.out.println(vehiculo1.marca);
        vehiculo1.setCapacidad(5);
        System.out.println(vehiculo1.getCapacidad());
        vehiculo2 = new Vehiculo("VM","negro","F46454","Serpento",30.00,false);
        if(vehiculo2 == null){
            System.out.println("vehiculo2 es una referencia nula");
        }
        if(vehiculo2 != null){
            System.out.println("vehiculo2 esta instanciado");
        }
        vehiculo3 = vehiculo1;
        vehiculo1.color = "azul";
        System.out.println(vehiculo3.marca);
        vehiculo3.marca = "NISSAN";
        
        vehiculo3.setCapacidad(4);
        System.out.println(vehiculo1.marca);
        System.out.println(vehiculo3.marca);
        System.out.println(vehiculo1.getCapacidad());
        System.out.println(vehiculo3.getCapacidad());
        System.out.println(vehiculo1.color);
        System.out.println(vehiculo3.color);
        
        vehiculo4 = vehiculo3;
        vehiculo4.modelo = "mercedes";
        System.out.println(vehiculo3.modelo);
        System.out.println(vehiculo1.modelo);
        vehiculo3.imprimirDatos();*/
        //imprimirNumero(numeroCap);
        //System.out.println(numeroCap);
    }
    public static void imprimirNumero(int n){
        n=20;
        System.out.println(n);
    }
    public static void imprimirModelo(Vehiculo v){
        v.modelo = "MITSUBISHI";
        System.out.println(v.modelo);
    }
}
