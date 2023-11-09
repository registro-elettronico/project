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

        printLogo();
        
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
        System.out.println("\n\nInserisci username:");
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
        docentiList.add(new Docente(
                "Maria",
                "Cannone",
                "cannonemar",
                "cannone",
                new ArrayList<>() {{
                    add(new Materia("TPSIT"));
                    add(new Materia("Informatica"));
                }},
                new ArrayList<>() {{
                    add("4L");
                    add("3E");
                    add("4E");
                    add("5I");
                    add("5E");
                }}
        ));
        docentiList.add(new Docente(
                "Guido",
                "Tufano",
                "tufanogui",
                "tufano",
                new ArrayList<>() {{
                    add(new Materia("Tedesco"));
                }},
                new ArrayList<>() {{
                    add("1E");
                    add("2D");
                    add("2E");
                    add("5A");
                    add("4E");
                }}
        ));
        docentiList.add(new Docente(
                "Andrea",
                "Cestari",
                "cestariand",
                "cestari",
                new ArrayList<>() {{
                    add(new Materia("Telecomunicazioni"));
                    add(new Materia("TPSIT"));
                    add(new Materia("Elettronica ed Elettrotecnica"));
                    add(new Materia("Installazione e Manutenzione"));
                    add(new Materia("Tecnologie Informatiche"));
                }},
                new ArrayList<>() {{
                    add("3G/N");
                    add("1B");
                    add("5F");
                    add("3MAT");
                    add("4E");
                }}
        ));
        docentiList.add(new Docente(
                "Christian",
                "Gobbo",
                "gobbochr",
                "gobbo",
                new ArrayList<>() {{
                    add(new Materia("Inglese"));
                }},
                new ArrayList<>() {{
                    add("3Q");
                    add("2I");
                    add("2C");
                    add("5F");
                    add("5B");
                    add("1E");
                    add("4E");
                }}
        ));
        docentiList.add(new Docente(
                "Jacopo",
                "Di Cello",
                "dicellojac",
                "dicello",
                new ArrayList<>() {{
                    add(new Materia("Scienze motorie e sportive"));
                }},
                new ArrayList<>() {{
                    add("5L");
                    add("3K");
                    add("4E");
                    add("2F");
                    add("2OD");
                    add("3J");
                    add("3F");
                    add("2G");
                    add("4L");
                }}
        ));
        docentiList.add(new Docente(
                "Francesco",
                "Tocci",
                "toccifra",
                "tocci",
                new ArrayList<>() {{
                    add(new Materia("TSPIT"));
                    add(new Materia("Informatica"));
                }},
                new ArrayList<>() {{
                    add("3E");
                    add("3K");
                    add("4E");
                    add("4F");
                }}
        ));
        docentiList.add(new Docente(
                "Sabina",
                "Milanese",
                "milanesesab",
                "milanese",
                new ArrayList<>() {{
                    add(new Materia("Matematica"));
                    add(new Materia("Complementi di Matematica"));
                }},
                new ArrayList<>() {{
                    add("2F");
                    add("4E");
                    add("4C/T");
                    add("5K");
                    add("2F");
                    add("5C");
                }}
        ));
        docentiList.add(new Docente(
                "Salvatore",
                "Montalto",
                "montaltosal",
                "montalto",
                new ArrayList<>() {{
                    add(new Materia("Religione"));
                }},
                new ArrayList<>() {{
                    add("4A");
                    add("1A");
                    add("5I");
                    add("4B");
                    add("3E");
                    add("4H");
                    add("5L");
                    add("4E");
                    add("3K");
                    add("3L");
                    add("2A");
                    add("3Q");
                    add("3G/N");
                    add("3I");
                }}
        ));
         docentiList.add(new Docente(
                "Federica",
                "Bellavita",
                "bellavitafed",
                "bellavita",
                new ArrayList<>() {{
                    add(new Materia("TPSIT"));
                    add(new Materia("Informatica"));
                    add(new Materia("Scienze e Tecnologie Applicate"));
                }},
                new ArrayList<>() {{
                    add("3K");
                    add("4K");
                    add("2E");
                    add("4E");
                }}
        ));
        docentiList.add(new Docente(
                "Antonino",
                "Petrolino",
                "petrolinoant",
                "petrolino",
                new ArrayList<>() {{
                    add(new Materia("Sistemi automatici"));
                    add(new Materia("Elettronica ed Elettrotecnica"));
                    add(new Materia("Fisica"));
                    add(new Materia("Telecomunicazioni"));
                    add(new Materia("TPSIT"));
                }},
                new ArrayList<>() {{
                    add("3G/N");
                    add("3H");
                    add("5G");
                    add("2P");
                    add("2OD");
                    add("4H");
                    add("5G");
                    add("3H");
                    add("4E");
                    add("4H");
                    add("3F");
                }}
        ));
        
    }
    private static void popolaStudenti() {
        //4E
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
        studentiList.add(new Studente(
                "Luca",
                "Siric",
                "siricluc",
                "siric",
                "4E"
        ));
        studentiList.add(new Studente(
                "Daen",
                "Salku",
                "salkudae",
                "salku",
                "4E"
        ));
        studentiList.add(new Studente(
                "Philipp",
                "Gurndin",
                "gurndinphi",
                "gurndin",
                "4E"
        ));
        studentiList.add(new Studente(
                "Daniel",
                "Rossetti",
                "rossettidan",
                "rossetti",
                "4E"
        ));
        studentiList.add(new Studente(
                "Abdul",
                "Afzal",
                "afzalabd",
                "afzal",
                "4E"
        ));
        studentiList.add(new Studente(
                "Alessia",
                "Lombardo",
                "lombardoale",
                "lombardo",
                "4E"
        ));
        studentiList.add(new Studente(
                "Hania",
                "Butt",
                "butthan",
                "butt",
                "4E"
        ));
        studentiList.add(new Studente(
                "Paolo",
                "Ciprani",
                "cipranipao",
                "ciprani",
                "4E"
        ));
        studentiList.add(new Studente(
                "Marko",
                "Rabrenovic",
                "rabrenovicmar",
                "rabrenovic",
                "4E"
        ));
        studentiList.add(new Studente(
                "Jacopo",
                "Tagliazucca",
                "tagliazuccajac",
                "tagliazucca",
                "4E"
        ));
        studentiList.add(new Studente(
                "Francesco",
                "Ferrari",
                "ferrarifra",
                "ferrari",
                "4E"
        ));
        studentiList.add(new Studente(
                "Massimiliano",
                "Mazza",
                "mazzamas",
                "mazza",
                "4E"
        ));
        studentiList.add(new Studente(
                "Bledar",
                "Balanca",
                "balancable",
                "balanca",
                "4E"
        ));
        studentiList.add(new Studente(
                "Amadou",
                "Sow",
                "sowama",
                "sow",
                "4E"
        ));
        studentiList.add(new Studente(
                "Thomas",
                "Bovolenta",
                "bovolentatho",
                "bovolenta",
                "4E"
        ));
        studentiList.add(new Studente(
                "Cristian",
                "Marin",
                "marincri",
                "marin",
                "4E"
        ));
        studentiList.add(new Studente(
                "Alexander",
                "Rarità",
                "raritaale",
                "rarita",
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

    public static void printLogo(){
        System.out.println(" ________  _______   ________  ___  ________  _________  ________  ________");
        System.out.println("|\\   __  \\|\\  ___ \\ |\\   ____\\|\\  \\|\\   ____\\|\\___   ___\\\\   __  \\|\\   __  \\");
        System.out.println("\\ \\  \\|\\  \\ \\   __/|\\ \\  \\___|\\ \\  \\ \\  \\___|\\|___ \\  \\_\\ \\  \\|\\  \\ \\  \\|\\  \\");
        System.out.println(" \\ \\   _  _\\ \\  \\_|/_\\ \\  \\  __\\ \\  \\ \\_____  \\   \\ \\  \\ \\ \\   _  _\\ \\  \\\\\\  \\");
        System.out.println("  \\ \\  \\\\  \\\\ \\  \\_|\\ \\ \\  \\|\\  \\ \\  \\|____|\\  \\   \\ \\  \\ \\ \\  \\\\  \\\\ \\  \\\\\\  \\");
        System.out.println("   \\ \\__\\\\ _\\\\ \\_______\\ \\_______\\ \\__\\____\\_\\  \\   \\ \\__\\ \\ \\__\\\\ _\\\\ \\_______\\");
        System.out.println("    \\|__|\\|__|\\|_______|\\|_______|\\|__|\\_________\\   \\|__|  \\|__|\\|__|\\|_______|");
        System.out.println("                                      \\|_________|");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" _______   ___       _______  _________  _________  ________  ________  ________   ___  ________  ________");
        System.out.println("|\\  ___ \\ |\\  \\     |\\  ___ \\|\\___   ___\\\\___   ___\\\\   __  \\|\\   __  \\|\\   ___  \\|\\  \\|\\   ____\\|\\   __  \\");
        System.out.println("\\ \\   __/|\\ \\  \\    \\ \\   __/\\|___ \\  \\_\\|___ \\  \\_\\ \\  \\|\\  \\ \\  \\|\\  \\ \\  \\\\ \\  \\ \\  \\ \\  \\___|\\ \\  \\|\\  \\");
        System.out.println(" \\ \\  \\_|/_\\ \\  \\    \\ \\  \\_|/__  \\ \\  \\     \\ \\  \\ \\ \\   _  _\\ \\  \\\\\\  \\ \\  \\\\ \\  \\ \\  \\ \\  \\    \\ \\  \\\\\\  \\");
        System.out.println("  \\ \\  \\_|\\ \\ \\  \\____\\ \\  \\_|\\ \\  \\ \\  \\     \\ \\  \\ \\ \\  \\\\  \\\\ \\  \\\\\\  \\ \\  \\\\ \\  \\ \\  \\ \\  \\____\\ \\  \\\\\\  \\");
        System.out.println("   \\ \\_______\\ \\_______\\ \\_______\\  \\ \\__\\     \\ \\__\\ \\ \\__\\\\ _\\\\ \\_______\\ \\__\\\\ \\__\\ \\__\\ \\_______\\ \\_______\\");
        System.out.println("    \\|_______|\\|_______|\\|_______|   \\|__|      \\|__|  \\|__|\\|__|\\|_______|\\|__| \\|__|\\|__|\\|_______|\\|_______|");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}