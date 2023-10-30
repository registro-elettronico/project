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

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
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

        if(contLogin < 5){
            if(enUserID == UserID && enUserPW == UserPW){
                login = true;
            }else{
                System.out.println("\nIncorrect name or password!");
                login = false;
            }
            //removeLine(6); TENTATIVO DI RIMUOVERE LINEE NEL TERMINALE
            printUnderscores(pageWidth);
            contLogin = contLogin + 1;
        }else{
            printUnderscores(pageWidth); //print lines to page end
            System.out.println("Too many failed attemps,\ncheck your credential before loggin in!\n");
            int countdownFrom = 5; // Change this to your desired starting number

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


//DATABASE IMPLEMENTATION (DO NOT USE OR DELETE)
/*import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Username: ");
        String enteredName = scanner.nextLine();
        System.out.println("Password: ");
        String enteredPassword = scanner.nextLine();

        try {
            // Load the SQLite driver
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        Connection connection = null;
        try {
            String dbPath = "jdbc:sqlite:./database/database.sql";
            connection = DriverManager.getConnection(dbPath);

            
            // Now, let's check the credentials
            String query = "SELECT * FROM login WHERE name = ? AND password = ?";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, enteredName);
                statement.setString(2, enteredPassword);

                try (ResultSet result = statement.executeQuery()) {
                    if (result.next()) {
                        System.out.println("Login successful");
                        // Add code here to proceed to the home screen
                    } else {
                        System.out.println("Login failed");
                        // Add code here to handle a failed login
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
*/