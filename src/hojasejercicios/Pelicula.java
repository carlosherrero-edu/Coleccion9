package hojasejercicios;

public class Pelicula extends Multimedia {
    
	//propiedades
    protected String actorPrincipal;
    protected String actrizPrincipal;
    
    //constructor
    public Pelicula(String titulo, String autor, int duracion, Formato tipo, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, duracion, tipo);
        
        
        setActorPrincipal(actorPrincipal);
        setActrizPrincipal(actrizPrincipal);
        
        if (this.actorPrincipal == null && this.actrizPrincipal == null) {
            throw new RuntimeException("Tiene que haber al menos un actor o actriz");
        }
        
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {

        this.actorPrincipal = actorPrincipal;
        
    
        
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        
        this.actrizPrincipal = actrizPrincipal;


    }

    @Override
    public String toString() {
    	
    	String info = super.toString(); //llamo al toString del padre
        info = info + "\n Actor principal :" +getActorPrincipal() + "\n Actriz Principal principal :" +getActrizPrincipal();
        return info;
    }
}