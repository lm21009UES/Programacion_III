/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexionpgadmin;


/**
 *
 * @author ERICK
 */
public class ConexionPGADMIN {


    public static Connection con;
    private static Object DriverManager;
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static void conectar(){
        String url = "jdbc:postgresql://localhost:5432/tbl_sitios";
        con = DriverManager.getConnection(url,"postgres", "Melendez20");
    }
    
}
    
