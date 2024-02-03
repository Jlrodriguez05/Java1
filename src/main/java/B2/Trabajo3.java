// VALIDAR NUMERO POSITIVO O NEGATIVO
package B2;

import java.util.Scanner;

// validar si un numero es psitivo negativo o 0
public class Trabajo3 {


    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un texto
        System.out.print("Ingrese el numero: ");
        // Leer la entrada del usuario
        Integer numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("el numero es positivo");
        } else if (numero < 0){
            System.out.println("el numero es negativo");
        } else if (numero == 0){
            System.out.println("el numero es 0");

        }



        // Cerrar el Scanner
        scanner.close();
    }
}
