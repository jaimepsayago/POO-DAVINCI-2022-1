package clase10112022EjerciosQueuePolimorfismo;

public class ArrayQueue  <E> implements Queue<E> {

	//variables
	//array de datos
	private E[] data;
	//index
	private int f=0;
	//numero de elementos
	private int sz=0;
	//constante tamaño array
	public static final int CAPACITY=1000;
	//constructor
	//tamaño pro defecto
	public ArrayQueue() {
		this(CAPACITY);
	}
	//tamaño declarado por el usuario
	public ArrayQueue(int capacity) {
		data=(E[]) new Object [capacity];
	}
	
	public int size() {
		return sz;
	}

	public boolean isEmpty() {
		return (sz==0);
	}
	public void addQueue(E e) {
		//primero vemos si esta  llena la cola
		if(sz== data.length) {
			throw new IllegalStateException("cola esta llena");
		}
		//agregamos una funcion para conocer el valor a agregar en la cola
		//f = indice sz = tamaño data = array
		// 4 % 2 = 0
		int av=(f + sz) % data.length; //
		data[av] = e; //agregamos el valor obtenido en av como indice de la cola
		sz++;
		
	}
	public E first() {
		if(isEmpty())
		{
			return null;
		}
		return data[f];
	}
	//retorna y remover el ultimo elemento
	public E deQueue() {
		if(isEmpty())
		{
			return null;
		}
		//insetar un obj a una variable
		E res = data[f];
		data[f] = null; //referencia el obj a null -->  obj1 - obj2 - obj3
		//reobtener el tamaño del objeto
		f = (f + 1) % data.length;
		sz--;
		return res;
	}
	





}
