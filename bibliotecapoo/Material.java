import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Material {
	private String titulo;
	private int ano;
	public static int index = 0;
	
	public static ArrayList<Livros> listLivros = new ArrayList<Livros>();
	public static ArrayList<Revistas> listrevistas = new ArrayList<Revistas>();
	public static Map<Integer,Integer[]> materiais = new HashMap<Integer, Integer[]>();
	
	public Material() {
		index++;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	public static int getIndex() {
		return index;
	}

	public static void setIndex(int index) {
		Material.index = index;
	}
	
	public static String mostraMateriais() {
		String inicio = "";
		for(int i= 1; i<= materiais.size(); i++) {
			if(materiais.get(i)[0]==1) {
				inicio += "\n\nlivros:";
				inicio +="\ntitulo: " + listLivros.get(materiais.get(i)[1]).getTitulo();
				inicio +="\nautor: " + listLivros.get(materiais.get(i)[1]).getAutor();
				inicio +="\nano: " + listLivros.get(materiais.get(i)[1]).getAno();
			}else {
				inicio += "\n\nrevistas: ";
				inicio +="\ntitulo: " + listrevistas.get(materiais.get(i)[1]).getTitulo();
				inicio +="\norg: " + listrevistas.get(materiais.get(i)[1]).getOrg();
				inicio +="\nano: " + listrevistas.get(materiais.get(i)[1]).getAno();
				inicio +="\nvol: " + listrevistas.get(materiais.get(i)[1]).getVol();
				inicio +="\nnro: " + listrevistas.get(materiais.get(i)[1]).getNro();
			}
		}
		
		return inicio;
	}
}
