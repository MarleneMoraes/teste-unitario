package test.java.br.pucminas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import main.java.br.pucminas.Livro;
import main.java.br.pucminas.Biblioteca;

class BibliotecaTest {
	private List<Livro> acervo;

@Test
public void testRegistrarLivro(){
    Livro livro = new Livro("Java", "Deitel", 1, false);
    Biblioteca livroExiste = new Biblioteca();
    livroExiste.chamaLivroExiste(livro);
    assertTrue(livroExiste.chamaLivroExiste(livro));
    assertTrue(acervo.add(livro));
} 


@Test
public void testEmprestarLivroNaoDisponivel(){
    Livro livro = new Livro("Java", "Deitel", 1, false);
    livro.isEmprestado();
    assertFalse(livro.isEmprestado());
} 


}