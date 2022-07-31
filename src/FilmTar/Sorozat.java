package FilmTar;


public class Sorozat extends Nezendo {

    private Integer resz;
    private Integer evad;

    public Sorozat(String cim, Integer hossz, Integer kiadev, Integer korhatar, Integer resz, Integer evad) {
        super(cim,hossz,kiadev,korhatar);
    	this.resz = resz;
        this.evad = evad;
        
    }

    public void setResz(Integer resz) {
		this.resz = resz;
	}

	public void setEvad(Integer evad) {
		this.evad = evad;
	}

	public Integer getResz() {
        return resz;
    }

    public Integer getEvad() {
        return evad;
    }

    @Override
    public String toString() {
        return super.toString() + ";" +
                (this.getResz() != null ? this.getResz().toString() : "-") + ";" +
                (this.getEvad() != null ? this.getEvad().toString() : "-");
    }
}
