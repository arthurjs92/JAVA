package Composicao;

public class Capitulos {
	private String tituloCapitulo;
    private int paginasCapitulo, numeroCapitulo;
    private Livro livro;
    public Capitulos(String tituloCapitulo, int paginasCapitulo, int numeroCapitulo) {
        this.tituloCapitulo = tituloCapitulo;
        this.paginasCapitulo = paginasCapitulo;
        this.numeroCapitulo = numeroCapitulo;
    }
    public String getTituloCapitulo() {
        return this.tituloCapitulo;
    }
    public void setTituloCapitulo(String tituloCapitulo) {
        this.tituloCapitulo = tituloCapitulo;
    }
    public int getPaginasCapitulo() {
        return this.paginasCapitulo;
    }
    public void setPaginasCapitulo(int paginasCapitulo) {
        this.paginasCapitulo = paginasCapitulo;
    }
    public int getNumeroCapitulo() {
        return this.numeroCapitulo;
    }
    public void setNumeroCapitulo(int numeroCapitulo) {
        this.numeroCapitulo = numeroCapitulo;
    }
    public void imprimirCapitulo() {
        System.out.println("Número do capítulo: " + numeroCapitulo + ".\n Título: " + tituloCapitulo + ".\n Número de páginas do capítulo: " + paginasCapitulo);
    }
}
