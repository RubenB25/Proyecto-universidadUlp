package universidadejemplo.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;

/**
 * @author Gabriel
 */
public class AlumnoData {

    private Connection conex = null;

    public AlumnoData() {
        conex = Conexion.getConex();
    }

    public void guardarAlumno(Alumno alumno) {
        String sql = "insert into alumno (dni, apellido, nombre, fechaNacimiento, estado) values"
                + "(?,?,?,?,?)";

        try {
            PreparedStatement ps = conex.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento())); //Convertir de localDate a Date
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();

            if (resultado.next()) {
                alumno.setIdAlumno(resultado.getInt("idAlumno"));
                JOptionPane.showMessageDialog(null, "Alumno registrado con exito.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + e.getMessage());
        }
    }

    public Alumno buscarAlumno(int id) {
        Alumno alumno = null;
        String sql = "select dni, apellido, nombre, fechaNacimiento from alumno where idAlumno = ? and estado = 1";
        PreparedStatement ps = null;
        try {
            ps = conex.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {
                alumno = new Alumno();

                alumno.setIdAlumno(id);
                alumno.setDni(resultado.getInt("dni"));
                alumno.setApellido(resultado.getString("apellido"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setFechaNacimiento(resultado.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno.");
                ps.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Errpr al acceder a la tabla Alumno." + e.getMessage());
        }
        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        Alumno alumno = null;
        String sql = "select idAlumno, dni, apellido, nombre, fechaNacimiento from alumno where dni= ? and estado = 1";
        PreparedStatement ps = null;
        try {
            ps = conex.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet resultado = ps.executeQuery();

            if (resultado.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(resultado.getInt("idAlumno"));
                alumno.setDni(resultado.getInt("dni"));
                alumno.setApellido(resultado.getString("apellido"));
                alumno.setNombre(resultado.getString("nombre"));
                alumno.setFechaNacimiento(resultado.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno.");
                ps.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno." + e.getMessage());
        }
        return alumno;
    }
     public ArrayList<Alumno> listarAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1 ";
            try (PreparedStatement psa = conex.prepareStatement(sql)) {
                ResultSet rs = psa.executeQuery();
                while (rs.next()) {
                    Alumno alumno = new Alumno();
                    
                    alumno.setIdAlumno(rs.getInt("idAlumno"));
                    alumno.setDni(rs.getInt("dni"));
                    alumno.setApellido(rs.getString("apellido"));
                    alumno.setNombre(rs.getString("nombre"));
                    alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                    alumno.setEstado(rs.getBoolean("estado"));
                    alumnos.add(alumno);
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return alumnos;
    }


    public void modificarAlumno(Alumno alumno) {
        String sql = "update alumno set dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ? where idAlumno = ?";
        try {
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado con exito.");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + e.getMessage());
        }
    }

    public void eliminarAlumno(int id) {
        try {
            String sql = "update alumno set estado = 0 where idAlumno = ?";
            try (PreparedStatement ps = conex.prepareStatement(sql)) {
                int fila = ps.executeUpdate();
                
                if (fila == 1) {
                    JOptionPane.showMessageDialog(null, "Alumno eliminado correctamente.");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno" + e.getMessage());

        }
    }
}
