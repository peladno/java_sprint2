


import java.util.Scanner;

public class Utilidades {
    public static String ValidaVacio(String str, String msj){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ingrese " + msj +":");
            str=sc.nextLine();
            if (str.isEmpty()){
                System.out.println("[ ** WARNING ** ] Campo Obligatorio para "+ msj);
            }
        }while(str.isEmpty());
        return str;
    }

//nombre=ValidaVacio(nombre,"Nombres");
    

public static int ValidaNumero(int num, String msj){
    Scanner sc = new Scanner(System.in);
    boolean esNumero = false;

    do {
        System.out.println("Ingrese " + msj + ":");
        if (sc.hasNextInt()){
            num=sc.nextInt();
            esNumero=true;
        }else{
            System.out.println("[ ** WARNING ** ] Valor ingresado  es invalido para "+ msj);
            sc.next();
            num=1;
        }
        if (num<1){
            System.out.println("[ ** WARNING ** ] Valor debe ser superior a "+ num);
            esNumero=false;
        }
    }while (!esNumero);
     return num;
 }

}