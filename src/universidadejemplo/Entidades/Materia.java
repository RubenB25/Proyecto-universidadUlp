package universidadejemplo.Entidades;

/**
 *
 * @author Ruben
 */
public class Materia {
    int idMateria;
    String nombre;
    int idAnioMateria;
    boolean estado;

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int idAnioMateria, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.idAnioMateria = idAnioMateria;
        this.estado = estado;
    }

    public Materia(String nombre, int idAnioMateria, boolean estado) {
        this.nombre = nombre;
        this.idAnioMateria = idAnioMateria;
        this.estado = estado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdAnioMateria() {
        return idAnioMateria;
    }

    public void setIdAnioMateria(int idAnioMateria) {
        this.idAnioMateria = idAnioMateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() {
        return "nombre= " + nombre + ", Año de materia= " + idAnioMateria + ", estado= " + estado + '}';
    }
    
    
    
}
