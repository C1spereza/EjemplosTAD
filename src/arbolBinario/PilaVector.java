package arbolBinario;

public class PilaVector {
	private Object[] n;
	private int tamaño;
	
	public PilaVector(){
		tamaño=0;
		n = new Nodo[100];
	}
	
	public void insertar(Nodo a){
		if(n[this.tamaño]==null){
			n[this.tamaño]=a;
		}else{
			this.tamaño++;
			n[this.tamaño]=a;
		}
	}
	
	public Object quitar(){
		if(n[this.tamaño]==null){
			return null;
		}else{
			if(this.tamaño==0){
				Object aux;
				aux=n[this.tamaño];
				n[this.tamaño]=null;
				return aux;
			}else{
				Object aux;
				aux=n[this.tamaño];
				n[this.tamaño]=null;
				this.tamaño--;
				return aux;
			}
		}
	}

}
