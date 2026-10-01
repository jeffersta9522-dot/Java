import java.util.Scanner;

public class practica {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;

        System.out.println("###########");
        System.out.println("Escoge un color");
        System.out.println("1. Morado");
        System.out.println("2. Azul");
        System.out.println("3. Negro");

        opcion = entrada.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("Tu color te suma 10 puntos");
                break;

            case 2:
                System.out.println("Tu color te resta 5 puntos");
                break;

            case 3:
                System.out.println("Tu color te permite avanzar dos casillas");
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }

        entrada.close();
    }
}