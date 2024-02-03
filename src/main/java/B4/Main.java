package B4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        int contador =0;
        while (contador < 5){
            System.out.println("El contador vale "+contador);
            contador ++;
        }
         contador =0;
        do{
            System.out.println("El contador vale "+contador);
            contador ++;
        } while (contador < 5);

        int [] miArreglo ={1,2,3,4};
        for (int i =0; i < miArreglo.length; i++ ){
            System.out.println("Mi arreglo vale "+miArreglo[i]);
        }
        List<String>Milista = List.of("Carlos","jose","Carolina");
        for (int i =0; i < Milista.size(); i++ ){
            System.out.println(Milista.get(i).toUpperCase());
        }
        for(String nombre:Milista){
            System.out.println(nombre);
        }
        Milista.stream().map(String::toUpperCase).forEach(System.out::println);

        List<Integer> arrayInt = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> impares= arrayInt.stream().filter(n-> n % 2 ==1).toList();
        System.out.println(impares);

        int suma = arrayInt.stream().mapToInt(Integer::intValue).sum();

        System.out.println(suma);
    }
}
