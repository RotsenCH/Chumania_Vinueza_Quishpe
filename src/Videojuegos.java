public class Videojuegos {
    String titulo, genero, compania;
    int horasEst = 10;
    boolean entregado = false;

    //Constructor por defecto
    public Videojuegos() {
        titulo = "";
        genero = "";
        compania = "";
        horasEst = 0;
    }

    //Titulo y horas estimadas

    public Videojuegos(String titulo, int horasEst) {
        this.titulo = titulo;
        this.horasEst = horasEst;
    }

    //Todos menos entregado

    public Videojuegos(String titulo, String genero, String compania, int horasEst) {
        this.titulo = titulo;
        this.genero = genero;
        this.compania = compania;
        this.horasEst = horasEst;
    }

    //Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getHorasEst() {
        return horasEst;
    }

    public void setHorasEst(int horasEst) {
        this.horasEst = horasEst;
    }

    //Metodos to String
    @Override
    public String toString() {
        return "Videojuegos{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                ", horasEst=" + horasEst +
                ", entregado=" + entregado +
                '}';
    }
}
