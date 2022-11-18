/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Conexion.conexion;
import java.util.List;
import javax.persistence.EntityManager;
import modelos.TblProducto;
import modelos.TblProveedor;

/**
 *
 * @author ERICK
 */
public class productoControlador {
    private EntityManager entity;

    public productoControlador() {
        entity = entityManager();
    }
    private EntityManager entityManager() {
        return conexion.getInstancia().getFabrica().createEntityManager();
    }
    public void insertarProducto(TblProducto producto){
        entity.getTransaction().begin();
        entity.persist(producto);
        entity.getTransaction().commit();
        entity.close();
    }
    public List<TblProducto> getListaProducto(){
        entity.getTransaction().begin();
        return entity.createQuery("SELECT P FROM TblProducto P").getResultList();
    }
    public TblProducto getProducto(int idProducto){
        entity.getTransaction().begin();
        TblProducto pro = entity.find(TblProducto.class, idProducto);
        entity.close();
        return pro;
    }
    public void editarProducto(TblProducto producto){
        entity.getTransaction().begin();
        TblProducto proEditar = entity.find(TblProducto.class, producto.getIdproducto());
        proEditar.setNombreproducto(producto.getNombreproducto());
        proEditar.setPrecio(producto.getPrecio());
        TblProveedor prov = producto.getIdproveedor();
        producto.setIdproveedor(prov);
        entity.getTransaction().commit();
        entity.close();
    }
}
