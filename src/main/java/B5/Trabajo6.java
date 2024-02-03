package B5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

//Ejericicio Final
//Calculadora de edad. pedir fecha de nacimiento (yyyy-MM-dd) y calcular la edad de la persona.
public class Trabajo6 {
    public static void main(String[] args) {
        try {
            LocalDate localDate = LocalDate.now();
            Scanner scanner = new Scanner(System.in);
            LocalTime localTime = LocalTime.now();
            System.out.println(localDate);


            System.out.print("Ingrese Fecha de nacimiento en formato DD/MM/YYYY: ");
            String fecha_nac = localTime.format(DateTimeFormatter.ofPattern(scanner.next()));
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate Fecha_nac = LocalDate.parse(fecha_nac, formato);

            LocalDate fecha_act = LocalDate.now();
            Period periodo = Period.between(Fecha_nac, fecha_act);
            System.out.println("Actualmente tu tienes :" + periodo.getYears() + " años " +
                    periodo.getMonths() + " meses y " + periodo.getDays() + " dias");
        }catch (DateTimeParseException e){
            System.out.println("ERROR!:ingrese la fecha con Formato \n DD/MM/YYYY \n"+e);
        } catch (RuntimeException ex2){
        System.out.println("ERROR EXCEPCION NO CONTROLADA"+ ex2);
    }

        System.out.println("El programa corre OK");
    }
}
