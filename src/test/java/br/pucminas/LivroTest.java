package test.java.br.pucminas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.java.br.pucminas.Livro;

public class LivroTest {

	@Test
	public void testCriarLivro() {
		Livro livro = new Livro("Java", "Deitel", 1, false);
		assertEquals("Java", livro.getTitulo());
		assertEquals("Deitel", livro.getAutor());
		assertEquals(1, livro.getId());
		assertFalse(livro.isEmprestado());
	}

	@Test
	public void testEmprestarLivro() {
		Livro livro = new Livro("Java", "Deitel", 1, false);
		assertFalse(livro.isEmprestado());
		livro.setEmprestado(true);
		assertTrue(livro.isEmprestado());
	}

	@Test
	public void testRetornarLivro() {
		Livro livro = new Livro("Java", "Deitel", 1, true);
		assertTrue(livro.isEmprestado());

		livro.setEmprestado(false);
		assertFalse(livro.isEmprestado());
	}
}