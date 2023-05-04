
import java.util.Scanner;
import java.util.UUID;

public class Utilidades {
    private static final Scanner sc = new Scanner(System.in);

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



}
