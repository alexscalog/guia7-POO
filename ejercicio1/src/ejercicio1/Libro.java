package ejercicio1;

public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;

    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void cargarLibro(int ISBN, String titulo, String autor, int numeroPaginas) {

        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    public void informarLibro() {
        System.out.println("ISBN del libro: " + ISBN);
        System.out.println("Título del libro: " + titulo);
        System.out.println("Autor del libro: " + autor);
        System.out.println("Páginas del libro: " + numeroPaginas);

    }

}
