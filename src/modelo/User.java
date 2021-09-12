package modelo;

public class User {
    int id;
    String nombre;
    int cc;
    int acomulado;



    public User() {
        this.nombre = nombre;
        this.cc = cc;
        this.acomulado=acomulado;

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
    public int getAcomulado() {
        return acomulado;
    }

    public void setAcomulado(int acomulado) {
        this.acomulado = acomulado;
    }

}
