package ejercicios;

import ejercicios.Utilidades.Formatos;

public class Pelicula extends Multimedia {
	
	//propiedades nuevas de la subclase
	private String actorPrincipal;
	private String actrizPrincipal;
	
	//constructor
	public  Pelicula (String tit, String aut, int dur, Formatos format,
			String actor, String actriz) throws IllegalArgumentException{
		super(tit, aut, dur, format); 
		//validación impidiendo que actor y actriz estén ambos en blanco
		if (actor.length()<1 && actriz.length()<1){
			 throw new IllegalArgumentException("hay que indicar un actor o una actriz");
		 }
		
		 setActorPrincipal(actor);
		 setActrizPrincipal(actriz);
		 		
	}
	
	//mÃ©todos get y set
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
		return super.toString() + 
		((getActorPrincipal().length()>0) ?"\n Actor Principal: "+getActorPrincipal() : "")+
		((getActrizPrincipal().length()>0) ?"\n Actriz Principal: "+getActrizPrincipal() : "");
				
	}
	

}
