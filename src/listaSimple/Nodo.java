package listaSimple;

public class Nodo {
	private int dato;
	private Nodo siguiente;
	
	public Nodo(int i){
		this.dato 		= i;
		this.siguiente	= null;
	}

	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	public boolean esIgual(Nodo n){
		return (dato==n.getDato())? true:false;
	}
	
	public String toString(){
		return Integer.toString(dato);
	}
}
