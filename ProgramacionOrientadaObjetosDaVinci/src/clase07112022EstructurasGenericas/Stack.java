package clase07112022EstructurasGenericas;

//metodos

public interface Stack <E> {
	
	//tama�o de la stack
	int size();	
	
	//comprobar si esta vacia
	boolean isEmpty();
	
	//insertar datos
	void push(E e);
	
	//visualizar
	E pop();
	
	//obtener el ultimo elemento de la stack
	E top();
	
	//tama�o
	int t();
	
	//mas metodos
	

}
