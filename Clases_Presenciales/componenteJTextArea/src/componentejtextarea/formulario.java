/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentejtextarea;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 *
 * @author ERICK
 */
public class formulario extends JFrame{
    public JTextArea areaTexto;
    public JCheckBox checkbox;
    public JCheckBox checkbox2;
    public JButton btnprueba;
    public JRadioButton rb1, rb2;
    public ButtonGroup grupoR;
    
    public formulario() {
        setTitle("EXAMPLE FORM");
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createdComponent();
        setVisible(true);
    }
    public void createdComponent(){
        areaTexto = new JTextArea("EXAMPLE",10,30);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(false);
        checkbox = new JCheckBox("this's CHECKBOX");
        checkbox2 = new JCheckBox("this's CHECKBOX 2");
        checkbox.addActionListener(new Listener());
        checkbox2.addActionListener(new Listener());
        btnprueba = new JButton("VERIFICAR ESTADO DEL CHECKBOX");
        btnprueba.addActionListener(new Listener());
        rb1 = new JRadioButton("RADIO BUTTON 1");
        rb2 = new JRadioButton("RADIO BUTTON 2");
        
        grupoR = new ButtonGroup();
        grupoR.add(rb1);
        grupoR.add(rb2);
        
        add(areaTexto);
        add(checkbox);
        add(checkbox2);
        add(btnprueba);
        add(rb1);
        add(rb2);
        //add(grupoR);
    }

    private class Listener implements ActionListener {

        public Listener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            /*if(((JCheckBox)e.getSource()).isSelected()){
                JOptionPane.showConfirmDialog(null, "CHECKBOX SELECTED", "MESSAJE", JOptionPane.DEFAULT_OPTION);
            }*/
            if(e.getSource() == checkbox){
                if(((JCheckBox)e.getSource()).isSelected()){
                    JOptionPane.showConfirmDialog(null, "CHECKBOX 1 is being clicked and selected", "MESSAJE", JOptionPane.DEFAULT_OPTION);
                }
            }
            if(e.getSource() == checkbox2){
                if(((JCheckBox)e.getSource()).isSelected()){
                    JOptionPane.showConfirmDialog(null, "CHECKBOX 2 is being clicked and selected", "MESSAJE", JOptionPane.DEFAULT_OPTION);
                }
            }
            if(e.getSource() == btnprueba){
                if(checkbox.isSelected()){
                    JOptionPane.showConfirmDialog(null, "CHECKBOX 1 is selected", "MESSAJE", JOptionPane.DEFAULT_OPTION);
                }
                if(checkbox2.isSelected()){
                    JOptionPane.showConfirmDialog(null, "CHECKBOX 2 is selected", "MESSAJE", JOptionPane.DEFAULT_OPTION);
                }
            }
        }
    }
}
