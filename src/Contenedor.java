import java.util.ArrayList;
import java.util.List;

public class Contenedor {
    private List<Asesoria> asesorias;
    private List<Capacitacion> capacitaciones;
    private List<Usuario> usuarios;

    public Contenedor() {
        asesorias = new ArrayList<>();
        capacitaciones = new ArrayList<>();
    }

    public void almacenarCliente(Cliente cliente) {
        asesorias.add(cliente);
    }

    public void almacenarProfesional(Profesional profesional) {
        asesorias.add(profesional);
    }

    public void almacenarAdministrativo(Administrativo administrativo) {
        asesorias.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public void analizaUsuario() {

        for (Usuario usuario : usuarios) {
            usuario.analizarUsuario();
        }
    }
    public void listarUsuarios() {
        for (Asesoria a : asesorias) {
            System.out.println(a.toString());
        }
    }

    public void listarUsuariosPorTipo(String tipo) {
        for (Asesoria a : asesorias) {
            if (a.getClass().getSimpleName().equals(tipo)) {
                System.out.println(a.toString());
            }
        }
    }

    public void listarCapacitaciones() {
        for (Capacitacion c : capacitaciones) {
            System.out.println(c.toString());
        }
    }
}
