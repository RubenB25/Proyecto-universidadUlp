/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ruben
 */
public class Conexion {
    private static final String URL= "jdbc:mariadb://localhost/";
//    private static final String DATA_BASE="sistema_gestion_ulp";
    private static final String DATA_BASE="universidadejemplo";
    private static final String USER="root";
    private static final String PASSWORD="";
    
    
    private static Connection conex;

    public Conexion() {
    }

    public static Connection getConex() {
        if (conex == null){
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                conex = DriverManager.getConnection(URL+DATA_BASE,USER,PASSWORD);
            }catch(ClassNotFoundException e){
                System.out.println("Error driver");
            }catch(SQLException b){
                System.out.println("Error Base Datos");
                
            }
        }
        return conex;
    }
    
    
    
}
