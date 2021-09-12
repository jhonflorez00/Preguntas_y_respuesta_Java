package modelo;

public class Jugador {
    private int id;
    private String nombre;
    private int cc;

    public Jugador(String nombre, int cc) {
        this.nombre = nombre;
        this.cc = cc;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

}
