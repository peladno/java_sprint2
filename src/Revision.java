public class Revision {
    private int idRevision;
    private int idVisitaTerreno;
    private String nombre;
    private String detalle;
    private int estado;

    public Revision() { }

    public Revision(int idRevision, int idVisitaTerreno, String nombre, String detalle, int estado) {
        this.idRevision = idRevision;
        this.idVisitaTerreno = idVisitaTerreno;
        this.nombre = nombre;
        this.detalle = detalle;
        this.estado = estado;
    }

    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public int getIdVisitaTerreno() {
        return idVisitaTerreno;
    }

    public void setIdVisitaTerreno(int idVisitaTerreno) {
        this.idVisitaTerreno = idVisitaTerreno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String toString() {
        return "Revisión: ID " + idRevision + ", Asociada a la visita " + idVisitaTerreno + ", Nombre: " + nombre +
                ", Detalle: " + detalle + ", Estado: " + estado;
    }
}
