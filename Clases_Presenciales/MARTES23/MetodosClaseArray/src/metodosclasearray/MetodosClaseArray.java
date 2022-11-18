/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosclasearray;

import java.util.Arrays;

/**
 *
 * @author Administrador
 */
public class MetodosClaseArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numeros = {3,4,6,8,2,600,700,1};
        for(int num : numeros){
            System.out.println(" > "+num);
        }
        System.out.println("###############################");
        Arrays.sort(numeros,3,numeros.length);//solamente fragmentos del vector
        for(int num : numeros){
            System.out.println(" > "+num);
        }
        System.out.println(Arrays.binarySearch(numeros, 9));
        if(Arrays.binarySearch(numeros, 9)>0){
            System.out.println("DATO ENCONTRADO");
        }
        else{
            System.out.println("DATO NO ENCONTRADO");
        }
    }
    
}
