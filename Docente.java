import java.util.List;

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
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", materie=" + materie +
                ", classi=" + classi +
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
}
