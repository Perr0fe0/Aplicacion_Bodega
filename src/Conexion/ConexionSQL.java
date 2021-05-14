/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;




/**
 *
 * @author totit
 */
public class ConexionSQL {
    
    
    Connection conectar=null;
    

//    private static String DRIVER= "com.mysql.cj.jdbc.Driver";
//    private static String USUARIO= "root";
//    private static String PASSWORD= "";
//    private static String URL= "jdbc:mysql://localhost/bodega";
//    
//    
//    
//    
//    public Connection conexion(){
//        
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conectar= (Connection) DriverManager.getConnection(URL, USUARIO, PASSWORD);
//            
//            JOptionPane.showMessageDialog(null, "Conexion exitosa!");
//            
//            
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos! "+ e.getMessage());
//        }
//        return conectar;
//          //localhost:3306/bodega","root",""
//    }
    
    
//       public static Connection conexion(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection conectar = DriverManager.getConnection("jdbc:mysql://database-1.ce0nhwtoznll.us-east-1.rds.amazonaws.com/Bodega\", \"mi_credencial\",\"12345678");
//            return conectar;
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//            return null;
//        }
//    }
       
       
    public Connection conexion(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://database-1.ce0nhwtoznll.us-east-1.rds.amazonaws.com/Bodega", "mi_credencial","12345678");


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos! "+ e.getMessage());
        }
        return conectar;

    }
    
//     public Connection conexion(){
//        
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bodega", "root","");
//            
//            JOptionPane.showMessageDialog(null, "Conexion exitosa!");
//            
//            
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos! "+ e.getMessage());
//        }
//        return conectar;
//    
//    }
 
}
    

