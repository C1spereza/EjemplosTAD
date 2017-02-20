package listaSimple;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListaSimple lista = new ListaSimple();
		// System.out.println(lista.eliminarUltimo());

		lista.insertarFinal(new Nodo(1));
		//lista.insertarFinal(new Nodo(2));
		//lista.insertarFinal(new Nodo(3));

		System.out.println(lista.eliminar(1));
		System.out.println(lista.toString());
	}

}
