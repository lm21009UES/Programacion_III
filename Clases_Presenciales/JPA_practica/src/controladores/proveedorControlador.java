/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Conexion.conexion;
import java.util.List;
import javax.persistence.EntityManager;
import modelos.TblProveedor;

/**
 *
 * @author Administrador
 */
public class proveedorControlador {
    public void insertarProveedor(TblProveedor proveedor){
        EntityManager entitymanager = entityManager();
        entitymanager.getTransaction().begin();
        entitymanager.persist(proveedor);
        entitymanager.getTransaction().commit();
        entitymanager.close();
    }

    private EntityManager entityManager() {
        return conexion.getInstancia().getFabrica().createEntityManager();
    }
    public void editarProveedor(TblProveedor proveedor){
        EntityManager entitymanager = entityManager();
        entitymanager.getTransaction().begin();
        TblProveedor proveedor2 = entitymanager.find(TblProveedor.class, proveedor.getIdproveedor());
        proveedor2.setNombreproveedor(proveedor.getNombreproveedor());
        //entitymanager.persist(proveedor);
        entitymanager.getTransaction().commit();
        entitymanager.close();
    }
    public void elimininarProveedor(int idProveedor){
        EntityManager en = entityManager();
        en.getTransaction().begin();
        TblProveedor proveedor = en.find(TblProveedor.class, idProveedor);
        en.remove(en.merge(proveedor));
        en.getTransaction().commit();
        en.close();
    }
    public List<TblProveedor> getListProveedor(){
        EntityManager en = entityManager();
        en.getTransaction().begin();
        
        return en.createQuery("SELECT pro FROM TblProveedor pro").getResultList();
    }
    
}
