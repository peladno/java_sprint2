import java.util.ArrayList;
import java.util.List;

public class Contenedor {

    List<Asesoria> asesorias = new ArrayList<>();
    List<Capacitacion> capacitaciones = new ArrayList<>();
    List<Usuario> usuarios = new ArrayList<>();

    public void almacenarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    public void eliminarUsuario(String rut) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            if (usuario.getRun().equals(rut)) {
                usuarios.remove(i);
                break;
            }
        }
    }

    public void analizaUsuario() {

        for (Usuario usuario : usuarios) {
            usuario.analizarUsuario();
        }
    }

    public void listarPorTipo() {
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Cliente) {
                Cliente cliente = (Cliente) usuario;
                System.out.println("Cliente: " + cliente.getNombre() + " ");
            } else if (usuario instanceof Profesional) {
                Profesional profesional = (Profesional) usuario;
                System.out.println("Profesional: " + profesional.getNombre() + " ");
            } else if (usuario instanceof Administrativo) {
                Administrativo administrativo = (Administrativo) usuario;
                System.out.println("Administrativo: " + administrativo.getNombre() + " ");
            }
        }
    }

    public void listarCapacitaciones() {
        for (Capacitacion cap : capacitaciones) {
            System.out.println(cap.toString());
        }
    }
}
