/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedabinaria;

/**
 *
 * @author Administrador
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = {1,2,3,4,5,6,7,8,9,19};
        int mitad;
        int limiteInferior = 0;
        int limiteSuperior = numeros.length-1;
        int valorBusqueda = 6;
        boolean flag = false;
        while((limiteInferior<=limiteSuperior) && (!flag)){
            mitad = (limiteInferior + limiteSuperior)/2;
            if(numeros[mitad]==valorBusqueda){
                flag = true;
            }
            else if(numeros[mitad]>valorBusqueda){
                limiteSuperior = mitad-1;
            }
            else{
                limiteInferior = mitad+1;
            }
        }
        if(flag){
            System.out.println("ENCONTRADO");
        }else{
            System.out.println("NO ENCONTRADO");
        }
    }
    
}
