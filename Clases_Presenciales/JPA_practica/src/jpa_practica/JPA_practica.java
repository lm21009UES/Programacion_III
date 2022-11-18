/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jpa_practica;

import controladores.proveedorControlador;
import java.util.List;
import modelos.TblProveedor;
import views.frmProductos;

/**
 *
 * @author Administrador
 */
public class JPA_practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmProductos frm =new  frmProductos();
        frm.show();
        // TODO code application logic here
        //TblProveedor pro = new TblProveedor(null, "ejemplo2");
        //pro.setNombreproveedor("EJEMPLO PROVEEDOR");
        proveedorControlador controlador = new proveedorControlador();
        //controlador.insertarProveedor(pro);
        
        /*TblProveedor pro2 = new TblProveedor();
        pro2.setIdproveedor(2);
        pro2.setNombreproveedor("TEST EDITAR");
        controlador.editarProveedor(pro2);*/
        //controlador.elimininarProveedor(1);
        List<TblProveedor> lista = controlador.getListProveedor();
        for(TblProveedor item:lista){
            System.out.println("ID -> "+item.getIdproveedor()+"\tNOMBRE -> "+item.getNombreproveedor());
        }
    }
}
