package projlivro;

public class Livro {
	private String Nome;
	private	Double Preço;
	private int Ano;
	
	public Livro() {
		this.setNome("Sem Declaração de Nome\n");
		this.setPreço(0.0);
		this.setAno(0);
	}
	
	public Livro(String Nome, Double Preço, int Ano) {
		setNome(Nome);
		setPreço(Preço);
		setAno(Ano);
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Double getPreço() {
		return Preço;
	}
	public void setPreço(Double preço) {
		if(preço > 0) {
			Preço = preço;
		}
	}
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		if(ano > 0) {
			Ano = ano;
		}
	}
	public String toString()
    {
        return "Nome: " +  getNome() +
                " Preço: " + getPreço() +
                " Ano: " + getAno();
    }
}
