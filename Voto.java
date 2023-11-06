import java.util.Date;

public class Voto {
    private Date data;
    private Materia materia;
    private float voto;

    public Voto(Date data, Materia materia, float voto) {
        this.data = data;
        this.materia = materia;
        this.voto = voto;
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
}