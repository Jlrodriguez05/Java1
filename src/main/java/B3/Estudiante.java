package B3;

public class Estudiante {
    public Estudiante() {
    }
    Estudiante (String nom,int nota, String tel) {
        this.nom =nom;
        this.nota =nota;
        this.tel=tel;
    }

    private int nota;
    private String nom;
    private String tel;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public static void respirar (){
        System.out.print("Respire");
    }
}
