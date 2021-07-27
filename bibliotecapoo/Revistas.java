
public class Revistas extends Material {
	private String org;
	private int vol;
	private int nro;
	
	public Revistas(String org, int vol, int nro, String titulo, int ano) {
		setOrg(org);
		setVol(vol);
		setNro(nro);
		setTitulo(titulo);
		setAno(ano);
	}
	
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	 public static void incluirRevistas(Revistas revistas) {
		 listrevistas.add(revistas);
		 Integer[] array = {2, listrevistas.size()-1};
		 Revistas.materiais.put(getIndex(),array);
	 }
	
	
}
