
import java.util.Scanner;
import java.util.UUID;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Utilidades {
    private static final Scanner sc = new Scanner(System.in);
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public static String ValidaVacio(String str, String msj) {

        do {
            System.out.println("Ingrese " + msj + ":");
            str = sc.nextLine();
            if (str.isEmpty()) {
                System.out.println("[ ** WARNING ** ] Campo Obligatorio para " + msj);
            }
        } while (str.isEmpty());
        return str;
    }

    // nombre=ValidaVacio(nombre,"Nombres");

    public static int ValidaNumero(int num, String msj) {

        boolean esNumero = false;

        do {
            System.out.println("Ingrese " + msj + ":");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                esNumero = true;
            } else {
                System.out.println("[ ** WARNING ** ] Valor ingresado  es invalido para " + msj);
                sc.next();
                num = 1;
            }
            if (num < 1) {
                System.out.println("[ ** WARNING ** ] Valor debe ser superior a " + num);
                esNumero = false;
            }
        } while (!esNumero);
        return num;
    }

    public int descomponerRut(String rut) {
        String[] parts = rut.split("-");
        return Integer.parseInt(parts[0]);
    }

    public static String generarId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    public static boolean chequearMinMax(String str, int min, int max) {
        try {
            int num = Integer.parseInt(str);
            return num >= min && num <= max;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean validarLongitud(String str, int min, int max) {
        boolean longitudValida = false;

        if (str != null && str.length() >= min && str.length() <= max) {
            longitudValida = true;
        } else {
            System.out.println("El campo requiere tener entre " + min + " y " + max + " caracteres");
        }

        return longitudValida;
    }

    public static boolean validarFecha(String fecha) {
        try {
            DATE_FORMAT.parse(fecha);
            return true;
        } catch (ParseException e) {
            System.out.println("Fecha ingresada no es válida. Formato esperado: DD/MM/AAAA");
            return false;
        }
    }

    public static boolean validarHora(String hora) {
        String[] partesHora = hora.split(":");
        if (partesHora.length != 2) {
            System.out.println("Hora ingresada no es válida. Formato esperado: HH:MM");
            return false;
        }

        try {
            int horas = Integer.parseInt(partesHora[0]);
            int minutos = Integer.parseInt(partesHora[1]);

            if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
                System.out.println("Hora ingresada no es válida. Formato esperado: HH:MM");
                return false;
            }

            return true;
        } catch (NumberFormatException e) {
            System.out.println("Hora ingresada no es válida. Formato esperado: HH:MM");
            return false;
        }
    }

}
