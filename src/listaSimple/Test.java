package listaSimple;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaSimple lista = new ListaSimple();
		// System.out.println(lista.eliminarUltimo());

		lista.insertarFinal(new NodoEntero(1));
		lista.insertarFinal(new NodoEntero(2));
		lista.insertarFinal(new NodoEntero(1));
		lista.insertarFinal(new NodoEntero(23));
		lista.insertarFinal(new NodoEntero(1));
		lista.insertarFinal(new NodoEntero(23));
		lista.insertarFinal(new NodoEntero(1));
		
		System.out.println(lista.toString());
		lista.eleminarTodos(new NodoEntero(23));
		System.out.println(lista.toString());
		
	}
}
