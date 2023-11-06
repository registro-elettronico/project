/*
 * TO DO LIST 
 * - Login
 * - 
 * -
 * -
 * -
 * -
 * 
 * IMPORTANTE:
 * non rimuovere parti del programma che non si conoscono
 * scrivere commenti per aggiornare tutto il team sul da farsi
 * NON fare commit a caso, solo update UTILI!
 * 
 * APPUNTI:
 * directory Alex: cd /d D:\Documents\GitHub\project
 * Clone: git clone https://github.com/registro-elettronico/project.git
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import org.mindrot.jbcrypt.BCrypt; FAILED IMPORT

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //belle le istanze
        User[] studenti = new User[3];
        User[] docenti = new User[3];
        User[] genitori = new User[3];
        List<User> studentiList = new ArrayList<>();
        List<User> docentiList = new ArrayList<>();
        List<User> genitoriList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        docentiList.add(new User("DMRNMRCIF", "Marco", "Marinello", true, "pass"));
        docentiList.get(0).materia = "Informatica";
        docentiList.get(0).classe1 = "4E";
        docentiList.get(0).classe2 = "2L";
        docentiList.get(0).classe3 = "5F";

        docentiList.add(new User("DTFNGDUTD", "Guido", "Tufano", true, "pass"));
        docentiList.get(1).materia = "Tedesco";
        docentiList.get(1).classe1 = "4E";
        docentiList.get(1).classe2 = "2L";
        docentiList.get(1).classe3 = "5F";

        docentiList.add(new User("DCSTNDRTC", "Andrea", "Cestari", true, "pass"));
        docentiList.get(2).materia = "Telecomunicazioni";
        docentiList.get(2).classe1 = "4E";
        docentiList.get(2).classe2 = "2L";
        docentiList.get(2).classe3 = "5F";

        studentiList.add(new User("SDMTJNN06", "Johannes", "Demetz", false, "pass"));
        studentiList.get(0).classe = "4E";
        Assenze assenzeS0 = studentiList.get(0).getAssenze(null);
        assenzeS0.setAssenza1("ieri");
        assenzeS0.setAssenza2("oggi");
        assenzeS0.setAssenza3("domani");

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                studentiList.get(0).votiIF[i] = 5.25;
                studentiList.get(0).votiTD[i] = 9.5;
                studentiList.get(0).votiTC[i] = 5.25;
            } else if (i == 1) {
                studentiList.get(0).votiIF[i] = 10.0;
                studentiList.get(0).votiTD[i] = 9.0;
                studentiList.get(0).votiTC[i] = 7.0;
            } else if (i == 2) {
                studentiList.get(0).votiIF[i] = 10.0;
                studentiList.get(0).votiTD[i] = 8.75;
                studentiList.get(0).votiTC[i] = 6.5;
            } else if (i == 3) {
                studentiList.get(0).votiIF[i] = 7.0;
                studentiList.get(0).votiTD[i] = 8.0;
                studentiList.get(0).votiTC[i] = 7.5;
            } else if (i == 4) {
                studentiList.get(0).votiIF[i] = 3.75;
                studentiList.get(0).votiTD[i] = 7.5;
                studentiList.get(0).votiTC[i] = 7.5;
            }
        }

        studentiList.add(new User("SKMPRNA08", "Arno", "Kompatscher", false, "pass"));
        studentiList.get(1).classe = "2L";
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                studentiList.get(1).votiIF[i] = 5.25;
                studentiList.get(1).votiTD[i] = 9.5;
                studentiList.get(1).votiTC[i] = 5.25;
            } else if (i == 1) {
                studentiList.get(1).votiIF[i] = 10.0;
                studentiList.get(1).votiTD[i] = 9.0;
                studentiList.get(1).votiTC[i] = 7.0;
            } else if (i == 2) {
                studentiList.get(1).votiIF[i] = 10.0;
                studentiList.get(1).votiTD[i] = 8.75;
                studentiList.get(1).votiTC[i] = 6.5;
            } else if (i == 3) {
                studentiList.get(1).votiIF[i] = 7.25;
                studentiList.get(1).votiTD[i] = 8.0;
                studentiList.get(1).votiTC[i] = 7.5;
            } else if (i == 4) {
                studentiList.get(1).votiIF[i] = 3.75;
                studentiList.get(1).votiTD[i] = 7.5;
                studentiList.get(1).votiTC[i] = 7.5;
            }
        }
        

        studentiList.add(new User("SFRRCCC05", "Ciccio", "Ferrara", false, "pass"));
        studentiList.get(2).classe = "5F";
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                studentiList.get(2).votiIF[i] = 5.25;
                studentiList.get(2).votiTD[i] = 9.5;
                studentiList.get(2).votiTC[i] = 5.25;
            } else if (i == 1) {
                studentiList.get(2).votiIF[i] = 10.0;
                studentiList.get(2).votiTD[i] = 9.0;
                studentiList.get(2).votiTC[i] = 7.0;
            } else if (i == 2) {
                studentiList.get(2).votiIF[i] = 10.0;
                studentiList.get(2).votiTD[i] = 8.75;
                studentiList.get(2).votiTC[i] = 6.5;
            } else if (i == 3) {
                studentiList.get(2).votiIF[i] = 7.0;
                studentiList.get(2).votiTD[i] = 8.0;
                studentiList.get(2).votiTD[i] = 8.0;
            } else if (i == 4) {
                studentiList.get(2).votiIF[i] = 3.75;
                studentiList.get(2).votiTD[i] = 7.5;
                studentiList.get(2).votiTC[i] = 7.5;
            }
        }

        genitoriList.add(new User("GDCRAXL07", "Genitore", "Demetz", false, "pass"));
        genitoriList.get(0).classe = studentiList.get(0).classe;
        for (int i = 0; i < 5; i++) {
            genitoriList.get(0).votiIF[i] = studentiList.get(0).votiIF[i];
            genitoriList.get(0).votiTD[i] = studentiList.get(0).votiTD[i];
            genitoriList.get(0).votiTC[i] = studentiList.get(0).votiTC[i];
        }

        genitoriList.add(new User("GCHCTMS06", "Genitore", "Kompatscher", false, "pass"));
        genitoriList.get(1).classe = studentiList.get(1).classe;
        for (int i = 0; i < 5; i++) {
            genitoriList.get(1).votiIF[i] = studentiList.get(1).votiIF[i];
            genitoriList.get(1).votiTD[i] = studentiList.get(1).votiTD[i];
            genitoriList.get(1).votiTC[i] = studentiList.get(1).votiTC[i];
        }

        genitoriList.add(new User("GFRRCCC06", "Genitore", "Ferrara", false, "pass"));
        genitoriList.get(2).classe = studentiList.get(2).classe;
        for (int i = 0; i < 5; i++) {
            genitoriList.get(2).votiIF[i] = studentiList.get(2).votiIF[i];
            genitoriList.get(2).votiTD[i] = studentiList.get(2).votiTD[i];
            genitoriList.get(2).votiTC[i] = studentiList.get(2).votiTC[i];
        }
        //non più forse, meglio SQL

        boolean login = false;
        int contLogin = 0;
        int pageWidth = 63;

        //Benvenuto (Inizio)
        String logo = 
            " _____   ______  _____  _____   _____  _______  _____    ____  \n" +
            "|  __ \\ |  ____|/ ____||_   _| / ____||__   __||  __ \\  / __ \\ \n" +
            "| |__) || |__  | |  __   | |  | (___     | |   | |__) || |  | |\n" +
            "|  _  / |  __| | | |_ |  | |   \\___ \\    | |   |  _  / | |  | |\n" +
            "| | \\ \\ | |____| |__| | _| |_  ____) |   | |   | | \\ \\ | |__| |\n" +
            "|_|  \\_\\|______|\\_____||_____||_____/    |_|   |_|  \\_\\ \\____/ \n";

        System.out.println(logo);
        printUnderscores(pageWidth);
        //Attende 3 secondi
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Benvenuto (Fine)


        do{

            if(contLogin<5){

                User currentUser = searchUserByUsername(UserID, studentiList, docentiList, genitoriList);

                if (currentUser != null && currentUser.getPassword().equals(UserPW)) {
                System.out.println("Login successful!");
                login = true;
                    if (currentUser.isDocente()) {
                        displayDocente();
                    } else if (currentUser.isGenitore()) {
                        displayUser();
                    } else {
                        displayUser();
                    }
                } else {
                    System.out.println("Login failed. Please check your credentials.");
                    login = false;
                }
                printUnderscores(pageWidth);
                contLogin=contLogin+1;
            }else{
                printUnderscores(pageWidth); // stampa "linea"
                System.out.println("Too many failed attemps,\ncheck your credential before loggin in!\n");
                int countdownFrom = 5; // countdown blocco login

                for(int i = countdownFrom; i >= 1 ; i--){

                    System.out.println("\rWait before trying again: " + i);
                    Thread.sleep(1000);

                }
                printUnderscores(pageWidth);
            }

        }while(!login);

    public static void displayDocente(){
        System.out.println("Selezionare la classe:");
        System.out.println("1. 4E - Informatica");
        System.out.println("2. 2L - Scientifico");
        System.out.println("3. 5F - Telecomunicazioni");
        System.out.print("Inserisci il numero corrispondente: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (User student : studentiList) {
                    student.displayVotiTutti();
                    student.displayVotiTutti();
                    student.displayVotiTutti();
                }
                break;
            case 2:
                break;
            case 3:
                break;
            default:
            System.out.println("Scelta non valida");
        }
    }

    public void GherdeinaList() { // Gherdëina* (Si.)
        for (int i = 0; i < 9; i++) {

        }
    }

    public static void displayUser(){
        System.out.println("Cosa desideri visualizzare?");
        System.out.println("1. Voti degli studenti");
        System.out.println("2. Assenze");
        System.out.println("3. Note ricevute");
        System.out.print("Inserisci il numero corrispondente: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                for (User student : studentiList) {
                    student.displayVotiIF();
                    student.displayVotiTD();
                    student.displayVotiTC();
                }
                break;
            case 2:
                for (User student : studentiList) {
                    //student.displayNote();            //STAMPARE A SCHERMO LE ASSENZE DEL SINGOLO STUDENTE
                }
                break;
            case 3:
                for (User student : studentiList) {
                    //student.displayAssenze();         //STAMPARE A SCHERMO LE ASSENZE DEL SINGOLO STUDENTE
                }
                break;
            default:
                System.out.println("Scelta non valida");
        }
                                 
    }


    //belle le liste per i login, in SQL sarebbe più semplice
    public static User searchUserByUsername(String UserID, List<User>... userLists) {
        for (List<User> userList : userLists) {
            for (User user : userList) {
                if (user.getUsername().equalsIgnoreCase(UserID)) {
                    return user;
                }
            }
        }
        return null; // Return null if user not found
    }

    // funzioni per stampare a schermo le linee divisorie (non toccare)
    public static void printUnderscores(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void printUnderscores2(int width) {
        for (int i = 0; i < width; i++) {
            System.out.print("_");
        }
        System.out.println();
    }

    // funzione per riconoscimento tipologia account
    public static boolean hasUserPrivileges(String enUserID) {
        if (enUserID != null && !enUserID.isEmpty()) {
            char firstChar = enUserID.charAt(0);
            
            if (firstChar == 'A' || firstChar == 'D') {
                return true;
            }
        }
        return false;
    }

    // password hashing
    /*
     * public static void hashPassword(String enUserPW, String UserPW){
     * String salt = BCrypt.gensalt();
     * String enHashPW = Bcrypt.hashpw(enUserPW, salt);
     * }
     */

    // funzione per rimuovere linee ormai inutilizzate nel programma
    /*
     * public static void removeLine(int lineToRemove) {
     * // ANSI escape code to move the cursor to the beginning of the line
     * System.out.print("\u001B[" + lineToRemove + "F");
     * 
     * // ANSI escape code to clear the line
     * System.out.print("\u001B[2K");
     * 
     * // ANSI escape code to move the cursor to the next line
     * System.out.print("\u001B[E");
     * 
     * // Overwrite the next line with spaces to clear any remnants
     * System.out.println("                                        ");
     * }
     */
    }
}