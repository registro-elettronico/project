import java.util.ArrayList;
import java.util.List;

public class Studente {
    private String nome;
    private String cognome;
    private String username;
    private String password;
    private List<Voto> voti;
    private List<Assenza> assenze;

    public Studente(String nome, String cognome, String username, String password) {
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.password = password;
        voti = new ArrayList<>();
        assenze = new ArrayList<>();
    }

    public List<Voto> getVoti() {
        return voti;
    }

    public List<Assenza> getAssenze() {
        return assenze;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}