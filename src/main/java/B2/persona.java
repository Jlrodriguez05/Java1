package B2;

public class persona {
    public persona(){

    }
    persona (int edad){
        this.edad =edad;
    }
   /* persona (int edad,char genero){
       this.edad =edad;
        this.genero =genero;
    }*/
    //persona (String tamano, String colorPelo ){

    //}
     private String tamano;



    private String nombre;
     private int edad;
    private char genero;
    private boolean tienepelo;
    private String colorPelo;
    private String profesion;


    public   void respirar (){
        System.out.print("Respire");
    }
    private  void dormir (){
        System.out.print("Respire");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
