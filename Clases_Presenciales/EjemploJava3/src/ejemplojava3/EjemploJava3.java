
package ejemplojava3;
import javax.swing.JOptionPane;
public class EjemploJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op = JOptionPane.showConfirmDialog(null, "Haga una selección:");
        switch(op){
            case 0:
                JOptionPane.showMessageDialog(null, "SELECCIONE EL BOTON SI");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "SELECCIONE EL BOTON NO");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "SELECCIONE EL BOTON CANCEL");
                break;
            default:
                break;
        }
        /*if(op==0){
        }
        else if(op==1){
        }
        else if(op==2){
        }
        else{
        }*/
    }
    
}
