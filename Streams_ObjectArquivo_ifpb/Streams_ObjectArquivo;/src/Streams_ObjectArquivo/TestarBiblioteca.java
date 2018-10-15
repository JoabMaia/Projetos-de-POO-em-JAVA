package Streams_ObjectArquivo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestarBiblioteca {

    public static void main(String[] args) {
        Biblioteca B = new Biblioteca();
        
        B.CadastrarLivro("livro.txt", "As aventuras de POO", 12345);
        B.CadastrarLivro("livro.txt", "Em busca do resolva", 12332);
        B.listar_livros("livro.txt");
        B.buscar_livros(12345);
        try {
            B.gravarObjetoMB(B);
        } catch (IOException ex) {
            Logger.getLogger(TestarBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
        Biblioteca b2=null;
        try {
            b2=(Biblioteca)B.recuperarObjetoMB("livro.obj");
        } catch (IOException ex) {
            Logger.getLogger(TestarBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestarBiblioteca.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(b2.lista_de_livros.toString());
        
    }
    
}
