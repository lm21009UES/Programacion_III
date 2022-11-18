/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Administrador
 */
public class conexion {
    private static conexion instancia = new conexion();
    private EntityManagerFactory fabrica;
    
    private conexion(){
        fabrica = Persistence.createEntityManagerFactory("JPA_practicaPU");
    }

    public static conexion getInstancia() {
        return instancia;
    }

    public EntityManagerFactory getFabrica() {
        return fabrica;
    }
    
}
