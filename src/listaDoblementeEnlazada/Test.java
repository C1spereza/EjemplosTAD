package listaDoblementeEnlazada;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDoblementeEnlazada lista=new ListaDoblementeEnlazada();
		System.out.println(lista.toString());
				
		lista.insertarCola(new Nodo(1));
		System.out.println(lista.toString());
		System.out.println("El valor de la cabeza es: " + lista.getCabeza().toString());
		System.out.println("El valor de la cola es: " + lista.getCola().toString());
		System.out.println("El tamaño es: " + lista.getTamaño());
		
		lista.insertarCola(new Nodo(2));
		lista.insertarCola(new Nodo(3));
		lista.insertarCola(new Nodo(4));
		lista.insertarInicio(new Nodo(0));
		System.out.println(lista.toString());
		System.out.println("El valor de la cabeza es: " + lista.getCabeza().toString());
		System.out.println("El valor de la cola es: " + lista.getCola().toString());
		System.out.println("El tamaño es: " + lista.getTamaño());
		System.out.println(lista.toStringInvertido());
	}

}
