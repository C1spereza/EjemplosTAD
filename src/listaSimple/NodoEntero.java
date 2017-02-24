package listaSimple;

public class NodoEntero {
	private int dato;
	private NodoEntero siguiente;
	
	public NodoEntero(int i){
		this.dato 		= i;
		this.siguiente	= null;
	}

	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public NodoEntero getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoEntero siguiente) {
		this.siguiente = siguiente;
	}
	
	public boolean esIgual(NodoEntero n){
		return (dato==n.getDato())? true:false;
	}
	
	public String toString(){
		return Integer.toString(dato);
	}
}
