
package practicandoparcial;

import Almacenamiento.Cemento;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;


public class Formulario extends JFrame{
    private ArrayList<Cemento> listaCemento = new ArrayList();
    public JLabel CantidadCemento, peso, fechaIngreso, precioCompra, proveedor;
    public JTextField cantidadCemento, pesoCemento, fechaIngresoCemento, precioCompraCemento;
    public JComboBox proveedores;
    public JButton agregarCemento, eliminar;
    private String[] Listaproveedores = new String[]{"Cesa","MAX","Cemento SA"};
    public JTable tablaCemento;
    Cemento element = new Cemento();
    public Formulario() {
        setTitle("PROGRAMA_CEMENTO");
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createComponents();
        setVisible(true);
    }
    /*
    EjemploTabla = new JTable();
    DefaultTableModel modelo= new DefaultTableModel();
    model.AddColumn(modelo1);
    model.addColumn(modelo2);
    .............
    EjemploTabla.setModel(modelo);
    JScrollPane scroll = new JScrollPane(EjemploTabla);
    scroll.setBounds(8,9,100,300);
    add(scroll);
    */
    private void createComponents(){
        CantidadCemento = new JLabel("CANTIDAD");
        cantidadCemento = new JTextField(12);
        peso = new JLabel("PESO");
        pesoCemento = new JTextField(12);
        fechaIngreso = new JLabel("FECHA DE INGRESO");
        fechaIngresoCemento = new JTextField(10);
        precioCompra = new JLabel("PRECIO DE COMPRA");
        precioCompraCemento = new JTextField(10);
        proveedor = new JLabel("PROVEEDORES");
        proveedores = new JComboBox();
        for(String item:Listaproveedores){
            proveedores.addItem(item);
        }
        agregarCemento = new JButton("GUARDAR");
        eliminar = new JButton("ELIMINAR");
        agregarCemento.addActionListener(new Listener());
        tablaCemento = new JTable();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PESO");
        modelo.addColumn("FECHA I.");
        modelo.addColumn("P. COMPRA");
        modelo.addColumn("PROVEEDOR");
        tablaCemento.setModel(modelo);
        /*Metodo para poder ver la selda que se ha seleccionado*/
        tablaCemento.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                cantidadCemento.setText(tablaCemento.getValueAt(tablaCemento.getSelectedRow(),tablaCemento.getSelectedColumn()).toString());
            }
        });
        /*función para verificar lo que se ha seleccionado*/
        /*tablaCemento.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String respuestaTabla= tablaCemento.getValueAt(tablaCemento.getSelectedRow(),1).toString();
                JOptionPane.showMessageDialog(null, "SELECCION "+respuestaTabla,"INFO",JOptionPane.INFORMATION_MESSAGE);
            }
        });*/
        /*tablaCemento.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if(e.getType() == TableModelEvent.UPDATE){
                    System.out.println("REGISTRO SELECCIONADO DESDE EL CAMBIO DEL DATO > "+tablaCemento.getValueAt(tablaCemento.getSelectedRow(),1));
                }else{
                    System.out.println("TODO BIEN");
                }            }
        });*/
        
        JScrollPane scroll = new JScrollPane(tablaCemento);
        scroll.setBounds(8, 12, 100, 300);
        
        add(CantidadCemento);
        add(cantidadCemento);
        add(peso);
        add(pesoCemento);
        add(fechaIngreso);
        add(fechaIngresoCemento);
        add(precioCompra);
        add(precioCompraCemento);
        add(proveedor);
        add(proveedores);
        add(agregarCemento);
        add(eliminar);
        add(scroll);
    }

    private class Listener implements ActionListener {

        public Listener() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()== agregarCemento){
                element.setCantidad(Integer.parseInt(cantidadCemento.getText()));
                element.setPeso(Double.parseDouble(pesoCemento.getText()));
                element.setFechaIngreso(fechaIngresoCemento.getText());
                element.setPrecioCompra(Double.parseDouble(precioCompraCemento.getText()));
                element.setProveedor(proveedores.getSelectedItem().toString());
                listaCemento.add(element);
                cantidadCemento.setText("");
                pesoCemento.setText("");
                fechaIngresoCemento.setText("");
                precioCompraCemento.setText("");
                DefaultTableModel modelTem;
                modelTem = (DefaultTableModel)tablaCemento.getModel();
                modelTem.addRow(new Object[]{element.getCantidad()+" U", element.getPeso()+" Kg",
                element.getFechaIngreso(),"$ "+element.getPrecioCompra(), element.getProveedor()});
                tablaCemento.setModel(modelTem);
            }
        }
    }
}/*int i =0;
        i = (int)(Math.random() * 10000);
        return i;
codigo para generar numeros aleatorios*/
