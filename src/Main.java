import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String opMenu = null;
        boolean flagFecha = false;
        // Var Cliente
        String nombre = "", rut = "", fechaNacimiento = "", fono = "", afp = "", salud = "", direccion = "",
                comuna = "";
        LocalDate fechaNac;
        boolean rutValido;
        int edad = 0;
        // Var Profesional
        String titulo = "", fechaIng = "";
        LocalDate fechaIngreso;

        // administrativo
        String area = "", expPrevia = "";

        Contenedor contenedor = new Contenedor();

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
                    flagFecha = false;
                    do {
                        System.out.println("Ingrese fecha de nacimiento [12/03/2023]");
                        fechaNacimiento = sc.nextLine();
                        flagFecha = Utilidades.validarFormatoFecha(fechaNacimiento);
                        if (!flagFecha) {
                            System.out.println("** [ E R R O R ] **   Formato de Fecha Invalido: " + fechaNacimiento);
                        }
                    } while (!flagFecha || fechaNacimiento.isEmpty());
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
                    fechaNac = Utilidades.convertirFecha(fechaNacimiento);
                    // Asignaciones y validaciones a variables terminadas
                    contenedor.almacenarUsuario(
                            new Cliente(nombre, fechaNac, rut, fono, afp, salud, direccion, comuna, edad));

                    System.out.println("[ ** OK ** ] Cliente agregado con éxito, presione [ENTER] para continuar!");
                    sc.nextLine();

                    break;
                case "2":

                    nombre = Utilidades.ValidaString(nombre, "nombre completo", 10, 50);

                    do {
                        System.out.println("Ingrese Rut sin puntos y con guion [11111111-1]");
                        rut = sc.nextLine();
                        rutValido = Utilidades.validarRut(rut);
                        if (!rutValido) {
                            System.out.println("** [ E R R O R ] **   RUT Invalido: " + rut);
                        }
                    } while (!rutValido);

                    flagFecha = false;
                    do {
                        System.out.println("Ingrese fecha de nacimiento [12/03/2023]");
                        fechaNacimiento = sc.nextLine();
                        flagFecha = Utilidades.validarFormatoFecha(fechaNacimiento);
                        if (!flagFecha) {
                            System.out.println("** [ E R R O R ] **   Formato de Fecha Invalido: " + fechaNacimiento);
                        }
                    } while (!flagFecha || fechaNacimiento.isEmpty());

                    titulo = Utilidades.ValidaString(titulo, "Titulo", 5, 20);
                    fechaNac = Utilidades.convertirFecha(fechaNacimiento);
                    flagFecha = false;
                    do {
                        System.out.println("Ingrese fecha de Ingreso [12/03/2023]");
                        fechaIng = sc.nextLine();
                        flagFecha = Utilidades.validarFormatoFecha(fechaIng);
                        if (!flagFecha) {
                            System.out.println("** [ E R R O R ] **   Formato de Fecha Invalido: " + fechaNacimiento);
                        }
                    } while (!flagFecha || fechaIng.isEmpty());
                    fechaIngreso = Utilidades.convertirFecha(fechaIng);
                    contenedor.almacenarUsuario(new Profesional(nombre, fechaNac, rut, titulo, fechaIngreso));
                    System.out.println("[ ** OK ** ] Profesional agregado con éxito, presione [ENTER] para continuar!");
                    sc.nextLine();

                    break;
                case "3":

                    nombre = Utilidades.ValidaString(nombre, "nombre completo", 10, 50);

                    do {
                        System.out.println("Ingrese Rut sin puntos y con guion [11111111-1]");
                        rut = sc.nextLine();
                        rutValido = Utilidades.validarRut(rut);
                        if (!rutValido) {
                            System.out.println("** [ E R R O R ] **   RUT Invalido: " + rut);
                        }
                    } while (!rutValido);

                    flagFecha = false;
                    do {
                        System.out.println("Ingrese fecha de nacimiento [12/03/2023]");
                        fechaNacimiento = sc.nextLine();
                        flagFecha = Utilidades.validarFormatoFecha(fechaNacimiento);
                        if (!flagFecha) {
                            System.out.println("** [ E R R O R ] **   Formato de Fecha Invalido: " + fechaNacimiento);
                        }
                    } while (!flagFecha || fechaNacimiento.isEmpty());

                    area = Utilidades.ValidaString(area, "area", 5, 20);
                    expPrevia = Utilidades.ValidaString(expPrevia, "experiencia previa", 1, 100);
                    fechaNac = Utilidades.convertirFecha(fechaNacimiento);

                    contenedor.almacenarUsuario(new Administrativo(nombre, fechaNac, rut, area, expPrevia));

                    break;
                case "4":

                    break;
                case "5":

                    break;
                case "6":
                    do {
                        System.out.println("Ingrese Rut sin puntos y con guion [11111111-1]");
                        rut = sc.nextLine();
                        rutValido = Utilidades.validarRut(rut);
                        if (!rutValido) {
                            System.out.println("** [ E R R O R ] **   RUT Invalido: " + rut);
                        }
                    } while (!rutValido);

                    contenedor.eliminarUsuario(rut);

                    break;

                case "7":

                    break;

                case "8":
                    // contenedor.listarClientes();
                    // contenedor.listarAdministrativos();
                    // contenedor.listarProfesionales();
                    contenedor.analizaUsuario();

                    break;

                case "9":

                    break;

                case "0":
                    System.exit(0);
                    break;

                default:
                    System.out.println("** [ E R R O R ] **   Valor inesperado para: " + opMenu);

            }
            opMenu = "";
        } while (opMenu.isEmpty());

    }
}