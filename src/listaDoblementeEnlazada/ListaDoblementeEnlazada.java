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
