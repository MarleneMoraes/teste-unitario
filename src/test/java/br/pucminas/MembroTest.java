package test.java.br.pucminas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.br.pucminas.Livro;
import main.java.br.pucminas.Membro;

class MembroTest {
	
	@Test
	public void testMembroPegaEmprestado() {
		Membro membro = new Membro(1, "Ana");
		Livro livro = new Livro("Senhor Dos Aneis", "J.R.R Tolkien", 2, false);
		membro.pegarEmprestado(livro);
		assertTrue(membro.getLivrosEmprestados().contains(livro));
	}
	
	@Test
	public void testMembroRetornaLivro() {
		Membro membro = new Membro(1, "Ana");
		Livro livro = new Livro("Senhor Dos Aneis", "J.R.R Tolkien", 2, true);
		membro.retornarLivro(livro);
		assertFalse(membro.getLivrosEmprestados().contains(livro));
	}

}