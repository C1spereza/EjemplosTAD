package listaDoblementeEnlazada;

public class ListaDoblementeEnlazada {
	private Nodo cabeza;
	private Nodo cola;
	private int tamaño;
	
	public ListaDoblementeEnlazada(){
		cabeza=null;
		cola=null;
		tamaño=0;
	}
	
	public Nodo getCabeza() {
		return cabeza;
	}
	public void setCabeza(Nodo cabeza) {
		this.cabeza = cabeza;
	}
	public Nodo getCola() {
		return cola;
	}
	public void setCola(Nodo cola) {
		this.cola = cola;
	}
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	

	
}
