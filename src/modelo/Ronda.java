package modelo;


public class Ronda extends Pregunta {
    int idRonda;

    public Ronda(int idRonda) {
        this.idRonda = idRonda;
    }


    public int getIdRonda() {
        return idRonda;
    }

    public void setIdRonda(int idRonda) {
        this.idRonda = idRonda;
    }
}
