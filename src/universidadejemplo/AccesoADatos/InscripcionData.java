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
            String sql = "DELETE FROM inscripcion WHERE idAlumno=" + idAlumno + " AND " + "idMateria=" + idMateria;
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

}
