
package formulario2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frmForm extends JFrame{
    public static JLabel lblMensaje, lblPrueba;
    public static JTextField txtCaja;//para caja de texto
    public static JButton btnLimpiar;
    public frmForm(){
        setTitle("FORMULARIO CON CAJA DE TEXTO");
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setComponent();
        setVisible(true);
    }
    
    public void setComponent(){
        lblMensaje = new JLabel("CUAL ES SU NOMBRE");
        txtCaja = new JTextField(10);//aplicamos un tamaño dentro del constructor
        lblPrueba = new JLabel();
        btnLimpiar = new JButton("LIMPIAR");
        
        //txtCaja.setEditable(true);//para habilitar visibilidad de la caja
        //txtCaja.setVisible(false);
        
        add(lblMensaje);
        add(txtCaja);
        add(lblPrueba);
        add(btnLimpiar);
        
        txtCaja.addActionListener(new Listener());
        btnLimpiar.addActionListener(new Listener2());
    }

    private static class Listener implements ActionListener {

        public Listener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String Mensaje;
            Mensaje = txtCaja.getText();
            lblPrueba.setText(Mensaje);
        }
    }

    private static class Listener2 implements ActionListener {

        public Listener2() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            txtCaja.setText("");
        }
    }
}
