
package probandorandom;

public class ProbandoRandom {

    public static void main(String[] args) {
        int[][] matrizDatos = new int[3][3];
        int suma =0;
        for(int i=0; i<matrizDatos.length; i++){
            for(int j=0; j<matrizDatos[i].length; j++){
                matrizDatos[i][j] = (int)(Math.random()*100+1);
            }
        }
        for(int i=0; i<matrizDatos.length; i++){
            for(int j=0; j<matrizDatos[i].length; j++){
                System.out.print("["+matrizDatos[i][j]+"] ");
            }
            System.out.println();
        }
        for(int i=0; i<matrizDatos.length; i++){
            for(int j=0; j<matrizDatos[i].length; j++){
                if(j==i){
                    suma+= matrizDatos[i][j];
                }
            }
        }
        System.out.println("SUMA DE DIAGONAL PRINCIPAL: "+suma);
    }
    
}
