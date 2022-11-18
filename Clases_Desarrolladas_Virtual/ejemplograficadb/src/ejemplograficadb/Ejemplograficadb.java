
package ejemplograficadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ERICK
 */
public class Ejemplograficadb {
    public static Connection con;
    
    public static void main(String[] args) {
        // TODO code application logic here
        frmPrincipal frm = new frmPrincipal();
        frm.show();
        conectar();
        consultar();
    }
    public static void conectar(){
        String url = "jdbc:postgresql://localhost:5432/tbl_sitios";
        try {
            con= DriverManager.getConnection(url, "postgres","Melendez20");
            System.out.println("ESTAMOS CONECTADOS");
        } catch (SQLException ex) {
            //Logger.getLogger(Ejemplograficadb.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR AL REALIZAR LA CONEXION -> "+ex);
        }
    }
    public static void consultar(){
        
        try {
            Statement smt = con.createStatement();
            String consulta = "SELECT * FROM tbl_sitio";
            ResultSet resultado = smt.executeQuery(consulta);
            while(resultado.next()){
                System.out.println("ID - > "+resultado.getInt("idsitio")+"\t NOMBRE -> "+resultado.getString("nombresitio"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplograficadb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
