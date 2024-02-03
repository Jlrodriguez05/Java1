package B3;

public class Trabajo4 {
    // Seleccionar estrcuturas de dato
    // Hacer un programa que capture el promedio de la nota de 5 estudiantes y que almacene los datos como nombre, y telefono
    public static void main(String[] args) {
        Estudiante [] NotasE = new Estudiante[5];
        NotasE[0] = new Estudiante("Jose", 2,"300452489");
        NotasE[1] = new Estudiante("Carlos",5,"300452994");
        NotasE[2] = new Estudiante("Carolina",3,"300452447");
        NotasE[3] = new Estudiante("Daniela",4,"300452123");
        NotasE[4] = new Estudiante("Andres",2,"300052756");

        double suma=0;
        double prom=0;
        for (int i=0;i<NotasE.length;i++){
            suma += NotasE[i].getNota();
        }
        prom = suma/ NotasE.length;
        System.out.println("El promedio de nota de los 5 estudiantes es de: " + prom);
    }


}



