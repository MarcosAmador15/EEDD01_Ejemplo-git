import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        int vi = 1;
        double vd = 2.3;
        char vc = 'a';
        String cadena = "hola";

        //+ Activa como operador de concatenacion
        System.out.println("vi" + vi +"vd" + vd);


        //Leyendo datos del teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor entero");
        vi=sc.nextInt();
        System.out.println("Valor entero leido: " + vi);

        if(vi % 2 == 0){
            System.out.println("El numero: " + vi + " es un numero par");
        }else {
            System.out.println("El numero: " + vi + " es un numero impar");
        }

        }
    }
