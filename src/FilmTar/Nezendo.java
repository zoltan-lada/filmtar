package FilmTar;

import java.util.Objects;

public abstract class Nezendo {

    private String cim;
    private Integer hossz;
    private Integer kiadev;
    private Integer korhatar;

    public Nezendo(String cim, Integer hossz, Integer kiadev, Integer korhatar) {
        this.cim = cim;
        this.hossz = hossz;
        this.kiadev = kiadev;
        this.korhatar = korhatar;
    }

	public String getCim() {
        return cim;
    }

    public Integer getHossz() {
        return hossz;
    }

    public Integer getKiadev() {
        return kiadev;
    }

    public Integer getKorhatar() {
        return korhatar;
    }
    
    
    public String toString() {
        return (cim != null ? cim : "-") + ";" +
                (hossz != null ? hossz : "-") + ";" +
                (kiadev != null ? kiadev : "-") + ";" +
                        (korhatar != null ? korhatar : "-");
    }
    
    public void setCim(String cim) {
		this.cim = cim;
	}

	public void setHossz(Integer hossz) {
		this.hossz = hossz;
	}

	public void setKiadev(Integer kiadev) {
		this.kiadev = kiadev;
	}

	public void setKorhatar(Integer korhatar) {
		this.korhatar = korhatar;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nezendo other = (Nezendo) obj;
		return Objects.equals(cim, other.cim) && hossz == other.hossz && kiadev == other.kiadev
				&& korhatar == other.korhatar;
	}
}
