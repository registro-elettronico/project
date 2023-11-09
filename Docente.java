import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Docente {
    private String nome;
    private String cognome;
    private String username;
    private String password;
    private List<Materia> materie;
    private List<String> classi;

    public Docente(String nome, String cognome, String username, String password, List<Materia> materie, List<String> classi) {
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.password = password;
        this.materie = materie;
        this.classi = classi;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "Nome: " + nome + '\'' +
                "Cognome: " + cognome + '\'' +
                "Username: " + username + '\'' +
                "Password: " + password + '\'' +
                "Materie: " + materie +
                "Classi: " + classi +
                '}';
    }

    public List<String> getClassi() {
        return classi;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Materia> getMaterie() {
        return materie;
    }

    public void setMaterie(List<Materia> materie) {
        this.materie = materie;
    }

    // AZIONI DOCENTE
    public void inserisciVoto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci voto:");
        float voto = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Inserisci materia:");
        String materia = scanner.nextLine();
        System.out.println("Inserisci cognome studente:");
        String cognome = scanner.nextLine();
        System.out.println("Inserisci nome studente:");
        String nome = scanner.nextLine();

        for (Studente studente : Main.studentiList) {
            if (studente.getNome().equals(nome) && studente.getCognome().equals(cognome)) {
                for (Materia m : materie) {
                    if (m.getNome().equals(materia)) {
                        studente.getVoti().add(new Voto(new Date(), m, voto, this));
                        System.out.println("Voto inserito");
                        return;
                    }
                }
            }
        }
        System.out.println("Studente non trovato");
    }

    public void inserisciAssenza() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci cognome studente:");
        String cognome = scanner.nextLine();
        System.out.println("Inserisci nome studente:");
        String nome = scanner.nextLine();
        System.out.println("Inserisci motivazione:");
        String motivazione = scanner.nextLine();

        Date dataAssenza = null;
        do {
            System.out.println("Inserisci data (nel formato giorno/mese/anno):");
            String data = scanner.nextLine();
            try {
                dataAssenza = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            } catch (ParseException ignored) {
            }
        } while (dataAssenza == null);

        for (Studente studente : Main.studentiList) {
            if (studente.getNome().equals(nome) && studente.getCognome().equals(cognome)) {
                studente.getAssenze().add(
                        new Assenza(dataAssenza, motivazione)
                );
                System.out.println("Assenza inserita");
                return;
            }
        }
        System.out.println("Studente non trovato");
    }

    public void visualizzaClasse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci classe:");
        String classe = scanner.nextLine();
        for (Studente studente : Main.studentiList) {
            if (studente.getClasse().equals(classe)) {
                System.out.println(studente);
            }
        }
    }
}