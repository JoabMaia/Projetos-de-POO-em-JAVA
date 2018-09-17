package projlivro;

public class TestarCatalogo {
	 public static void main(String[] args) {
		 CatalogoLivros livraria = new CatalogoLivros();
		 
		 livraria.AdicionarCatalogo("Fundamentos de Matemática Elementar", 130.0, 2013);
		 livraria.AdicionarCatalogo("Fundamentos de Matemática Elementar", 130.0, 2013);
		 livraria.listar_livros();
		 livraria.buscar_livros("Fundamentos de Matemática Elementar");
		 livraria.remove_livros("Fundamentos de Matemática Elementar");
		 livraria.listar_livros();
		 livraria.AdicionarCatalogo("As aventuras de Joab", 1000.0, 2018);
		 livraria.listar_livros();
		 livraria.remove_livros("Fundamentos de Matemática Elementar");
		 livraria.listar_livros();
		 livraria.remove_livros("As aventuras de Joab");
	}
}
