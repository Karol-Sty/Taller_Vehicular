/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_vehicular;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Karito
 */
public class phpmyadmin {
    Connection SQLConexion;
    public phpmyadmin(){
        String host = "localhost";
        String puerto = "3306";
        String nameDB = "taller";
        
        String usuario = "root";
        String pass = "1234";
        
        String driver = "com.mysql.cj.jdbc.Driver";
        
        String databaseURL = "jdbc:mysql://"+host+":"+puerto+"/"+nameDB+"?useSSL=false";
        
        try{
            Class.forName(driver);
            SQLConexion = DriverManager.getConnection(databaseURL, usuario, pass);
            System.out.println("Conectado");
        }catch(Exception ex){
            System.out.println("No se conecto");
        }
    }
    public Connection getConectarDB(){
        return SQLConexion;
        
    }
}
