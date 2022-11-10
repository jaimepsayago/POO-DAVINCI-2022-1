package clase10112022EjerciosQueuePolimorfismo;

public interface Queue <E> {
	
	//tamaño
	int size();
	
	//si esta vacia
	boolean isEmpty();
	
	//insertar elemento
	void addQueue(E e);
	
	//retonar el primer valor y lo quita
	E first();
	
	//remover y devuelve el primer
	E deQueue();
	

}
