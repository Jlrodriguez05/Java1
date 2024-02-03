package B4;




import B2.persona;

import java.util.Arrays;
import java.util.Scanner;

public class Trabajo5_Profe {
    public static void main(String[] args) {
        persona[] miArreglo = new persona[3];

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < miArreglo.length ; i++) {
            persona p = new persona();
            System.out.print("Ingrese un Nombre: ");
            p.setNombre(scanner.next());
            System.out.print("Ingrese un edad: ");
            p.setEdad(scanner.nextInt());
            miArreglo[i]=p;
        }

        Arrays.stream(miArreglo).forEach(a->System.out.println(a.getNombre()+"---"+a.getEdad()));
    }

}