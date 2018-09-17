package projlivro;

import java.util.ArrayList;

public class CatalogoLivros {
	
	public ArrayList<Livro> lista_de_livros; 
	
	public CatalogoLivros(){
		
		lista_de_livros = new ArrayList<Livro>();
	}
	
	public boolean AdicionarCatalogo(String N, Double P, int A) {
		Livro Llivros = new Livro(N, P, A);
        return lista_de_livros.add(Llivros);		
	}
	
	public String remove_livros(String N) {
		int cont=0;
		for(Livro L_posicao: lista_de_livros) {
			if(L_posicao.getNome() == N) {
				lista_de_livros.remove(L_posicao);
			}
			else if(L_posicao.getNome() != N && cont==1) {
				System.out.println("Nenhum livro Encontrado");
			}
			if(cont == 0) {
				System.out.println("Todos foram removidos");
				return "Não Encontrado";
			}
			cont++;
		}	
		return "Não Encontrado";	
	}
	
	public	String buscar_livros(String N) {
		int cont = 0;
		for(Livro L_posicao: lista_de_livros) {
			if(L_posicao.getNome() == N) {
				System.out.println(L_posicao.toString());
				return N;
			}
			else if(L_posicao.getNome() != N && cont == 1) {
				System.out.println("Não Encontrado");
			}
			cont++;
		}
		return "Não Encontrado";
	}
	
	public void listar_livros() {
		System.out.println(lista_de_livros.toString());
	}
}