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
        docentiList.add(new User("DMRNMRCIF", "Marco", "Marinello", true));
        docentiList.get(0).materia = "Informatica";
        docentiList.get(0).classe1 = "4E";
        docentiList.get(0).classe2 = "2L";
        docentiList.get(0).classe3 = "5F";

        docentiList.add(new User("DTFNGDUTD", "Guido", "Tufano", true));
        docentiList.get(1).materia = "Informatica";
        docentiList.get(1).classe1 = "4E";
        docentiList.get(1).classe2 = "2L";
        docentiList.get(1).classe3 = "5F";

        docentiList.add(new User("DCSTNDRTC", "Andrea", "Cestari", true));
        docentiList.get(2).materia = "Informatica";
        docentiList.get(2).classe1 = "4E";
        docentiList.get(2).classe2 = "2L";
        docentiList.get(2).classe3 = "5F";

        studentiList.add(new User("SDCRAXL07", "Alex", "De Carli", false));
        studentiList.get(0).classe = "4E";
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

        studentiList.add(new User("SCHCTMS06", "Thomas", "Chiocchetti", false));
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

        studentiList.add(new User("SFRRCCC06", "Ciccio", "Ferrara", false));
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

        genitoriList.add(new User("GDCRAXL07", "Genitore", "De Carli", false));
        genitoriList.get(0).classe = studentiList.get(0).classe;
        for (int i = 0; i < 5; i++) {
            genitoriList.get(0).votiIF[i] = studentiList.get(0).votiIF[i];
            genitoriList.get(0).votiTD[i] = studentiList.get(0).votiTD[i];
            genitoriList.get(0).votiTC[i] = studentiList.get(0).votiTC[i];
        }

        genitoriList.add(new User("GCHCTMS06", "Genitore", "Chiocchetti", false));
        genitoriList.get(1).classe = studentiList.get(1).classe;
        for (int i = 0; i < 5; i++) {
            genitoriList.get(1).votiIF[i] = studentiList.get(1).votiIF[i];
            genitoriList.get(1).votiTD[i] = studentiList.get(1).votiTD[i];
            genitoriList.get(1).votiTC[i] = studentiList.get(1).votiTC[i];
        }

        genitoriList.add(new User("GFRRCCC06", "Genitore", "Ferrara", false));
        genitoriList.get(2).classe = studentiList.get(2).classe;
        for (int i = 0; i < 5; i++) {
            genitoriList.get(2).votiIF[i] = studentiList.get(2).votiIF[i];
            genitoriList.get(2).votiTD[i] = studentiList.get(2).votiTD[i];
            genitoriList.get(2).votiTC[i] = studentiList.get(2).votiTC[i];
        }
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
                            for (User student : studentiList) {
                                student.displayVotiIF();
                                student.displayVotiTD();
                                student.displayVotiTC();
                            }
                            break;
                        case 2:
                            for (User student : studentiList) {
                                //student.displayNote();
                            }
                            break;
                        case 3:
                            for (User student : studentiList) {
                                //student.displayAssenze();
                            }
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