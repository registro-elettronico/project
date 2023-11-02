/*
 * TO DO LIST
 * -
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
 */


import java.util.Scanner;

//import org.mindrot.jbcrypt.BCrypt; FAILED IMPORT

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //belle le istanze
        Scanner scanner = new Scanner(System.in);
        User docente1 = new User("DMRNMRCIF", "Marco", "Marinello", true);
        User docente2 = new User("DTFNGDUTD", "Guido", "Tufano", true);
        User docente3 = new User("DCSTNDRTC", "Andrea", "Cestari", true);
        User studente1 = new User("SDCRAXL07", "Alex", "De Carli", false);
        User studente2 = new User("SCHCTMS06", "Thomas", "Chiocchetti", false);
        User studente3 = new User("SFRRCCC06", "Ciccio", "Ferrara", false);
        User genitore1 = new User("GDCRAXL07", "Genitore", "De Carli", false);
        User genitore2 = new User("GCHCTMS06", "Genitore", "Chiocchetti", false);
        User genitore3 = new User("GFRRCCC06", "Genitore", "Ferrara", false);
        //adesso non più

        boolean login = false;
        int contLogin = 0;
        int pageWidth = 63;

        //temp
        String UserID = "name";
        String UserPW = "pass";
        //fine temp

        //benvenuto nel programma
        String logo = 
            " _____   ______  _____  _____   _____  _______  _____    ____  \n" +
            "|  __ \\ |  ____|/ ____||_   _| / ____||__   __||  __ \\  / __ \\ \n" +
            "| |__) || |__  | |  __   | |  | (___     | |   | |__) || |  | |\n" +
            "|  _  / |  __| | | |_ |  | |   \\___ \\    | |   |  _  / | |  | |\n" +
            "| | \\ \\ | |____| |__| | _| |_  ____) |   | |   | | \\ \\ | |__| |\n" +
            "|_|  \\_\\|______|\\_____||_____||_____/    |_|   |_|  \\_\\ \\____/ \n";

        System.out.println(logo);
        printUnderscores(pageWidth);
        //fine


        do{
        System.out.println("LOGIN\n");
        System.out.println("Username: ");
        String enUserID = scanner.nextLine().trim(); //trim() serve a rimuovere spazi bianchi messi per errore prima del testo
        System.out.println("Password: ");
        String enUserPW = scanner.nextLine().trim();

//HASHED VERSION (WORKING) - failed library import
/*      if(contLogin < 5){
            System.out.println("Hashed Password: " + enHashPW); //temporary
            if(enHashUserID.equals(UserID) && enHashUserPW.equals(UserPW)){
                login = true; //Login effettuato con successo
                if(hasUserPrivileges() == true){
                    //mandare ad interfaccia per DOCENTI e ADMIN
                }else{
                    //mandare ad interfaccia per normali visualizzatori
                }
            }else{
                System.out.println("\nIncorrect name or password!");
                login = false;
            }
            //removeLine(6); TENTATIVO DI RIMUOVERE LINEE NEL TERMINALE
            printUnderscores(pageWidth);
            contLogin = contLogin + 1;
        } */

        if(contLogin < 5){
            if(enUserID.equals(UserID) && enUserPW.equals(UserPW)){
                login = true; //Login effettuato con successo
                if(hasUserPrivileges(enUserPW) == true){

                    System.out.println("Selezionare la classe:");
                    System.out.println("1. 4E - Informatica");
                    System.out.println("2. 2L - Scientifico");
                    System.out.println("3. 5F - Telecomunicazioni");
                    System.out.print("Inserisci il numero corrispondente: ");
                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Scelta non valida");
                    }

                }else{

                    System.out.println("Cosa desideri visualizzare?");
                    System.out.println("1. Voti degli studenti");
                    System.out.println("2. Assenze");
                    System.out.println("3. Note ricevute");
                    System.out.print("Inserisci il numero corrispondente: ");
                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            user.displayVotiIF();
                            user.displayVotiTD();
                            user.displayVotiTC();
                            break;
                        case 2:
                            user.displayNote();
                            break;
                        case 3:
                            user.displayAssenze();
                            break;
                        default:
                            System.out.println("Scelta non valida");
                    }                    
                }
            }else{
                System.out.println("\nIncorrect name or password!");
                login = false;
            }
            printUnderscores(pageWidth);
            contLogin = contLogin + 1;
        }else{
            printUnderscores(pageWidth); //stampa "linea"
            System.out.println("Too many failed attemps,\ncheck your credential before loggin in!\n");
            int countdownFrom = 5; // countdown blocco login

        for (int i = countdownFrom; i >= 1; i--) {
            System.out.println("\rWait before trying again: " + i);
            Thread.sleep(1000);
        }
        printUnderscores(pageWidth);
        }
        }while(!login);
        System.out.println("Login successful!");
        printUnderscores(pageWidth);
    }
    //funzioni per stampare a schermo le linee divisorie (non toccare)
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
    //funzione per riconoscimento tipologia account
    public static boolean hasUserPrivileges(String enUserID) {
        if (enUserID != null && !enUserID.isEmpty()) {
            char firstChar = enUserID.charAt(0);
            
            if (firstChar == 'A' || firstChar == 'D') {
                return true;
            }
        }
        return false;
    }
    //password hashing
/*  public static void hashPassword(String enUserPW, String UserPW){
        String salt = BCrypt.gensalt();
        String enHashPW = Bcrypt.hashpw(enUserPW, salt);
    } */
    

    //funzione per rimuovere linee ormai inutilizzate nel programma
    /*
    public static void removeLine(int lineToRemove) {
        // ANSI escape code to move the cursor to the beginning of the line
        System.out.print("\u001B[" + lineToRemove + "F");

        // ANSI escape code to clear the line
        System.out.print("\u001B[2K");

        // ANSI escape code to move the cursor to the next line
        System.out.print("\u001B[E");

        // Overwrite the next line with spaces to clear any remnants
        System.out.println("                                        ");
    }
    */
}