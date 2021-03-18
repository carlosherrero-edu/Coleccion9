package hojasejercicios;

 enum Generos {
    POP, ROCK, JAZZ
};

public class Disco extends Multimedia {

   //propiedades
    private int pistas;
    private Generos genero;

    //constructor
    public Disco(String titulo, String autor, int duracion, Formato tipo, Generos genero, int pistas) {
        super(titulo, autor, duracion, tipo);
        setGenero(genero);
        setPistas(pistas);
    }
    
    //métodos getXxX y setXxX
    public int getPistas() {
        return pistas;
    }

    public Generos getGenero() {
        return genero;
    }

    public void setPistas(int pistas) {
        this.pistas = pistas;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Género : " + getGenero() + "\n Número de pistas: " + getPistas();
    }

   

}

