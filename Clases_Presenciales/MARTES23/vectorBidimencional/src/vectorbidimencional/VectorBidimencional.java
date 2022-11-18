/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectorbidimencional;

/**
 *
 * @author Administrador
 */
public class VectorBidimencional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] notas = new int[2][3];
        
        for(int i=0;i<notas.length;i++){
            for(int j=0; j<notas[i].length;j++){
                notas[i][j] = i;
            }
        }
        for(int i=0;i<notas.length;i++){
            System.out.println("------------------------------");
            for(int j=0; j<notas[i].length;j++){
                System.out.print("["+i+"]["+j+"]=>"+notas[i][j]+" ");
            }
            System.out.println("\n------------------------------");
        }
    }
    
}
