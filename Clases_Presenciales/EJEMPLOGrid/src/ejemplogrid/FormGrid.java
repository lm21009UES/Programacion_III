/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplogrid;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author ERICK
 */
public class FormGrid extends JFrame{
    
    public static JButton btn1;
    public static JButton btn2, btn3, btn4, btn5, btn6, btn7, btn8;

    public FormGrid() {
        setTitle("FORMULARIO CON CAJA DE TEXTO");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,2,5,5));
        setComponent();
        setVisible(true);
    }
    public void setComponent(){
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        //txtCaja.setEditable(true);//para habilitar visibilidad de la caja
        //txtCaja.setVisible(false);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        
        btn1.addActionListener(new Listener());
        btn2.addActionListener(new Listener());
    }

    private class Listener implements ActionListener {

        public Listener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btn1){
                //setLayout(new FlowLayout(FlowLayout.LEFT));
                //validate();
            }
            if(e.getSource() == btn2){
                //setLayout(new FlowLayout(FlowLayout.CENTER));
                //validate();
            }
        }
    }
    
}
