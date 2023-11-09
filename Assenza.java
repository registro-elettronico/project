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
        String formattedData = String.format("%-33s", data);
        String formattedMotivo = String.format("%-33s", motivo);

        return "\nData: " + formattedData +
            "Motivo: " + formattedMotivo;
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