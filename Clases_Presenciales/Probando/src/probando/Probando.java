/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probando;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import paqueteOffice2.prueba2;
import paqueteOffice2.personas;

/**
 *
 * @author ERICK
 */
public class Probando {

    public static personas p1;
    public static List <personas> listaPersonas;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        prueba2 objet1 = new prueba2();
        objet1.escribir();
        String animal = (JOptionPane.showInputDialog(null,"SELECCIONA EL ANIMAL QUE TE GUSTA MAS","ANIMALES",
                JOptionPane.PLAIN_MESSAGE,null,new Object[] {"PERRO","GATO","MONO","CABALLO"},"PERRO")).toString();
        JOptionPane.showMessageDialog(null, animal);
        String[] carreras = {"matematicas","metodos probabilisticos","FISICA III","PROGRAMACIÓN III","ESTRUCTURA DE DATOS"};
        JOptionPane.showInputDialog(null,"SELECCIONE UNA CARRERA","SELECCIONANDO",
                JOptionPane.DEFAULT_OPTION,null,carreras,0);
        int[] num = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(Arrays.binarySearch(num,9));
        if(Arrays.binarySearch(num, 9)>0){
            System.out.println("DATO ENCONTRADO");
        }
        else{
            System.out.println("DATO NO ENCONTRADO");
        }
        for(int i=0; i<3; i++){
            p1 = new personas();
            System.out.println("DIGITE EL NOMBRE:");
            p1.setNombre(entrada.next());
            System.out.println("DIGITE LOS APELLIDOS");
            p1.setApellidos(entrada.next());
            listaPersonas.add(p1);
        }
        for(personas p : listaPersonas){
            p.PropiedadesPersonas();
        }
    }
    
}
