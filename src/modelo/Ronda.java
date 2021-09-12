package modelo;


public class Ronda extends Pregunta {
    private int idRonda;

    public Ronda(int idRonda) {
        this.idRonda = idRonda;
    }

    public Ronda() {

    }

    public int getIdRonda() {
        return idRonda;
    }

    public void setIdRonda(int idRonda) {
        this.idRonda = idRonda;
    }
}
