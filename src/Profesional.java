import java.text.SimpleDateFormat;
import java.util.Date;

public class Profesional extends Usuario {
    private String titulo;
    private Date fechaIngreso;

    public Profesional() {}

    public Profesional(String titulo, Date fechaIngreso) {
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + formatter.format(fechaIngreso) +
                '}';
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre: " + super.getNombre() + " RUN: " + super.getRun() +
                " Título: " + titulo + " Fecha de ingreso: " + fechaIngreso);
    }
}
