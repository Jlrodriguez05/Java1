package B3;

import B2.persona;

import java.util.*;


public class Main {
    public static void main(String[] args) {






        int [] miArreglo2 = new int [5];
        char [] miArregloChar = new char[5];
        String [] miSArreglo3 = new String [5];

        int[] miArreglo ={1,2,3};
        String [] miArreglo4 = {"hola","mundo"};

        System.out.println(miArreglo[0]);
        System.out.println(miArreglo4.length);

//------------------------------------------------------------------
       List<String> miLista = new ArrayList<String>();
        miLista.add("leche");
        miLista.add("carne");
        miLista.remove("carne");
        miLista.size();
        System.out.println(miLista);
//--------------------------------------------------------------------------


      Queue<Integer> miCola = new LinkedList<>();
        miCola.add(1);
        miCola.add(2);
        miCola.add(3);
        int element =miCola.poll();
        int element2 =miCola.poll();
        int element3 =miCola.poll();
        System.out.println ("su turno en la cola es de " + element);
        System.out.println ("su turno en la cola es de " + element2);
        System.out.println ("su turno en la cola es de " + element3);
//-----------------------------------------------------------------------------------

        Stack<Integer>miPila = new Stack<>();
        miPila.push(1);
        miPila.push(2);
        miPila.push(3);
        int elemento =miPila.pop();
        System.out.println (elemento);
        elemento =miPila.pop();
        System.out.println (elemento);
        miPila.push(4);
        elemento =miPila.pop();
        System.out.println (elemento);


    }
}
