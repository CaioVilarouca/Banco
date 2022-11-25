package entitites;

public class Produtos{
	private String nomeProduto;
	private Double valor;
	public Double valorFinal;

	public Produtos(){
		super();
	}
	
	public Produtos(String nomeProduto, Double valor, Double valorFinal) {
		this.nomeProduto = nomeProduto;
		this.valor = valor;
		this.valorFinal = valorFinal;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getValor() {
		return valor;
	}
		
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}
	
	public void sum(double valorFinal) {
		this.valorFinal += valorFinal;
	}
	
	@Override
	public String toString() {
		return String.format("\n X  Nome do produto .......: %s"
				+ "\n X  Preço ...............[R$: %.2f]"
				+ "\n X  -----------------------------------", nomeProduto, valor);
	}
}
