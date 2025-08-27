package perro;

import java.util.Scanner;

public class Slinky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int numero1;
        int numero2;
        int operacion;

        do {
            System.out.println("------------------ Menú Principal -------------");
            System.out.println("1. suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("Elige una opción: ");
            operacion = scanner.nextInt();
            System.out.println("Elige un número: ");
            numero1 = scanner.nextInt();
            System.out.println("Elige otro número:");
            numero2 = scanner.nextInt();


            switch (operacion) {
                case 1:
                    int suma = numero1 + numero2;
                    System.out.println("la suma es " + suma);
                    break;
                case 2:
                    int resta = numero1 - numero2;
                    System.out.println("La resta es" + resta);
                    break;
                case 3:
                    int mult = numero1 * numero2;
                    System.out.println("La multiplicacion es" + mult);
                    break;
                case 4:
                    if (numero2 == 0){
                        System.out.println("No se puede dividir un numero entre 0");
                    }else{
                        int div = numero1 / numero2;
                        System.out.println("La división es" + div);
                        break;
                    }

                default:
                    System.out.println("Número no válid0");
                    break;
            }

            System.out.println(); // Línea en blanco para mejor legibilidad

        } while (operacion != 4);

        scanner.close();
    }
}
