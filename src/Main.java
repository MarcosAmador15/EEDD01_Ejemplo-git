import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        int vi = 1;
        double vd = 2.3;
        char vc = 'a';
        String cad = "hola";

        //+ Activa como operador de concatenacion
        System.out.println("vi" + vi +"vd" + vd);


        //Leyendo datos del teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor entero");
        vi=sc.nextInt();
        System.out.println("Valor entero leido: " + vi);

        //Sentencia de bifurcacion
        if(vi % 2 == 0){
            System.out.println("El numero: " + vi + " es un numero par");
        }else {
            System.out.println("El numero: " + vi + " es un numero impar");
        }

        //Sentencia de bifurcacion anidada
        if(vi < 50){
            System.out.println("El numero: " + vi + " es un numero menor que 50");
        }else if(vi > 50){
            System.out.println("El numero: " + vi + " es un numero mayor que 50");
        }else{
            System.out.println("El numero: " + vi + " es == 50");
        }

        //Sentencia switch-case
        System.out.println("Introduzca un color (R/r,V/v,A/a): ");
        cad=sc.next();
        vc =cad.charAt(0);

        switch(vc){
            case 'R':
            case 'r':
                System.out.println("Color Rojo");
                break;
            case 'V':
            case 'v':
                System.out.println("Color Verde");
                break;
            case 'A':
            case 'a':
                System.out.println("Color Azul");
                break;

                default:
                    System.out.println("Color erroneo");
        }

        //Bucles cuando se conoce a priori el numero de iteraciones
        int suma1= 0, suma2= 0;
        for(int i=0; i<10; i++){
            suma1=suma1+i;
            suma2+=i;
        }
        System.out.println("Suma1: " + suma1 + " Suma2: " + suma2);

        //Bucles while cuando no es conocido a priori el numero de iteraciones
        //Bucle que solicite numeros al usuario hasta que introduzca un numero par

        int num= 1;
        while(num % 2 !=0){
            int numero= 0;
            System.out.println("Introduzca un numero para ver si es par. Si es impar se lo volvera a pedir ");
            numero=sc.nextInt();
            num = numero%2;
        }
        System.out.println("El numero ingresado es par");




        }
    }
