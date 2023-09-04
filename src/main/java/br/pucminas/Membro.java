package main.java.br.pucminas;

import java.util.ArrayList;
import java.util.List;

public class Membro {
  private int id;
  private String nome;
  private List<Livro> livrosEmprestados;

  public Membro(int id, String nome) {
    this.id = id;
    this.nome = nome;
    this.livrosEmprestados = new ArrayList<>();
  }

  public Membro(int id, String nome, List<Livro> livrosEmprestados) {
    this.id = id;
    this.nome = nome;
    this.livrosEmprestados = livrosEmprestados;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Livro> getLivrosEmprestados() {
    return livrosEmprestados;
  }

  public void setLivrosEmprestados(List<Livro> livrosEmprestados) {
    this.livrosEmprestados = livrosEmprestados;
  }

  public void pegarEmprestado(Livro livro) {
    try {
      livrosEmprestados.add(livro);
    } catch (Exception e) {
      e.getMessage();
    }
  }

  public void retornarLivro(Livro livro) {
    try {
      for (Livro livroEmprestado : livrosEmprestados) {
        if (livro.equals(livroEmprestado)) {
          livrosEmprestados.remove(livro);
          break;
        }
      }
    } catch (Exception e) {
      e.getMessage();
    }
  }
}
