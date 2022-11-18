
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here
        double[][] ventasApartamentos = new double[5][12]; //PUEDE CAMBIARSE EL TAMAÑO, PARA PODER REALIZARLO DE MANERA MAS RAPIDA
        String[] Meses = {"enero","febrero","marzo",
            "abril","mayo","junio","julio", "agosto",
            "septiembre","octubre", "noviembre", "diciembre"};
        double[] ventasMensuales = new double[12];
        double totalVentas =0;
        Scanner entrada = new Scanner(System.in);
        double mayor = 0.0;
        int depMaxF=0;
        int op;
        System.out.println("*************INSERSION DE DATOS**********************");
        for(int i=0;i<ventasApartamentos.length; i++){
            for(int j=0; j<ventasApartamentos[i].length; j++){
                System.out.println("Ingrese la ventas del apartamento "+(i+1)+" del mes "+Meses[j]);
                ventasApartamentos[i][j] = entrada.nextDouble();
            }
        }
        do{
            System.out.println("********* OPCIONES *************");
            System.out.println("1 - VISUALIZAR DEPARTAMENTO CON MAS VENTA EN EL MES DE JULIO");
            System.out.println("2- VISUALIZAR TOTAL DE VENTAS MENSUALES Y ANUAL");
            System.out.println("3 - SALIR");
            op = entrada.nextInt();
            if(op ==1){
                for(int i=0;i<ventasApartamentos.length; i++){
                    for(int j=6; j<=6; j++){
                        if(ventasApartamentos[i][j]>mayor){
                            mayor = ventasApartamentos[i][j];
                            depMaxF = i;
                        }
                    }
                }
                System.out.println("\nEl Departamento que más vendio En el mes de Julio es el Departamento "+(depMaxF+1));
                System.out.println("MONTO VENDIDIO: $"+mayor);
            }
            if(op==2){
                for(int k=0; k<ventasMensuales.length;k++){
                    double sum =0.0;
                    for(int i=0;i<ventasApartamentos.length; i++){
                        sum +=ventasApartamentos[i][k];
                    }
                    ventasMensuales[k]= sum;
                }
                System.out.println();
                System.out.println("****VENTAS MENSUALES***");
                for(int i=0;i<ventasMensuales.length;i++){
                    System.out.println("MONTO DE VENTAS DEL MES DE "+Meses[i]+": $"+ventasMensuales[i]);
                    totalVentas+=ventasMensuales[i];
                }
                System.out.println("TOTAL DE VENTAS: $"+totalVentas);
            }
            if(op == 3){
                System.out.println("SALIENDO");
            }
        }while(op!=3);
    }
}
