package FilmTar;

import java.util.*;

public class Filmtar {

	private ArrayList<Film> filmek = new ArrayList<>();

	public void add(Film film) {
		filmek.add(film);
	}

	public void remove(String cim) {
		for (int i = 0; i < filmek.size(); i++) {
			if (filmek.get(i).getCim() == cim) {
				filmek.remove(filmek.get(i));
			}
		}
	}

	public ArrayList<Film> search(String kriteriumTipus,String kriterium ){
		ArrayList<Film> talaltFilmek = new ArrayList<Film>();
		for(Film film : filmek) {
			switch (kriteriumTipus) {
				case "cim" :
					if(film.getCim().equals(kriterium)) {
						talaltFilmek.add(film);
					}
					break;
				case "kiadev" :
					if(film.getKiadev().equals(Integer.valueOf(kriterium))) {
						talaltFilmek.add(film);
					}
					break;
				case "korhatar" :
					if(film.getKorhatar().equals(Integer.valueOf(kriterium))) {
						talaltFilmek.add(film);
					}
					break;
			}
		}
		return talaltFilmek;
	}
	
	public void extend(String kriteriumTipus,String cim ,String hozzaadott){
		for(Film film : filmek) {
			if(film.getCim().equals(cim)) {
				switch (kriteriumTipus) {
					case "hossz" :
						if(film.getHossz() == null) {
							film.setHossz(Integer.valueOf(hozzaadott));
						}else {
							System.out.println("Már van hossza");
						}
						break;
					case "kiadev" :
						if(film.getKiadev() == null) {
							film.setKiadev(Integer.valueOf(hozzaadott));
						}else {
							System.out.println("Már van kiadási éve");
						}
						break;
					case "korhatar" : 
						if(film.getKorhatar() == null) {
							film.setKorhatar(Integer.valueOf(hozzaadott));
						}else {
							System.out.println("Már van korhatára");
						}
						break;
				}
			}
		}
	}
	
	public void filmListazo(ArrayList<Film> filmlista) {
		if(filmlista.size() == 0) {
			System.out.println("Nincsenek filmek");
		}else {
			for(Film film : filmlista) {
				System.out.println(film);
			}
		}
	}
	
	public ArrayList<Film> getFilmek() {
		return filmek;
	}
}
