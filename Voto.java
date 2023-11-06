import java.util.Date;

public class Voto {
    private Date data;
    private Materia materia;
    private float voto;
    private Docente docente;

    public Voto(Date data, Materia materia, float voto, Docente docente) {
        this.data = data;
        this.materia = materia;
        this.voto = voto;
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "data=" + data +
                ", materia=" + materia.getNome() +
                ", voto=" + voto +
                ", docente=" + docente.getUsername() +
                '}';
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public float getVoto() {
        return voto;
    }

    public void setVoto(float voto) {
        this.voto = voto;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}