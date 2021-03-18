package hojasejercicios;

enum Formato {
    wav, mp3, wma, avi, mov, mp4, wmv, swf
}

public class Multimedia {
	
	//propiedades
    private String titulo, autor;
    private int duracion;// minutos
    private Formato tipo;

    //constructor
    public Multimedia(String titulo, String autor, int duracion, Formato tipo) {
        setTitulo(titulo);
        setAutor(autor);
        setDuracion(duracion);
        setTipo(tipo);
    }

    //métodos getXxX y setXxX
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Formato getTipo() {
        return tipo;
    }

    public void setTipo(Formato tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {

        return "El objeto multimedia tiene los siguientes valores:\n" + "Título: " + getTitulo() + "\n" + "Autor: "
                + getAutor() + "\n" + "Duración: " + getDuracion() + "\n" + "Formato: " + getTipo();
    }
     
    @Override
    public boolean equals(Object obj2) {

        boolean validacion = false;

        if (obj2 instanceof Multimedia) {
            Multimedia objLocal = (Multimedia)obj2;
            if (this.getTitulo().equals(objLocal.getTitulo()) && this.getAutor().equals(objLocal.getAutor())) {
                validacion = true;
            }
        }

        return validacion;
    }

}
