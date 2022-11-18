
package ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("INSERTE LA CANTIDAD DE NUMEROS QUE SE DIGITARAN");
        int entrada = input.nextInt();
        int[] arrayInt = new int[entrada];
        int i=0, t=0;
        System.out.println("SOLO SE PODRAN INSERTAR NUMEROS ENTEROS, DE LO CONTRARIO, EL PROGRAMA GENERARA UN ERROR");
        do{
            if(i<arrayInt.length){
                System.out.println("INSERTE EL NUMERO "+(i+1)+":");
                int tem =input.nextInt();
                if(VerificarArreglo(arrayInt,tem)==0){
                    arrayInt[i] = tem;
                    i++;
                }else{
                    t=1;
                    System.out.println("YA SE HAN INSERTADO UN DATO IGUAL");
                    for(int m=0; m<arrayInt.length; m++){
                        arrayInt[m]=0;
                    }
                }
            }
            else{
                t=1;
                System.out.println("ARRAY LLENO");
            }
        }while(t==0);
        if(arregloVacio(arrayInt)){
            System.out.println("NO SE PUEDE CONTINUAR, EL ARRAY TIENE NUMEROS REPETIDOS");
        }else{
            Arrays.sort(arrayInt);
            int a = arrayInt[0];
            int j = arrayInt.length-1;
            int band = arrayInt[j];
            int posicion = 0;
            int[] vectorNuevo = new int[(band-a)+1];
            for(int h=0;h<vectorNuevo.length;h++){
                vectorNuevo[h]= a;
                a++;
            }
            for(int n=0; n<vectorNuevo.length; n++){
                if(vectorNuevo[n] == arrayInt[posicion]){
                    System.out.println("Dato en array => |"+vectorNuevo[n]+"|");
                    posicion++;
                }
                else{
                    System.out.println("*"+vectorNuevo[n]+"*");
                }
            }
        }
    }
    public static int VerificarArreglo(int[] vec, int num){
        int ret=0;
        for(int i=0;i<vec.length; i++){
            if(vec[i]== num){
                ret++;
            }
        }
        return ret;
    }
    public static boolean arregloVacio(int[] vec2){
        boolean acert = false;
        int vac = 0;
        for(int i=0; i<vec2.length; i++){
            if(vec2[i] ==0){
                vac++;
            }
        }
        if(vac == vec2.length)
            acert = true;
        return acert;
    }
}