
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String opMenu = null;
        String nombre = "", rut = "", fechaNacimiento = "", fono = "", afp = "", salud = "", direccion = "",
                comuna = "";
        LocalDate fechaNac = null;
        boolean rutValido;
        int edad = 0;

        ArrayList<Cliente> cli = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("** BIENVENIDO AL SISTEMA **");
        System.out.println("***************************");
        System.out.println(" ");
        do {
            for (String s : Arrays.asList("", "** [ MENÚ PRINCIPAL ] **", "Seleccione una opcion:",
                    " [ 1 ] Agregar Cliente.", " [ 2 ] Agregar Profesional.", " [ 3 ] Agregar Administrativo.",

                    " [ 4 ] Agregar Capacitacion.", " [ 5 ] Agregar Accidente.", " [ 6 ] Eliminar Usuario.",
                    " [ 7 ] Listar Usuarios.",
                    " [ 8 ] Listar Usuarios por Tipo.", " [ 9 ] Listar Capacitaciones.", " [ 0 ] Salir.")) {

                System.out.println(s);
            }
            opMenu = sc.nextLine();

            switch (opMenu) {
                case "1":
                    nombre = Utilidades.ValidaString(nombre, "nombre completo", 10, 50);

                    do {
                        System.out.println("Ingrese Rut sin puntos y con guion [11111111-1]");
                        rut = sc.nextLine();
                        rutValido = Utilidades.validarRut(rut);
                        if (!rutValido) {
                            System.out.println("** [ E R R O R ] **   RUT Invalido: " + rut);
                        }
                    } while (!rutValido);
                    fechaNac = Utilidades.ValidaString(fechaNac, "Fecha de Nacimiento [12/03/2023]", 8, 10);
                    fono = Utilidades.ValidaString(fono, "Telefono", 5, 15);
                    afp = Utilidades.ValidaString(afp, "AFP", 4, 30);
                    do {
                        System.out.println("Seleccione Sistema de Salud");
                        System.out.println(" [ 1 ] FONASA");
                        System.out.println(" [ 2 ] ISAPRE");
                        salud = sc.nextLine();
                        switch (salud) {
                            case "1":
                                salud = "FONASA";
                                break;

                            case "2":
                                salud = "ISAPRE";
                                break;

                            default:
                                System.out.println("** [ E R R O R ] **   Opcion Invalida: " + salud);
                                break;
                        }
                    } while (salud.isEmpty());
                    direccion = Utilidades.ValidaString(direccion, "Direccion", 1, 70);
                    comuna = Utilidades.ValidaString(comuna, "comuna", 4, 50);
                    edad = Utilidades.ValidaNumero(edad, "Edad", 0, 150);
                    // Asignaciones y validaciones a variables terminadas
                    cli.add(new Cliente(nombre, fechaNac, rut, fono, afp, salud, direccion, comuna, edad));

                    System.out.println("Termino el case");
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

                    break;

                case "0":
                    System.exit(0);
                    break;

                default:
                    System.out.println("** [ E R R O R ] **   Valor inesperado para: " + opMenu);
                    opMenu = "";
            }
        } while (opMenu.isEmpty());

    }

}