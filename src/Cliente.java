import java.time.LocalDate;

public class Cliente extends Usuario {

    private String telefono;
    private String afp;
    private String sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente(String nombre, LocalDate fechaNacimiento, String run, String telefono, String afp, String sistemaSalud, String direccion, String comuna, int edad) {
        super(nombre, fechaNacimiento, run);
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getAfp() {
        return afp;
    }

    public String getSistemaSalud() {
        return sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String mostrarEdad() {
        System.out.println("El usuario tiene " + this.edad + " años");
        return null;
    }
    
    @Override
    public void analizarUsuario() {
        System.out.println("Nombre: " + super.getNombre() + ", RUT: " + super.getRun());
    }
}
