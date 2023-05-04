import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuario implements Asesoria {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String run;

    public Usuario() {
    }

    public Usuario(String nombre, LocalDate fechaNacimiento, String run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public Usuario(String nombre2, String fechaNacimiento2, int run2) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaNacimiento.getMonthValue() > fechaActual.getMonthValue() ||
                (fechaNacimiento.getMonthValue() == fechaActual.getMonthValue() &&
                        fechaNacimiento.getDayOfMonth() > fechaActual.getDayOfMonth())) {
            edad--;
        }
        return edad;
    }

    public String mostrarEdad() {
        int edad = calcularEdad();
        return "El usuario tiene " + edad + " años";
    }

    public void analizarUsuario() {
        System.out.println("Nombre: " + nombre + ", RUN: " + run);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento.format(formatter) +
                ", run=" + run +
                '}';
    }
}
