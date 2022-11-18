/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probando2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ERICK
 */
public class Probando2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        List <DatosTrabajo> listaPersonas = new ArrayList();
        for(int i=0; i<2; i++){
            DatosTrabajo p1 = new DatosTrabajo();
            PersonaEmpleada p2 = new PersonaEmpleada();
            System.out.println("INSERTE EL NOMBRE:");
            p2.setNombre(entrada.nextLine());
            System.out.println("APELLIDOS:");
            p2.setApellido(entrada.nextLine());
            System.out.println("DIGITE LA OCUPACION:");
            p2.setOcupacion(entrada.nextLine());
            System.out.println("DIGITE CARNET ASIGNADO");
            p1.setCarnetAsignado(entrada.nextLine());
            p1.setEmpleado(p2);
            listaPersonas.add(p1);
        }
        for(DatosTrabajo p : listaPersonas){
            p.Generalidades();
            System.out.println("***********************************");
        }
        for(DatosTrabajo p3 : listaPersonas){
            if(p3.getEmpleado().getNombre().equals("erick adony"))
                listaPersonas.remove(p3);
        }
        for(DatosTrabajo p : listaPersonas){
            p.Generalidades();
            System.out.println("***********************************");
        }
    }
    
}
