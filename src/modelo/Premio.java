package modelo;

import java.awt.*;

public class Premio {
    Jugador jugador;
    Integer resultadoPremio;



    public Premio(Jugador jugador, int resultadoPremio) {
        this.jugador = jugador;
        this.resultadoPremio = resultadoPremio;
    }

    public Premio() {
        
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Integer getResultadoPremio() {
        return resultadoPremio;
    }

    public void setResultadoPremio(Integer resultadoPremio) {
        this.resultadoPremio = resultadoPremio;
    }




}
