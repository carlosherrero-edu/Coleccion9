package ejercicios;

import ejercicios.Utilidades.Formatos;

public class Pelicula extends Multimedia {
	
	//propiedades nuevas de la subclase
	private String actorPrincipal;
	private String actrizPrincipal;
	
	//constructor
	public  Pelicula (String tit, String aut, int dur, Formatos format,
			String actor, String actriz){
		super(tit, aut, dur, format); 
		if (actor.length()<1 && actriz.length()<0){
			 throw new IllegalArgumentException("hay que indicar un actor o una actriz");
		 }
		 setActorPrincipal(actor);
		 setActrizPrincipal(actriz);
		 		
	}
	
	//métodos get y set
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
	public String toString(){
		return super.toString() + "**"+ getActorPrincipal()+ "**" 
	+getActrizPrincipal();
	}
	

}
