package listaSimple;

public class ListaSimple {
	private NodoEntero inicio;
	private int tamaño;

	public ListaSimple() {
		inicio = null;
		tamaño = 0;
	}

	public NodoEntero getInicio() {
		return inicio;
	}

	public void setInicio(NodoEntero inicio) {
		this.inicio = inicio;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String toString() {
		String salida = "La lista contiene: \n";
		NodoEntero auxiliar = inicio;
		while (auxiliar != null) {
			salida = salida + auxiliar.toString() + " ";
			auxiliar = auxiliar.getSiguiente();
		}
		salida = salida + "\nLa lista tiene " + tamaño + " elementos";
		return salida;
	}

	public void insertarInicio(NodoEntero n) {
		n.setSiguiente(inicio);
		inicio = n;
		tamaño++;

	}

	public void insertarFinal(NodoEntero nodo) {
		if (inicio == null)
			insertarInicio(nodo);
		else {
			NodoEntero actual = inicio;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			actual.setSiguiente(nodo);
			this.tamaño++;
		}
	}

	public boolean insertar(NodoEntero nodo, int posicion) {
		if (posicion > this.tamaño + 1 || posicion < 1) {
			return false;
		} else {
			if (posicion == 1)
				insertarInicio(nodo);
			else if (posicion == tamaño + 1)
				insertarFinal(nodo);
			else {
				NodoEntero nodoAuxiliar = inicio.getSiguiente();
				NodoEntero nodoAnterior = inicio;
				posicion = posicion - 2;
				while (posicion > 0) {
					nodoAnterior = nodoAuxiliar;
					nodoAuxiliar = nodoAuxiliar.getSiguiente();
					posicion--;
				}
				nodo.setSiguiente(nodoAuxiliar);
				nodoAnterior.setSiguiente(nodo);
				this.tamaño++;
			}
			return true;
		}
	}

	public boolean eliminarPrimero() {
		if (inicio == null)
			return false;
		else {
			inicio = inicio.getSiguiente();
			tamaño--;
			return true;
		}
	}

	public boolean eliminarUltimo() {
		if (inicio == null)
			return false;
		else {
			if (tamaño == 1)
				inicio = null;
			else {
				NodoEntero nodoAuxiliar = inicio;
				int posicionAuxiliar = 1;
				while (posicionAuxiliar < this.tamaño - 1) {
					nodoAuxiliar = nodoAuxiliar.getSiguiente();
					posicionAuxiliar++;
				}
				nodoAuxiliar.setSiguiente(null);
			}
			tamaño--;
			return true;
		}

	}

	public boolean eliminar(int posicion) {
		if (posicion <= 0 || posicion > tamaño)
			return false;
		else {
			if (posicion == 1)
				return eliminarPrimero();
			else {
				NodoEntero nodoAEliminar = inicio.getSiguiente();
				NodoEntero nodoAnterior = inicio;
				posicion = posicion - 2;
				while (posicion > 0) {
					nodoAnterior = nodoAEliminar;
					nodoAEliminar = nodoAEliminar.getSiguiente();
					posicion--;
				}
				nodoAnterior.setSiguiente(nodoAEliminar.getSiguiente());
				this.tamaño--;
				return true;
			}
		}
	}

	public boolean esVacia() {
		return (tamaño == 0) ? true : false;
	}

	public int buscarPrimero(NodoEntero n) {
		NodoEntero auxiliar = this.inicio;
		int posicion = 1;
		boolean encontrado = false;
		while (auxiliar != null && !encontrado) {
			if (auxiliar.esIgual(n)) {
				encontrado = true;
			} else {
				auxiliar = auxiliar.getSiguiente();
				posicion++;
			}
		}
		return (auxiliar == null) ? 0 : posicion;

	}

	public ListaSimple buscarTodos(NodoEntero n) {
		NodoEntero auxiliar = this.inicio;
		ListaSimple resultado = new ListaSimple();
		int posicion = 1;

		while (auxiliar != null) {
			if (auxiliar.esIgual(n)) {
				resultado.insertarInicio(new NodoEntero(posicion));
			}
			auxiliar = auxiliar.getSiguiente();
			posicion++;

		}
		return resultado;

	}
	public void eleminarTodos(NodoEntero n){
		
		NodoEntero auxiliar = buscarTodos(n).getInicio();
		while(auxiliar!=null){
			eliminar(auxiliar.getDato());
			auxiliar=auxiliar.getSiguiente();
		}
	}
}
