package main.java.br.pucminas;

import java.util.List;

public class Biblioteca {
	private List<Livro> acervo;
	private List<Membro> membros;

	public void registrarLivro(Livro livro) {
    try {
			if (!livroExiste(livro)) {
				acervo.add(livro);
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void emprestarLivro(int livroId, int membroId) {
		try {
			Livro livro = validaLivroId(livroId);
			Membro membro = validaMembroId(membroId);
			
			if (livro != null &&  membro != null) {
				livro.setEmprestado(true);
				membro.pegarEmprestado(livro);
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public void retornarLivro(int livroId, int membroId) {
		try {
			Livro livro = validaLivroId(livroId);
			Membro membro = validaMembroId(membroId);
			
			if (livro != null &&  membro != null) {
				livro.setEmprestado(false);
				membro.retornarLivro(livro);
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	private Livro validaLivroId(int livroId) {
		for (Livro livro : acervo) {
			if (livro.getId() == livroId) {
				return livro;
			}
		}
		return null;
	}

	private Membro validaMembroId(int membroId) {
		for (Membro membro : membros) {
			if (membro.getId() == membroId) {
				return membro;
			}
		}
		return null;
	}

  private boolean livroExiste(Livro livro){
    for (Livro livroAcervo : acervo) {
			if (livroAcervo.getTitulo() == livro.getTitulo()) {
				return true;
			}
		}
		return false;
  }
  public boolean chamaLivroExiste(Livro livro) {
	  return livroExiste(livro);
  }
}
