/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestordistribucion;

//import java.awt.FlowLayout;
//import java.awt.LayoutManager;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author ERICK
 */
public class formGestores extends JFrame{
    public static JLabel lblMensaje, lblPrueba;
    public static JTextField txtCaja;//para caja de texto
    public static JButton btnLimpiar;
    public static JButton btnAlinearLeft, btnCentrar;

    public formGestores() {
        setTitle("FORMULARIO CON CAJA DE TEXTO");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setComponent();
        setVisible(true);
    }
    public void setComponent(){
        lblMensaje = new JLabel("CUAL ES SU NOMBRE");
        txtCaja = new JTextField(10);//aplicamos un tamaño dentro del constructor
        lblPrueba = new JLabel();
        btnLimpiar = new JButton("LIMPIAR");
        btnAlinearLeft = new JButton("ALINEAR A LA IZQUIERDA");
        btnCentrar = new JButton("CENTRAR");
        //txtCaja.setEditable(true);//para habilitar visibilidad de la caja
        //txtCaja.setVisible(false);
        
        add(lblMensaje, BorderLayout.NORTH);
        add(txtCaja, BorderLayout.EAST);
        add(lblPrueba);
        add(btnLimpiar);
        add(btnAlinearLeft);
        add(btnCentrar);
        btnAlinearLeft.addActionListener(new Listener());
        btnLimpiar.addActionListener(new Listener());
        btnCentrar.addActionListener(new Listener());
    }

    private class Listener implements ActionListener {

        public Listener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btnAlinearLeft){
                //setLayout(new FlowLayout(FlowLayout.LEFT));
                //validate();
            }
            if(e.getSource() == btnCentrar){
                //setLayout(new FlowLayout(FlowLayout.CENTER));
                //validate();
            }
        }
    }
    
}
