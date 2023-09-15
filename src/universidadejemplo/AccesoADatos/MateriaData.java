/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

/**
 *
 * @author Ruben
 */
public class MateriaData {
    private Connection con = null;

    public MateriaData() {
        con=Conexion.getConex();
    }
    
    
    public void nuevaMateria(Materia materia){
        String sql = "INSERT INTO materia (nombre, año, estado)"
                + "VALUES (?, ?, ?)";  
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getIdAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();  
            
            ResultSet rs=ps.getGeneratedKeys(); 
            
            if (rs.next()) {  //Si se ingreso la materia
               materia.setIdMateria(rs.getInt(1));
               JOptionPane.showMessageDialog(null, "Materia Ingresada");
            } 
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia" +ex.getMessage());
        }
    }
   
    
    public void ModificaMateria(Materia materia) {
        
        String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ? "
                    + "WHERE idMateria = ?";
    
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getIdAnioMateria());
            ps.setBoolean(3, materia.isEstado());
            ps.setInt(4, materia.getIdMateria());
            ps.executeUpdate();  

            int filasAfectadas = ps.executeUpdate();
            
            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada");
            } else {
                System.out.println("Error al modificar materia");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de acceso tabla Materia");    
        }

    }
    
    
    public void EliminaMateria(int id) {
        
        String sql = "UPDATE materia SET Estado = 0 "
                    + "WHERE idMateria = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();  
            int filasAfectadas = ps.executeUpdate();
            
            if (filasAfectadas == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada");
            } else {
                System.out.println("Error al eliminar materia");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de acceso tabla Materia");    
        }

    }
    
    public Materia buscarMateria(int id) {
        System.out.println("Codigo: " + id );
        String sql = "SELECT nombre, año, estado FROM materia WHERE idMateria = ?";
        //Materia materia = null;
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
           
            ResultSet rs = ps.executeQuery();
            
            
            if (rs.next()) {
                //System.out.println("Nombre: " + rs.getInt("idMateria"));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Año: " + rs.getInt("año"));
                System.out.println("Estado: " + rs.getBoolean("estado"));
                Materia mat = new Materia (rs.getString("nombre"), rs.getInt("año"), rs.getBoolean("estado"));
                return mat;
            } else {
                System.out.println("No existe la materia");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de acceso tabla Materia");    
        }
        return null;
    }
    
    public ArrayList<Materia> listarMaterias(){
        return null;
    }
}
