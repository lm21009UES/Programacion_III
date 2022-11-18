
package laboratorio2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Formulario extends JFrame{
    public JLabel numInsert;
    public JTextArea areaTexto;
    public JButton btnInsertar, btnNuevoIntento, btnSalir;
    public JTextField cmbtexto;
    public int intentos;
    public int numeroAleatorio;
    
    public Formulario() {
        setTitle("ADIVINA EL NUMERO");
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Component();
        setVisible(true);
        intentos = 3;
        numeroAleatorio = generarNumeroAleatorio();
        btnNuevoIntento.enable(false);
        //esta linea sirve para mostrar el numero generado, se comenta con la finalidad de probar
        //para su correcto funcionamiento
        //JOptionPane.showMessageDialog(null, "numero generado"+numeroAleatorio,"mensajeria", JOptionPane.INFORMATION_MESSAGE);
    }
    public void Component(){
        numInsert = new JLabel("INSERTE NUMERO");
        cmbtexto = new JTextField(10);
        btnInsertar = new JButton("PULSAR");
        btnNuevoIntento = new JButton("NUEVO INTENTO");
        btnSalir = new JButton("SALIR");
        areaTexto = new JTextArea("""
                                  BIENVENIDO AL JUEGO ADIVINADOR
                                  PARA ESTE JUEGO USTED DEBE INGRESAR UN NUMERO
                                  EL CUAL SE HA GENERADO ALEATORIAMENTE
                                  DISPONDRA DE TRES OPORTUNIDADES PARA PODER ACERTAR
                                  AL FINAL SE MOSTRAR\u00c1 EL NUMERO QUE SE GENERO
                                  SI DECIDE REALIZAR NUEVO INTENTO, SE GENERARA UN NUEVO 
                                  NUMERO Y CONTARA NUEVAMENTE CON TRES 
                                  OPORTUNIDADES\u00d3""",10,10);
        areaTexto.enable(false);
        btnInsertar.addActionListener(new Listener());
        btnNuevoIntento.addActionListener(new Listener());
        btnSalir.addActionListener(new Listener());
        add(areaTexto);
        add(numInsert);
        add(cmbtexto);
        add(btnInsertar);
        add(btnNuevoIntento);
        add(btnSalir);
    }
    public int generarNumeroAleatorio(){
        int i =0;
        i = (int)(Math.random() * 10000);
        return i;
    }

    private class Listener implements ActionListener {

        public Listener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == btnInsertar){
                String aux = cmbtexto.getText();
                if(Integer.parseInt(aux) == numeroAleatorio){
                    JOptionPane.showMessageDialog(null, "NUMERO ADIVINADO\n*** FELICIDADES *** ", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                    cmbtexto.setText(Integer.toString(numeroAleatorio));
                    cmbtexto.enable(false);
                }
                else{
                    intentos--;
                    JOptionPane.showMessageDialog(null, "NUMERO NO ADIVINADO, SIGA INTENTANDOLO\n INTENTOS RESTANTES "+intentos, "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                }
                if(intentos ==0){
                    JOptionPane.showMessageDialog(null, "NUMERO NO ADIVINADO\n EN EL AREA DONDE SE INSERTA EL TEXTO\n SE MOSTRARA EL NUMERO QUE SE HABÍA GENERADO","INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                    cmbtexto.setText(Integer.toString(numeroAleatorio));
                    cmbtexto.enable(false);
                    btnInsertar.enable(false);
                    btnNuevoIntento.enable(true);
                }
            }
            if(e.getSource()== btnNuevoIntento){
                JOptionPane.showMessageDialog(null, "NUEVO INTENTO\n SE GENERARA UN NUEVO NUMERO ALEATORIO\n DISPONDRÁ DE TRES INTENTOS","INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
                generarNumeroAleatorio();
                intentos = 3;
                cmbtexto.setText("");
                cmbtexto.enable(true);
                btnNuevoIntento.enable(false);
                //esta linea sirve para mostrar el numero generado, se comenta con la finalidad de probar
                //para su correcto funcionamiento
                //JOptionPane.showMessageDialog(null, "numero generado"+numeroAleatorio,"mensajeria", JOptionPane.INFORMATION_MESSAGE);
            }
            if(e.getSource()== btnSalir){
                System.exit(0);
            }
        }
    }
}
