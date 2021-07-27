
public class Livros extends Material {
	private String autor;
	
	public Livros(String autor, String titulo, int ano) {
		setTitulo(titulo);
		setAutor(autor);
		setAno(ano);
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	 public static void incluirLivros(Livros livro) {
		 listLivros.add(livro);
		 Integer[] array = {1, listLivros.size()-1};
		 Livros.materiais.put(getIndex(),array);
	 }
}
