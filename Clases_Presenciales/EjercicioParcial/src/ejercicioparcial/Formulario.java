
package ejercicioparcial;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Formulario extends JFrame {
    public JLabel nombre, edad, estado_civil, sexo, sueldo, nuevosueldoInformacion, aumentoinformacion;
    public JTextField Nombre, Edad, Sueldo;
    public JComboBox estadoCivil, sexo_e;
    String[] estado = new String[]{"SOLTERO","CASADO","VIUDO/A"};
    public JRadioButton sexo1, sexo2;
    public JTable datos;
    public JButton Calcular,nuevo;
    public Formulario() {
        setTitle("CALCULO DE AUMENTO DE SALARIO");
        setSize(600,600);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createComponent();
        datos.enable(false);
        setVisible(true);
    }
    public void createComponent(){
        nombre = new JLabel("NOMBRE:");
        Nombre = new JTextField(30);
        edad= new JLabel("EDAD");
        Edad = new JTextField(10);
        estado_civil = new JLabel("ESTADO CIVIL");
        sexo = new JLabel("SEXO");
        sueldo = new JLabel("SUELDO:");
        Sueldo = new JTextField(8);
        estadoCivil = new JComboBox();
        for(String item: estado){
            estadoCivil.addItem(item);
        }
        sexo1 = new JRadioButton("FEMENINO");
        sexo2 = new JRadioButton("MASCULINO");
        
        datos = new JTable();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("NOMBRE");
        modelo.addColumn("EDAD");
        modelo.addColumn("ESTADO");
        modelo.addColumn("SEXO");
        modelo.addColumn("SUELDO");
        modelo.addColumn("AUMENTO");
        modelo.addColumn("NEW SUELDO");
        datos.setModel(modelo);
        JScrollPane scroll = new JScrollPane(datos);
        scroll.setBounds(15,15,200,100);
        sexo1.addActionListener(new Listener());
        sexo2.addActionListener(new Listener());
        Calcular = new JButton("CALCULAR");
        Calcular.addActionListener(new Listener());
        nuevosueldoInformacion = new JLabel();
        aumentoinformacion = new JLabel();
        nuevo = new JButton("NUEVO");
        nuevo.addActionListener(new Listener());
        
        add(nombre);
        add(Nombre);
        add(edad);
        add(Edad);
        add(estado_civil);
        add(estadoCivil);
        add(sexo);
        add(sexo1);
        add(sexo2);
        add(sueldo);
        add(Sueldo);
        add(nuevosueldoInformacion);
        add(aumentoinformacion);
        add(nuevo);

        add(Calcular);
        add(scroll);
    }

    private class Listener implements ActionListener {

        public Listener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(sexo1.isSelected()){
                sexo2.enable(true);
            }
            if(sexo2.isSelected()){
                sexo1.enable(true);
            }
            if(Calcular == e.getSource()){
                Double sueldo = Double.parseDouble(Sueldo.getText());
                Double nuevoSueldo =0.0;
                Double Aumento = 0.0;
                String aumento = "";
                if(sueldo <1000.00){
                    Aumento = sueldo*0.15;
                    aumento="15%";
                }
                if(sueldo >= 1000.00){
                    Aumento = sueldo*0.12;
                    aumento="12%";
                }
                nuevoSueldo = sueldo+Aumento;
                String sexoaux = "";
                if(sexo1.isSelected()){
                    sexoaux = sexo1.getText().toString();
                }if(sexo2.isSelected()){
                    sexoaux = sexo2.getText().toString();
                }
                DefaultTableModel modelTem;
                modelTem = (DefaultTableModel)datos.getModel();
                modelTem.addRow(new Object[]{Nombre.getText(), Edad.getText(), estadoCivil.getSelectedItem().toString(),sexoaux,"$ "+ Sueldo.getText(), aumento, nuevoSueldo.toString()});
                datos.setModel(modelTem);
                aumentoinformacion.setText("AUMENTO:$"+Aumento.toString());
                nuevosueldoInformacion.setText("NUEVO SUELDO:$"+nuevoSueldo.toString());
                Nombre.enable(false);
                Edad.enable(false);
                estadoCivil.enable(false);
                sexo1.enable(false);
                sexo2.enable(false);
                Sueldo.enable(false);
            }
            if(e.getSource() == nuevo){
                Nombre.enable(true);
                Edad.enable(true);
                estadoCivil.enable(true);
                sexo1.enable(true);
                sexo2.enable(true);
                Sueldo.enable(true);
                Nombre.setText("");
                Edad.setText("");
                Sueldo.setText("");
            }
        }
    }
}
