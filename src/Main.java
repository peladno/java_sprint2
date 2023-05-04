
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String opMenu = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("** BIENVENIDO AL SISTEMA **");
        System.out.println("***************************");
        System.out.println(" ");
        do {
            for (String s : Arrays.asList("", "** [ MENÚ PRINCIPAL ] **", "Seleccione una opcion:",
                    " [ 1 ] Agregar Cliente.", " [ 2 ] Agregar Profesional.", " [ 3 ] Agregar Administrativo.",
                    " [ 4 ] Agregar Capacitacion.", " [ 5 ] Eliminar Usuario.", " [ 6 ] Listar Usuarios.",
                    " [ 7 ] Listar Usuarios por Tipo.", " [ 8 ] Listar Capacitaciones.", " [ 9 ] Salir.")) {
                System.out.println(s);
            }
            opMenu = sc.nextLine();

            switch (opMenu) {
                case "1":

                    break;
                case "2":

                    break;
                case "3":

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":

                    break;

                case "7":

                    break;

                case "8":

                    break;

                case "9":
                    System.exit(0);
                    break;
                default:
                    System.out.println("** [ E R R O R ] **   Valor inesperado para: " + opMenu);
                    opMenu = "";
            }
        } while (opMenu.isEmpty());
        // String nombre="";
        // nt numero=0;
        // nombre=Utilidades.ValidaVacio(nombre, "nombre");
        // numero=Utilidades.ValidaNumero(numero,"numero");

    }

    // nombre=if(Utilidades.validarLongitud(Utilidades.ValidaVacio(nombre,"Nombres"),10,50));

}