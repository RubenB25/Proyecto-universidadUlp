/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

/**
 *
 * @author Ruben
 */
public class InscripcionData {

    private Connection con = null;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
        con = Conexion.getConex();
    }

    public void guardarInscripcion(Inscripcion insc) {
        try {
            String sql = "INSERT INTO inscripcion (nota,idAlumno,idMateria) VALUES (" + insc.getNota() + "," + insc.getAlumno().getIdAlumno() + "," + insc.getMateria().getIdMateria() + ")";
            PreparedStatement ps = con.prepareStatement(sql);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Inscripción realizada con éxito.");
            } else {
                System.out.println("No se pudo insertar ningún dato.");
            }
        } catch (SQLException e) {

        }

    }

    public ArrayList<Materia> obtenerMateriasCursadas(int id) {
        ArrayList<Materia> listaCursadas = new ArrayList();
        try {
            String sql = "SELECT m.idMateria,m.nombre,m.año FROM materia m join inscripcion i on(i.idMateria = m.idMateria) WHERE estado = 1 and i.idAlumno=" + id;
            PreparedStatement psm = con.prepareStatement(sql);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();

                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setIdAnioMateria(rs.getInt("año"));
                listaCursadas.add(materia);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla" + ex.getMessage());
        }

        return listaCursadas;
    }

    public ArrayList<Materia> obtenerMateriasNoCursadas(int id) {
        ArrayList<Materia> listaNoCursadas = new ArrayList();
        try {
            String sql = "SELECT idMateria, nombre, año FROM materia WHERE idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno=" + id + ") AND estado = 1";
            PreparedStatement psm = con.prepareStatement(sql);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setIdAnioMateria(rs.getInt("año"));
                listaNoCursadas.add(materia);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla" + ex.getMessage());
        }

        return listaNoCursadas;
    }

    public void anularInscripcion(int idAlumno, int idMateria) {
        try {
            String sql = "delete FROM inscripcion WHERE idAlumno=" + idAlumno + " AND " + "idMateria=" + idMateria;
            PreparedStatement ps = con.prepareStatement(sql);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                
                JOptionPane.showMessageDialog(null, "Anulación de inscripción realizada con éxito.");

            } else {
                System.out.println("No se pudo insertar ningún dato.");
            }
        } catch (SQLException e) {

        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        try {
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, nota);
        ps.setInt(2, idAlumno);
        ps.setInt(3, idMateria);
        ps.setDouble(idAlumno,nota);   
        int filasAfectadas = ps.executeUpdate();
       // ResultSet resultado=ps.getGeneratedKeys();
        if (filasAfectadas >= 0) {
            JOptionPane.showMessageDialog(null, "Se actualizó la nota en la materia");
        }else{
        ps.close();
            System.out.println("No se pudo actualizar ningún dato.");}
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"hay un error al querer cargar la nota"+ e);
    }
        
        
    }

    public ArrayList<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        ArrayList<Inscripcion> listaInscripciones = new ArrayList<>();
        try {
            String sql = "SELECT i.nota, m.nombre, i.idMateria FROM "
                    + "inscripcion i join materia m on(i.idMateria = m.idMateria) "
                    + "WHERE i.idAlumno=" + idAlumno;
            PreparedStatement psm = con.prepareStatement(sql);
            ResultSet rs = psm.executeQuery();
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                Materia materia = new Materia(rs.getInt("idMateria"), rs.getString("nombre"));
                inscripcion.setMateria(materia);
                inscripcion.setNota(rs.getDouble("nota"));

                listaInscripciones.add(inscripcion);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla" + ex.getMessage());
        }

        return listaInscripciones;
        
    }

    public Iterable<Alumno> obtenerAlumnosPorMateria(int idMateria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
