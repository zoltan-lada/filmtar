package FilmTar;
import java.util.*;

public class Sorozattar {
    private ArrayList<Sorozat> sorozatok = new ArrayList<>();

    public void add(Sorozat sorozat) {
        sorozatok.add(sorozat);
    }

    public void remove(String cim) {
        for(Sorozat sorozat: sorozatok) {
            if(sorozat.getCim() == cim) {
                sorozatok.remove(sorozat);
            }
        }
    }

    public ArrayList<Sorozat> search(String kriteriumTipus,String kriterium ){
		ArrayList<Sorozat> talaltSorozat = new ArrayList<>();
		for(Sorozat sorozat : sorozatok) {
			switch (kriteriumTipus) {
				case "cim" :
					if(sorozat.getCim().equals(kriterium)) {
						talaltSorozat.add(sorozat);
					}
					break;
				case "kiadev" :
					if(sorozat.getKiadev().equals(Integer.valueOf(kriterium))) {
						talaltSorozat.add(sorozat);
					}
					break;
				case "korhatar" :
					if(sorozat.getKorhatar().equals(Integer.valueOf(kriterium))) {
						talaltSorozat.add(sorozat);
					}
					break;
			}
		}
		return talaltSorozat;
	}
    
    public void extend(String kriteriumTipus,String cim ,String hozzaadott){
		for(Sorozat sorozat : sorozatok) {
			if(sorozat.getCim().equals(cim)) {
				switch (kriteriumTipus) {
					case "hossz" :
						if(sorozat.getHossz() == null) {
							sorozat.setHossz(Integer.valueOf(hozzaadott));
						}else {
							System.out.println("Már van hossza");
						}
						break;
					case "kiadev" :
						if(sorozat.getKiadev() == null) {
							sorozat.setKiadev(Integer.valueOf(hozzaadott));
						}else {
							System.out.println("Már van kiadási éve");
						}
						break;
					case "korhatar" : 
						if(sorozat.getKorhatar() == null) {
							sorozat.setKorhatar(Integer.valueOf(hozzaadott));
						}else {
							System.out.println("Már van korhatára");
						}
						break;
					case "evad" : 
						if(sorozat.getEvad() == null) {
							sorozat.setEvad(Integer.valueOf(hozzaadott));
						}else {
							System.out.println("Már van korhatára");
						}
						break;
					case "resz" : 
						if(sorozat.getResz() == null) {
							sorozat.setResz(Integer.valueOf(hozzaadott));
						}else {
							System.out.println("Már van korhatára");
						}
						break;
				}
			}
		}
	}
    
    public void sorozatListazo(ArrayList<Sorozat> sorozatlista) {
		if(sorozatlista.size() == 0) {
			System.out.println("Nincsenek sorozatok");
		}else {
			for(Sorozat sorozat : sorozatlista) {
				System.out.println(sorozat);
			}
		}
	}
    
    public ArrayList<Sorozat> getSorozatok() {
        return sorozatok;
    }
}
