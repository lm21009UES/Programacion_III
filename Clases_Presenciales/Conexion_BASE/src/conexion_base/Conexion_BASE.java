/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexion_base;

import com.sun.jdi.connect.spi.Connection;


/**
 *
 * @author ERICK
 */
public class Conexion_BASE {

    /**
     * @param args the command line arguments
     */
    public static Connection con;
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void Conexion(){
        String url ="jdbc:postgresql://localhost:5432/tbl_sitios";
        con = DriverManager;
    }
}
