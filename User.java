import java.util.Scanner;

public class User {

    String ID;
    String nome;
    String cognome;
    boolean hasUserPrivileges;
    String password;
    String materia;
    String classe;
    String classe1;
    String classe2;
    String classe3;
    double[] votiIF = new double[5];
    double[] votiTD = new double[5];
    double[] votiTC = new double[5];
    String[] note = new String[3];
    String[] assenze = new String[10];

    User(String ID, String nome, String cognome, boolean hasUserPrivileges){

        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
        this.hasUserPrivileges = hasUserPrivileges;
        this.password = password;

        if(!hasUserPrivileges){
            this.classe = classe;

            for (int i = 0; i < 5; i++) {
                this.votiIF[i] = votiIF[i];
                this.votiTD[i] = votiTD[i];
                this.votiTC[i] = votiTC[i];
            }

            for (int i = 0; i < 3; i++) {
                this.note[i] = note[i];
            }

            for (int i = 0; i < 10; i++) {
                this.assenze[i] = assenze[i];
            }

        } else {
            this.materia = materia;
            this.classe1 = classe1;
            this.classe2 = classe2;
            this.classe3 = classe3;
        }
    }

    void benvenuto() {
        System.out.println("Benvenuto " + this.nome + this.cognome);
    }

    static void displayVotiIF() {
        System.out.println("Questi sono i voti di informatica di " + this.nome + this.cognome);

        for (int i = 0; i < 5; i++) {
            System.out.println(votiIF[i]);
        }
    }

    void displayVotiTD(){
        System.out.println("Questi sono i voti di tedesco di " + this.nome + this.cognome);

        for (int i = 0; i < 5; i++) {
            System.out.println(votiTD[i]);
        }
    }

    void displayVotiTC(){
        System.out.println("Questi sono i voti di telecomunicazioni di " + this.nome + this.cognome);

        for (int i = 0; i < 5; i++) {
            System.out.println(votiTC[i]);
        }
    }

    void diaplayNote(){
        for (int i = 0; i < 5; i++) {
            System.out.println(note[i]);
        }
    }

    void diaplayAssenze(){
        for (int i = 0; i < 5; i++) {
            System.out.println(assenze[i]);
        }
    }
}
