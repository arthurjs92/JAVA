package Composicao;
public class Livro {
	private String isbn, titulo, autor, edicao, anoEdicao, editor;
    private int numPaginas;
    private Capitulos capitulos;
    public Livro(String isbn, String titulo, String autor, 
    		String edicao, String anoEdicao, 
    		String editor, int numPaginas, Capitulos capitulos) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.anoEdicao = anoEdicao;
        this.editor = editor;
        this.numPaginas = numPaginas;
        this.capitulos = capitulos;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEdicao() {
        return this.edicao;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    public String getAnoEdicao() {
        return this.anoEdicao;
    }
	public void setAnoEdicao(String anoEdicao) {
        this.anoEdicao = anoEdicao;
    }
    public String getEditor() {
        return this.editor;
    }
    public void setEditor(String editor) {
        this.editor = editor;
    }
    public int getNumPaginas() {
        return this.numPaginas;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public Capitulos getCapitulos() {
        return this.capitulos;
    }
    public void setCapitulos(Capitulos capitulos) {
        this.capitulos = capitulos;
    }
    public void imprimirLivro() {
        System.out.println("ISBN: " + isbn+ ".\n Título: " + titulo + ".\n Autor: " + autor +  ".\n Edição: " + edicao + ".\n Ano da edição: " + anoEdicao 
        		+ ".\n Editor: " 
        		+ editor 
        		+ ".\n Número de páginas: " 
        		+ numPaginas);}}
