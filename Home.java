import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<Grade> grades;
    private List<Absence> absences;
    private List<Note> notes;

    public Home() {
        // dopo
    }

    public void displayGrades() {
        System.out.println("Voti degli studenti:");
        for (Grade grade : grades) {
            System.out.println(grade); // Assumi che Grade abbia un metodo toString() appropriato
            System.out.println("Voto:");
        }
    }
    

    public void displayAbsences() {
        System.out.println("Assenze:");
        for (Absence absence : absences) {
            System.out.println(absence); // Assumi che Absence abbia un metodo toString() appropriato
        }
    }
    

    public void displayNotes() {
        System.out.println("Note ricevute:");
        for (Note note : notes) {
            System.out.println(note); // Assumi che Note abbia un metodo toString() appropriato
        }
    }
    
}
