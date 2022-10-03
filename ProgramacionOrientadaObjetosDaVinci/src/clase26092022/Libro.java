package clase26092022;

public class Libro  extends Publicacion{
	public String isbn;
	public String nombreAutor;
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	public Libro(String editor, String fecha, String isbn, String nombreAutor) {
		super(editor, fecha);
		this.isbn=isbn;
		this.nombreAutor= nombreAutor;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getNombreAutor() {
		return nombreAutor;
	}
	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	
	
}
