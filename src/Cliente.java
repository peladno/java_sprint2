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

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getComuna() {
        return comuna;
    }


    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void analizarUsuario() {
        System.out.println("Nombre: " + super.getNombre() + ", RUT: " + super.getRun());
    }
}
