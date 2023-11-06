import java.util.ArrayList;
import java.util.List;

public class Studente {
    private String nome;
    private String cognome;
    private String username;
    private String password;
    private String classe;
    private List<Voto> voti;
    private List<Assenza> assenze;

    public Studente(String nome, String cognome, String username, String password, String classe) {
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.password = password;
        this.classe = classe;
        voti = new ArrayList<>();
        assenze = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", classe='" + classe + '\'' +
                ", voti=" + voti +
                ", assenze=" + assenze +
                '}';
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

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}