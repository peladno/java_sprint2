
import java.util.Scanner;
import java.util.UUID;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Utilidades {
    private static final Scanner sc = new Scanner(System.in);
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public static String ValidaString(String str, String msj, int min, int max) {
        do {
            System.out.println("Ingrese " + msj + ":");
            str = sc.nextLine();
            if (str !=null ) {
                str=str.trim();
                if (str.length() < min) {
                    System.out.println("El campo requiere tener un minimo de " + min +" caracteres:" + str + " tiene " + str.length() + " caracteres");
                    str="";
                }
                if (str.length() > max) {
                    System.out.println("El campo supera el maximo de " + max +" caracteres:" + str + " tiene " + str.length() + " caracteres");
                    str="";
                }
            }
            if (str == null || str.trim().isEmpty()) {
                System.out.println("[ ** WARNING ** ] Campo obligatorio para " + msj);
            }
        } while (str == null || str.trim().isEmpty());

        return str;
    }

    // nombre=ValidaVacio(nombre,"Nombres");

    public static int ValidaNumero(int num, String msj, int min, int  max) {

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
            if (num > min) {
                System.out.println("[ ** WARNING ** ] Valor debe ser superior a " + min);
                esNumero = false;
            }
            if (num < max) {
                System.out.println("[ ** WARNING ** ] Valor No debe ser superior a " + max);
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


    public static boolean validarRut(String rut) {
        rut = rut.replaceAll("\\.|\\-", "");

        // Validar formato del rut
        if (!rut.matches("^\\d{7,8}[0-9Kk]{1}$")) {
            return false;
        }

        // Separar número y dígito verificador
        String num = rut.substring(0, rut.length() - 1);
        char dv = rut.charAt(rut.length() - 1);

        // Validar que el número del rut sea válido
        int numInt;
        try {
            numInt = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            return false;
        }
        if (numInt < 1 || numInt > 99999999) {
            return false;
        }

        // Validar el dígito verificador
        int m = 0, s = 1;
        for (; numInt != 0; numInt /= 10) {
            s = (s + numInt % 10 * (9 - m++ % 6)) % 11;
        }
        char dvCalculado = (char) (s != 0 ? s + 47 : 75);
        return Character.toUpperCase(dv) == Character.toUpperCase(dvCalculado);
    }
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






