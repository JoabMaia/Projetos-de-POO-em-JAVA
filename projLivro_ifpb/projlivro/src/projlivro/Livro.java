package projlivro;

public class Livro {
	private String Nome;
	private	Double Pre�o;
	private int Ano;
	
	public Livro() {
		this.setNome("Sem Declara��o de Nome\n");
		this.setPre�o(0.0);
		this.setAno(0);
	}
	
	public Livro(String Nome, Double Pre�o, int Ano) {
		setNome(Nome);
		setPre�o(Pre�o);
		setAno(Ano);
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Double getPre�o() {
		return Pre�o;
	}
	public void setPre�o(Double pre�o) {
		if(pre�o > 0) {
			Pre�o = pre�o;
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
                " Pre�o: " + getPre�o() +
                " Ano: " + getAno();
    }
}
