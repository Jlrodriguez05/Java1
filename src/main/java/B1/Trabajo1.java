//CALCULADORA
package B1;
import java.util.Scanner;
public class Trabajo1 { // CALCULADORA
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un texto
        System.out.print("Ingrese el numero 1: ");

        // Leer la entrada del usuario
        Integer Entero1 = scanner.nextInt();

        System.out.print("Ingrese el numero 2: ");

        // Leer la entrada del usuario
        Integer Entero2 = scanner.nextInt();


        // Mostrar el texto ingresado por el usuario

        Integer suma = Entero1 + Entero2;
        Integer resta = Entero1 - Entero2;
        Integer div = Entero1 / Entero2;
        Integer mul = Entero1 * Entero2;
        System.out.println("La suma es: " + suma );
        System.out.println("La resta es: " + resta);
        System.out.println("La division es: "+ div);
        System.out.println("La multiplicacion es: "+ mul);

        // Cerrar el Scanner
        scanner.close();
    }
}
