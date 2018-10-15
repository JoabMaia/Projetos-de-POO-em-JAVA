package Streams_ObjectArquivo;

import java.io.Serializable;

public class Livro implements Serializable {
    private String titulo;
    private int codigo;

    public Livro(String titulo, int codigo) {
        setTitulo(titulo);
        setCodigo(codigo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + getTitulo() + ", codigo=" + getCodigo() + '}';
    }
}
