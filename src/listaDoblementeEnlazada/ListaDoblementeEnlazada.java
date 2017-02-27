package listaDoblementeEnlazada;

import listaSimple.NodoEntero;

public class ListaDoblementeEnlazada {
	private Nodo cabeza;
	private Nodo cola;
	private int tamaño;
	
	public ListaDoblementeEnlazada(){
		cabeza=null;
		cola=null;
		tamaño=0;
	}
	public void insertarInicio(Nodo nodo){
		if(tamaño==0){
			cabeza=nodo;
			cola=nodo;
			tamaño++;
		} else {
			nodo.setDerecha(cabeza);
			cabeza.setIzquierda(nodo);
			cabeza=nodo;
			tamaño++;
		}
	}
	public void insertarCola(Nodo nodo){
		if(tamaño==0){
			cabeza=nodo;
			cola=nodo;
			tamaño++;
		} else {
			nodo.setIzquierda(cola);
			cola.setDerecha(nodo);
			cola=nodo;
			tamaño++;
		}
	}
	public boolean insertarPosicion(Nodo nodo,int posicion){
		if (posicion > tamaño + 1 || posicion < 1) {
			return false;
		} else {
			if (posicion == 1)
				insertarInicio(nodo);
			else if (posicion == tamaño + 1)
				insertarCola(nodo);
			else {
				Nodo nodoAuxiliar = cabeza.getDerecha();
				Nodo nodoAnterior = cabeza;
				posicion = posicion - 2;
				while (posicion > 0) {
					nodoAnterior = nodoAuxiliar;
					nodoAuxiliar = nodoAuxiliar.getDerecha();
					posicion--;
				}
				nodo.setDerecha(nodoAuxiliar);
				nodo.setIzquierda(nodoAnterior);
				nodoAnterior.setDerecha(nodo);
				nodoAuxiliar.setIzquierda(nodo);
				tamaño++;
			}
			return true;
		}
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
	
	public String toString(){
		String salida=	"Valores de la ListaDoblementeEnlazada\n" + 
						"-------------------------------------\n";
		Nodo auxiliar=cabeza;
		for(int i=1;i<=tamaño;i++){
			salida=salida + auxiliar.toString() + " ";
			auxiliar=auxiliar.getDerecha();
		}
		return salida;
	}
	public String toStringInvertido(){
		String salida=	"Valores de la ListaDoblementeEnlazada invertida\n" + 
						"-----------------------------------------------\n";
		Nodo auxiliar=cola;
		for(int i=1;i<=tamaño;i++){
			salida=salida + auxiliar.toString() + " ";
			auxiliar=auxiliar.getIzquierda();
		}
		return salida;
	}
	

	
}
