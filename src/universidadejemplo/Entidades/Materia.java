package universidadejemplo.Entidades;

/**
 *
 * @author Ruben
 */
public class Materia {
    int idMateria;
    String nombre;
    int anio;
    boolean estado;

    public Materia() {
    }

    public Materia(int idMateria, String nombre,int anio) {
        this.anio = anio;
        this.idMateria = idMateria;
        this.nombre = nombre;
    }

   
    public Materia(int idMateria, String nombre, int idAnioMateria, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = idAnioMateria;
        this.estado = estado;
    }

    public Materia(String nombre, int idAnioMateria, boolean estado) {
        this.nombre = nombre;
        this.anio = idAnioMateria;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() {
        return  nombre+" - "+anio;
    }
    
    
    
}
