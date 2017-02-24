package ejemploListaSimple;

public class NodoLibro {
	private Libro libro;
	private NodoLibro siguiente;
	
	public NodoLibro(Libro l){
		this.libro 		= l;
		this.siguiente	= null;
	}

	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro l) {
		this.libro = l;
	}
	public NodoLibro getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoLibro siguiente) {
		this.siguiente = siguiente;
	}
	
	public boolean esIgual(NodoLibro n){
		return (libro==n.getLibro())? true:false;
	}
	
	public String toString(){
		return libro.toString();
	}
}
