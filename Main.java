import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Studente> studentiList = new ArrayList<>();
    public static List<Docente> docentiList = new ArrayList<>();
    
    
    public static void main(String[] args) {
        // Popola base di dati
        popolaDocenti();
        popolaStudenti();
        popolaVoti();

        // Login
        Object utente;
        do {
            utente = login();
        } while (utente == null);

        // Menu
        while (true) {
            if (utente instanceof Studente studente) {
                System.out.println("1. Visualizza voti");
                System.out.println("2. Visualizza assenze");
                System.out.println("0. Esci");
                Scanner scanner = new Scanner(System.in);
                int scelta = scanner.nextInt();
                switch (scelta) {
                    case 1:
                        System.out.println(studente.getVoti());
                        break;
                    case 2:
                        System.out.println(studente.getAssenze());
                        break;
                    case 0:
                        return;
                }
            } else if (utente instanceof Docente docente) {
                System.out.println("1. Inserisci voto");
                System.out.println("2. Inserisci assenza");
                System.out.println("3. Visualizza classe");
                System.out.println("0. Esci");
                Scanner scanner = new Scanner(System.in);
                int scelta = scanner.nextInt();
                switch (scelta) {
                    case 1:
                        docente.inserisciVoto();
                        break;
                    case 2:
                        docente.inserisciAssenza();
                        break;
                    case 3:
                        docente.visualizzaClasse();
                        break;
                    case 0:
                        return;
                }
            } else {
                System.out.println("Ma questo chi è?");
                return;
            }
        }
    }

    private static Object login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci username:");
        String username = scanner.nextLine();
        System.out.println("Inserisci password:");
        String password = scanner.nextLine();

        // Login docenti
        for (Docente docente : docentiList) {
            if (docente.getUsername().equals(username) && docente.getPassword().equals(password)) {
                System.out.println("Benvenuto " + docente.getNome() + " " + docente.getCognome());
                return docente;
            }
        }

        // Login studenti
        for (Studente studente : studentiList) {
            if (studente.getUsername().equals(username) && studente.getPassword().equals(password)) {
                System.out.println("Benvenuto " + studente.getNome() + " " + studente.getCognome());
                return studente;
            }
        }

        System.out.println("Username o password errati");
        return null;
    }

    private static void popolaDocenti() {
        docentiList.add(new Docente(
                "Nunziatina",
                "Maisano",
                "maisanonun",
                "maisano",
                new ArrayList<>() {{
                    add(new Materia("Italiano"));
                    add(new Materia("Storia"));
                }},
                new ArrayList<>() {{
                    add("1E");
                    add("2E");
                    add("4E");
                    add("5E");
                }}
        ));
        docentiList.add(new Docente(
                "Marco",
                "Marinello",
                "marinellomar",
                "marinello",
                new ArrayList<>() {{
                    add(new Materia("Informatica"));
                    add(new Materia("TPSIT"));
                }},
                new ArrayList<>() {{
                    add("3J");
                    add("3K");
                    add("4E");
                    add("4K");
                }}
        ));
        docentiList.add(new Docente(
                "Alfredo",
                "Cantarella",
                "cantarellaalf",
                "cantarella",
                new ArrayList<>() {{
                    add(new Materia("Sistemi e Reti"));
                    add(new Materia("Scienze e Tecnologie Applicate"));
                }},
                new ArrayList<>() {{
                    add("2E");
                    add("3E");
                    add("3K");
                    add("4E");
                    add("4K");
                }}
        ));
    }
    private static void popolaStudenti() {
        studentiList.add(new Studente(
                "Thomas",
                "Chiocchetti",
                "chiocchettitho",
                "chiocchetti",
                "4E"
        ));
        studentiList.add(new Studente(
                "Alex",
                "De Carli",
                "decarliale",
                "decarli",
                "4E"
        ));
        studentiList.add(new Studente(
                "Edina",
                "Perviz",
                "pervizedi",
                "perviz",
                "4E"
        ));
    }
    private static void popolaVoti() {
        for (Studente studente : studentiList) {
            for (Docente docente : docentiList) {
                for (Materia materia : docente.getMaterie()) {
                    studente.getVoti().add(new Voto(
                            new Date(),
                            materia,
                            (float) (Math.random() * 10),
                            docente
                    ));
                }
            }
        }
    }
}