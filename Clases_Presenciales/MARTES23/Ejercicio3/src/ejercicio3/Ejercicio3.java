/*Realizaremos el ejercicio 3 de tal manera que el usuario determine el tamaño
del vector de las calificaciones, y luego las inserte
*/
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] grades;
        int option;
        float average = 0f;
        int percent =0,percent2 =0;
        System.out.println("INSERTE LA CANTIDAD DE NOTAS PERTENECIENTES A LOS ESTUDIANTES QUE SE REGISTRARAN");
        int size = input.nextInt();
        grades = new float[size];
        for(int i=0; i<grades.length;i++){
            System.out.println("INSERTE LA NOTA #"+(i+1)+":");
            grades[i] = input.nextFloat();
        }
        for(int i=0; i<grades.length; i++){
            average +=grades[i];
            if(grades[i]>6)
                percent++;
            if(grades[i]>=10)
                percent2++;
        }
        do{
            Menu();
            option = input.nextInt();
            if(option==1){
               System.out.println("PROMEDIO DE NOTAS DE LOS ESTUDIANTES: > "+(average/size));
            }
            if(option ==2){
               System.out.println("CANTIDAD DE ESTUDIANTES APROBADOS: > "+percent);
            }
            if(option==3){
               System.out.println("ALUMNOS CON CALIFICACIONES MAYORES O IGUALES A 10: > "+percent2);
            }
            if(option == 4){
                System.out.println("SALIENDO");
            }
            else{
                System.out.println("** OPCION NO CONTEMPLADA **");
            }
        }while(option!=4);
    }
    public static void Menu(){
        System.out.println("1 - CONOCER EL PROMEDIO GENERAL DEL GRUPO DE ESTUDIANTES");
        System.out.println("2 - PORCENTAJE DE ALUMNOS APROBADOS");
        System.out.println("3 - ALUMNOS CON CALIFICACIONES MAYOR O IGUALES A 10");
        System.out.println("4 - SALIR");
    }
    
}
