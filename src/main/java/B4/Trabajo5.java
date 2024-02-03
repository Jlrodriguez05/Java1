package B4;
import B2.persona;
import B3.Estudiante;

import java.util.Arrays;
import java.util.Scanner;
public class Trabajo5 {
    // Estrcutura ciclica y clase Estudiante del paquete B3.
    //Realizar el trabajo 4 con cilcos
    public static void main(String[] args) {
        Estudiante[] NotasE = new Estudiante[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < NotasE.length ; i++) {
            int j=i+1;
            Estudiante Est = new Estudiante();
            System.out.print("Ingrese Nombre del Estudiante numero "+j+": ");
            Est.setNom(scanner.next());
            System.out.print("Ingrese Nota del Estudiante numero "+j+": ");
            Est.setNota(scanner.nextInt());
            System.out.print("Ingrese Numero del Estudiante numero "+j+": ");
            Est.setTel(scanner.next());
            NotasE[i]=Est;
        }
        double suma=0;
        double prom=0;
        for (int i=0;i<NotasE.length;i++){
            suma += NotasE[i].getNota();
        }
        prom = suma/ NotasE.length;
        System.out.println("EL PROMEDIO DE NOTA DE LOS 5 ESTUDIANTES ES DE: " + prom);

       // Arrays.stream(NotasE).forEach(a->System.out.println(a.getNom()+"---"+a.getNota()+"---"+a.getTel()));

    }
}
