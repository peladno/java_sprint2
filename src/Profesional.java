import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Profesional extends Usuario {
    private String titulo;
    private LocalDate fechaIngreso;

    public Profesional() {
    }

    public Profesional(String nombre, LocalDate fechaNacimiento, String run, String titulo, LocalDate fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
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
