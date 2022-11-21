public class Serie {
    String titulo;
    int numTemporadas = 3;
    boolean entregado = false;
    String genero;
    String creador;

    //Constructor por defecto
    public void Serie(){
        titulo = "";
        numTemporadas = 0;
        creador = "";
        entregado = false;
        genero = "";
        creador = "";
    }

    //Solo titulo y creador
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    //Todo menos entregado
    public Serie(String titulo, int numTemporadas, String genero, String creador) {
        this.titulo = "Fast";
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }
}
