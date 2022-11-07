package clase07112022EstructurasGenericas;

//T = type V= value K= key E= 

public class ArrayStack<E> implements Stack<E> {

	//tamaño a la pila a traves de constantes
	public static final int CAPACITY=1000;
	
	//declarar el array generico
	public E[] data;
	
	//declaracion del valor indice de los elementos del array
	//cual es el valor incial del indice de un array -1
	public int t=-1;
	
	//constructores
	public ArrayStack() {
		this(CAPACITY); //este construcotr va a atomar el valor de capacity por defecto
	}
	public ArrayStack(int capacity) {
		data = (E[]) new Object[capacity];
	}
	
	//implementar los metodos 
	
	public int size() {
		//cada vez que se llame a este metodos va a aumentar el valor
		return (t +1);
	}

	public boolean isEmpty() {
		// si esta vacia la pila que nos devuelve -1
		return (t == -1);
	}

	//agregar un dato
	public void push(E e) {
		// el primer paso es comprobar el tamaño de la pila
		if( size() == data.length) {
				throw new IllegalStateException("la pila esta llena");
		}
		//agrego el dato
		data[++t] = e; //incrementamos el tamño de t y el dato es agregado al array
		
	}

//visualizar y remover el dato
	public E pop() {
		// 1. revisar si esta vacio
		if (isEmpty() ) {
			return null; // envia nulo ya que no hay valores q mostrar
		}
		//algoritmo
		//agrega el array a un obj
		E obj = data[t];
		data[t] = null; //borro el ultimo dato
		t--;
		
		return obj;
	}

	//visualiza los datos pero si borrarlas 
	public E top() {
		// 1. revisar si esta vacio
		if(isEmpty()) {
			return null;
		}
		return data[t];
			
	}

	//tamaño
	public int t() {
		// devolver el tamaño
		return t;
	}

}
