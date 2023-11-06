import java.util.Date;

public class Assenza {
    private Date data;
    private String motivo;

    public Assenza(Date data, String motivo) {
        this.data = data;
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Assenza{" +
                "data=" + data +
                ", motivo='" + motivo + '\'' +
                '}';
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}