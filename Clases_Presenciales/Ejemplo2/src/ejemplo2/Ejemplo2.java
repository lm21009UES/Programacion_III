package ejemplo2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejemplo2 {

    /**
    / * @param args the command line arguments
    */
    public int nombreV;
    public static void main(String[] args) {
        // TODO code application logic here
        
        //TIPOS DE DATOS PRIMITIVOS
        int nombreVariable;
        double nombreVariableDouble;
        char nombreVariableChar;
        //TIPOS DE DATOS BOOLEANOS
        boolean nombreVariableBool;
        
        //TIPO DE DATOS DE REFERENCIA
        String variableCadena;
        
        String[] carreras = {"Ingenieria en Sistemas",
                                "Matemáticas"
                            };
        String respuestaCarrera;
        
        Scanner entrada = new Scanner(System.in);
        /*System.out.println("HOLA MUNDO!");
        nombreVariable = entrada.nextInt();
        System.out.println("DATO INSERTADO:"+nombreVariable);
        System.out.println("INSERTE UN TIPO DE DATO DOUBLE");
        nombreVariableDouble = entrada.nextDouble();
        System.out.println("EL DATO DOUBLE ES: "+nombreVariableDouble);*/
        //JOptionPane.showMessageDialog(null,"HOLA MUNDO","ALERTA",
        //        JOptionPane.ERROR_MESSAGE);//para mostrar mensajes
        /*variableCadena = JOptionPane.showInputDialog(null,"ESCRIBE UNA CADENA DE TEXTO",
                "PREGUNTA", JOptionPane.QUESTION_MESSAGE);
        nombreVariable = Integer.parseInt(JOptionPane.showInputDialog(null,"INSERTE UN NUMERO ENTERO",
                "PREGUNTA", JOptionPane.QUESTION_MESSAGE));
        nombreVariableDouble = Double.parseDouble(JOptionPane.showInputDialog(null,"INSERTE UN NUMERO DOUBLE",
                "PREGUNTA", JOptionPane.QUESTION_MESSAGE));
        
        respuestaCarrera = (String)JOptionPane.showInputDialog(null,"SELECCIONE UNA CARRERA","CARRERA",
                JOptionPane.DEFAULT_OPTION,null,carreras,0);
        
        System.out.println("DATO INSERTADO "+variableCadena);
        System.out.println("DATO INSERTADO "+nombreVariable);
        System.out.println("DATO INSERTADO "+nombreVariableDouble);
        //variableCadena = entrada.nextLine();
        //System.out.println("INSERCIÓN: "+variableCadena);¨*/
        int respuesta = JOptionPane.showConfirmDialog(null,"VERIFIQUE","TITULO",
                JOptionPane.YES_NO_OPTION);
        System.out.println("DATO INSERTADO "+respuesta);
    }
    
}
