package FilmTar;

public class DokumentumFilm extends Film {
	
	private String leiras;
	
	public DokumentumFilm(String cim, Integer hossz, Integer kiadev, Integer korhatar, String leiras){
		super(cim, hossz, kiadev, korhatar);
		this.leiras = leiras;
	}
	
	public String getLeiras() {
		return leiras;
	}

	@Override
	public String toString() {
		return super.toString() + ";" + leiras != null ? leiras : "-";
	}

	public void setLeiras(String leiras) {
		this.leiras = leiras;
	}
	
	
	

}
