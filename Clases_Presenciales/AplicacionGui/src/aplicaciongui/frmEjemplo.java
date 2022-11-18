
package aplicaciongui;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class frmEjemplo extends JFrame {
    public JLabel label;
    public frmEjemplo() {
        setTitle("FORMULARIO DE EJEMPLO");
        setSize(400,400);//dimensiones de formulario, largo y alto;
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        label = new JLabel("HOLA MUNDO EN UN FORMULARIO");
        JLabel label2 = new JLabel();
        label2.setText(label.getText());
        add(label);
        add(label2);
        setComponent();
        setVisible(true);
    }
    public void setComponent(){
        JLabel label3 = new JLabel("TEXTO DESDE UN METODO");
        add(label3);
    }
}
