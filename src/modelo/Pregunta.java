package modelo;

public class Pregunta {
    int    id;
    String pregunta;
    String opciones;
    int    repuesta;
    int    categoria;

    public Pregunta() {
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.repuesta = repuesta;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    public int getRepuesta() {
        return repuesta;
    }

    public void setRepuesta(int repuesta) {
        this.repuesta = repuesta;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
