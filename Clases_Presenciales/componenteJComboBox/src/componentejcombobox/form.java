
package componentejcombobox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class form extends JFrame {
    public JComboBox jcombo;
    public ArrayList<Dia> arregloDias;
    public Dia d;
    public JTable tabla;
    public JTextField txt1, txt2, txt3;
    public JButton btnInsert;
    public form() {
        arregloDias = new ArrayList<Dia>();
        rellenarDias();
        setTitle("FORLULARIO COMBO");
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        crearComponentes();
        setVisible(true);
    }
    
    public void crearComponentes(){
        //String[] data = new String[]{"LUNES","MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"};
        jcombo = new JComboBox();
        for(Dia item:arregloDias){
            jcombo.addItem(item);
        }
        jcombo.setEditable(true);
        jcombo.addActionListener(new Listener());
        tabla = new JTable();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("codigo");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("PRECIO");
        modelo.addRow(new Object[]{"0001","CARRO","$500"});
        modelo.addRow(new Object[]{"0001","MOTOCICLETA","$500"});
        modelo.addRow(new Object[]{"0001","CAMION","$500"});
        
        tabla.setModel(modelo);
        
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(8, 12, 100, 300);
        
        //EVENTOS DE TABLA
        /*tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String respuestaTabla= tabla.getValueAt(tabla.getSelectedRow(),1).toString();
                JOptionPane.showMessageDialog(null, "SELECCION "+respuestaTabla,"INFO",JOptionPane.INFORMATION_MESSAGE);
            }
        });*/
        /*tabla.addMouseListener(new MouseAdapter(){//para que solo al dar clic se ejute la accion
            @Override
            public void mouseClicked(MouseEvent e) {
                String respuestaTabla= tabla.getValueAt(tabla.getSelectedRow(),1).toString();
                JOptionPane.showMessageDialog(null, "SELECCION "+respuestaTabla,"INFO",JOptionPane.INFORMATION_MESSAGE);
            }
            
        });*/
        tabla.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if(e.getType() == TableModelEvent.UPDATE){
                    System.out.println("REGISTRO SELECCIONADO DESDE EL CAMBIO DEL DATO > "+tabla.getValueAt(tabla.getSelectedRow(),1));
                }else{
                    System.out.println("TODO BIEN");
                }
            }
        });
        txt1 = new JTextField(30);
        txt2 = new JTextField(30);
        txt3 = new JTextField(30);
        btnInsert = new JButton("GUARDAR");
        
        btnInsert.addActionListener(new Listener());
        
        add(jcombo);
        add(scroll);
        add(txt1);
        add(txt2);
        add(txt3);
        add(btnInsert);
    }
    
    public void rellenarDias(){
        d = new Dia();
        d.numero=1;
        d.dia = "LUNES";
        arregloDias.add(d);
        d = new Dia();
        d.numero=2;
        d.dia = "MARTES";
        arregloDias.add(d);
        d = new Dia();
        d.numero=3;
        d.dia = "MIERCOLES";
        arregloDias.add(d);
        d = new Dia();
        d.numero=4;
        d.dia = "JUEVES";
        arregloDias.add(d);
        d = new Dia();
        d.numero=5;
        d.dia = "VIERNES";
        arregloDias.add(d);
        d = new Dia();
        d.numero=6;
        d.dia = "SABADO";
        arregloDias.add(d);
    }

    private class Listener implements ActionListener {

        public Listener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //String respuesta;
            //respuesta = jcombo.getSelectedItem().toString();
            if(e.getSource()==jcombo){
                Dia diaSeleccionado = (Dia)jcombo.getSelectedItem();
                int respuestaIndex = jcombo.getSelectedIndex();
                JOptionPane.showMessageDialog(null, "VALOR SELECCIONADO -> "+diaSeleccionado.numero,"MENSAJE",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "INDICE SELECCIONADO -> "+respuestaIndex,"MENSAJE",JOptionPane.INFORMATION_MESSAGE);
                jcombo.setSelectedIndex(0);
            }
            else if(e.getSource()== btnInsert){
                String texto1, texto2, texto3;
                texto1 = txt1.getText();
                texto2 = txt2.getText();
                texto3 = txt3.getText();
                DefaultTableModel tempModel;
                tempModel = (DefaultTableModel) tabla.getModel();
                tempModel.addRow(new Object[]{texto1, texto2, texto3});
                tabla.setModel(tempModel);
            }
        }
    }
    
}
