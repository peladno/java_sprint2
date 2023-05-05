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

    // en teoria funciona, pero no probe con distintos tipos de usuarios

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

    // public void listarUsuarios() {
    // for (Usuario ase : usuarios) {
    // System.out.println(ase.toString());
    // }
    // }

    public void listarCapacitaciones() {
        for (Capacitacion cap : capacitaciones) {
            System.out.println(cap.toString());
        }
    }
}
