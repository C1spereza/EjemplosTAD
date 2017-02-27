package listaDoblementeEnlazada;

public class Nodo {
	private int dato;
	private Nodo izquierda;
	private Nodo derecha;
	
	public Nodo(int dato){
		this.dato=dato;
		izquierda=null;
		derecha=null;
	}
	
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Nodo getIzquierda() {
		return izquierda;
	}
	public void setIzquierda(Nodo izquierda) {
		this.izquierda = izquierda;
	}
	public Nodo getDerecha() {
		return derecha;
	}
	public void setDerecha(Nodo derecha) {
		this.derecha = derecha;
	}
	
	public String toString(){
		return Integer.toString(dato);
	}
		
}
