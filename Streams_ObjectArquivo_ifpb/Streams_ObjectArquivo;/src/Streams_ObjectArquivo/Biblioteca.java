package Streams_ObjectArquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Biblioteca implements Serializable{
    public ArrayList<Livro> lista_de_livros; 
    
    public Biblioteca(){	
		lista_de_livros = new ArrayList<Livro>();
    }
    public boolean CadastrarLivro(String arquivo, String titulo, int codigo) {
            Livro Llivros = new Livro(titulo, codigo);
            lista_de_livros.add(Llivros);
        try (FileWriter fw = new FileWriter(arquivo, true);
             BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write(titulo + "#" + codigo + "\n");
            bw.flush();
            return true;
        } catch (IOException obj) {
            return false;
        }
    }
    public  int buscar_livros(int codigo) {
		int cont = 0;
		for(Livro L_posicao: lista_de_livros) {
			if(L_posicao.getCodigo() == codigo) {
				System.out.println(L_posicao.toString());
				return codigo;
			}
			else if(L_posicao.getCodigo() != codigo && cont == 1) {
				System.out.println("Não Encontrado");
			}
			cont++;
		}
		return 0;
	}
    public void listar_livros(String arquivo) {
	System.out.println(lista_de_livros.toString());
    }
    public boolean gravarObjetoMB(Object obj) throws IOException{
        boolean r=false;
            FileOutputStream fos = new FileOutputStream("livro.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            r=true;
        
        return r;        
    }
    public Object recuperarObjetoMB(String arquivo) throws IOException, ClassNotFoundException{
        Object obj=null;
            FileInputStream fis = new FileInputStream(arquivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj=ois.readObject();
             
        return obj;        
    }
    
}
