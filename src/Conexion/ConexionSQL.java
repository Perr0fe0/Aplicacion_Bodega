/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;


import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;




/**
 *
 * @author totit
 */
public class ConexionSQL {
    
    
    Connection conectar=null;
    
    /*//Conexion a la bd bodega
    private static String DRIVER= "com.mysql.cj.jdbc.Driver";
    private static String USUARIO= "mi_credencial";
    private static String PASSWORD= "12345678";
    private static String URL= "jdbc:mysql://database-1.ce0nhwtoznll.us-east-1.rds.amazonaws.com";*/
    
    
    
    public Connection conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/test","root","perrofeo");
            
            JOptionPane.showMessageDialog(null, "Conexion exitosa!");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos! "+ e.getMessage());
        }
        return conectar;
    
    }
    
     /*public Connection conexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://database-1.ce0nhwtoznll.us-east-1.rds.amazonaws.com/Bodega", "mi_credencial","12345678");
            
            JOptionPane.showMessageDialog(null, "Conexion exitosa!");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos! "+ e.getMessage());
        }
        return conectar;
    
    }*/


    
    
   
}
    

