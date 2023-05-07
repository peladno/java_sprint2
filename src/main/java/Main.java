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
        LocalDate fechaNac, fechaAcc;
        boolean rutValido = false;
        int edad = 0;
        // Var Profesional
        String titulo = "", fechaIng = "";
        LocalDate fechaIngreso;

        // administrativo
        String area = "", expPrevia = "";

        //capacitaciones
        String dia = "", lugar = "", duracion = "";
        int canAsistentes = 0, idCap = 0, hora = 0;
        boolean buscaRut, flagDiaSem = false;

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

                    System.out.println("[ ** ASIGNAR CAPACITACION A CLIENTE ** ]");

                    System.out.println("Ingrese Rut del Cliente sin puntos y con guion [11111111-1]");
                    rut = sc.nextLine();
                    rutValido = Utilidades.validarRut(rut);
                    buscaRut = contenedor.buscarUsuario(rut);

                    if (rutValido) {
                        if (buscaRut) {
                            idCap = contenedor.capacitaciones.size() + 1;
                            do {
                                System.out.println("Ingrese dia de la semana para Capacitacion [LUNES, MARTES, MIERCOLES, " +
                                        "JUEVES, VIERNES, SABADO, DOMINGO]");
                                dia = sc.nextLine();
                                flagDiaSem = Utilidades.validaDia(dia);
                            } while (!flagDiaSem);
                            hora = Utilidades.ValidaNumero(hora, "hora formato numerico entre 1 y 22", 1, 22);
                            lugar = Utilidades.ValidaString(lugar, "lugar de la capacitacion", 10, 50);
                            duracion = Utilidades.ValidaString(duracion, "duracion", 1, 70);
                            canAsistentes = Utilidades.ValidaNumero(canAsistentes, "Cantidad de Asistentes", 1, 100);
                            contenedor.almacenarCapacitacion(new Capacitacion(idCap, rut, dia, hora, lugar, duracion, canAsistentes));
                            System.out.println("[ ** O K ** ] Capacitacion agregada con Exito!");
                        } else {
                            System.out.println("[ ** ERROR ** ] Rut " + rut + " No se encuentra en el Registro, " +
                                    "por favor ingrese el rut " +
                                    "como clientes o  vuelva a intentar con otro rut");
                        }
                        System.out.println(" ");
                        System.out.println("[ ** Presione [ENTER] para continuar ** ]");
                        sc.nextLine();
                    }


                    break;
                case "5":

                    String tipoAccidente = "";
                    do {
                        System.out.println("Ingrese tipo de accidente [leve, grave, fatal]");
                        tipoAccidente = sc.nextLine().toLowerCase();
                    } while (!tipoAccidente.equals("leve") && !tipoAccidente.equals("grave") && !tipoAccidente.equals("fatal"));

                    String fechaAccidente = "";
                    do {
                        System.out.println("Ingrese fecha de accidente [12/03/2023]");
                        fechaAccidente = sc.nextLine();
                        flagFecha = Utilidades.validarFormatoFecha(fechaAccidente);
                        if (!flagFecha) {
                            System.out.println("** [ E R R O R ] **   Formato de Fecha Invalido: " + fechaAccidente);
                        }
                    } while (!flagFecha || fechaAccidente.isEmpty());
                    fechaAcc = Utilidades.convertirFecha(fechaAccidente);

                    String descripcionAccidente = Utilidades.ValidaString("", "descripcion del accidente", 1, 200);

                    contenedor.almacenarAccidente(new Accidente(tipoAccidente, fechaAcc, Utilidades.generarId(), descripcionAccidente));


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
                    System.out.println("[ ** OK ** ] presione [ENTER] para continuar!");
                    sc.nextLine();
                    break;

                case "7":
                    contenedor.analizaUsuario();
                    System.out.println("[ ** OK ** ] presione [ENTER] para continuar!");
                    sc.nextLine();
                    break;

                case "8":
                    contenedor.listarPorTipo();
                    System.out.println("[ ** OK ** ] presione [ENTER] para continuar!");
                    sc.nextLine();
                    break;

                case "9":
                    contenedor.listarCapacitaciones();
                    System.out.println("[ ** OK ** ] presione [ENTER] para continuar!");
                    sc.nextLine();
                    break;

                case "0":
                    System.exit(0);
                    break;

                default:
                    System.out.println("** [ E R R O R ] **   Valor inesperado para: " + opMenu + "\nElija opción válida");
                    System.out.println("[ ** OK ** ] presione [ENTER] para continuar!");
                    sc.nextLine();

            }
        } while (true);

    }
}