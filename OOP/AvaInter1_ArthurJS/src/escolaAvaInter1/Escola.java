package escolaAvaInter1;

public class Escola {
	
	private int codigoEsc;
    private String nomeEsc;

    public Escola(int codigoEsc, String nomeEsc) {
        this.codigoEsc = codigoEsc;
        this.nomeEsc = nomeEsc;
    }
    public void getCodigo(int codigoEsc) {
        this.codigoEsc = codigoEsc;
    }
    public void getNome(String nomeEsc) {
        this.nomeEsc = nomeEsc;
    }
    public void setCodigo(int codigoEsc) {
        this.codigoEsc = codigoEsc;
    }
    public void setNome(String nomeEsc) {
        this.nomeEsc = nomeEsc;
    }
    
	public static double calcularDesconto(double v) {
		if(v<=400.00)
			return v*0.05;
		else
			return v*0.1+calcularDesconto(v/2);
	}
	
	public static double calcularTotalAPagar(double mensalidade) {
		double aux1 = Escola.calcularDesconto(mensalidade);
		return mensalidade-aux1;
	}
}