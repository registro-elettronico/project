import java.util.Scanner;

public class User {

    private String ID;
    private String nome;
    private String cognome;
    private boolean hasUserPrivileges;
    private String password;
    private String materia;
    private String classe;
    private String classe1;
    private String classe2;
    private String classe3;
    private double[] votiIF = new double[5];
    private double[] votiTD = new double[5];
    private double[] votiTC = new double[5];
    private String[] note = new String[3];
    private Assenze assenze;
    private Annotazioni annotazioni;
    

    User(String ID, String nome, String cognome, boolean hasUserPrivileges, String password){

        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
        this.hasUserPrivileges = hasUserPrivileges;
        this.password = password;
        this.assenze = new Assenze();
        this.annotazioni = new Annotazioni();
        
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

    void displayVotiIF() {
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

    public void displayVotiTutti(){
        for (int i = 0; i < 5; i++) {
            System.out.println(votiIF[i]);
            System.out.println(votiTD[i]);
            System.out.println(votiTC[i]);
        }
    }

    public void diaplayNote(){
        for (int i = 0; i < 5; i++) {
            System.out.println(note[i]);
        }
    }

    public Assenze getAssenze(Assenze assenze){
        return assenze;
    }

    public void setAssenze(Assenze assenze) {
        this.assenze = assenze;
    }

}
