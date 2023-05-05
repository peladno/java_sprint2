import java.time.LocalDate;

public class Administrativo extends Usuario {

    private String area;
    private String experienciaPrev;

    public Administrativo() {
    }

    public Administrativo(String nombre, LocalDate fechaNacimiento, String run, String area, String experienciaPrev) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.experienciaPrev = experienciaPrev;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrev() {
        return experienciaPrev;
    }

    public void setExperienciaPrev(String experienciaPrev) {
        this.experienciaPrev = experienciaPrev;
    }

    @Override
    public String toString() {
        return super.toString() + "\nÁrea: " + area + "\nExperiencia previa: " + experienciaPrev;
    }

    public void analizarUsuario() {
        System.out.println("Nombre: " + getNombre() + "\nRUN: " + getRun() + "\nÁrea: " + area
                + "\nExperiencia previa: " + experienciaPrev);
    }

}
