package tesztek;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import FilmTar.FileKezelo;
import FilmTar.Film;
import FilmTar.Filmtar;
import FilmTar.Sorozat;
import FilmTar.Sorozattar;

public class FilmTarTest {
	
	@Test
	public void filmBeolvastest() {
		Filmtar filmtar = new Filmtar();
		FileKezelo.filmeketBeolvas(filmtar);
		ArrayList<Film> filmek = filmtar.getFilmek();
		assertEquals("asd",filmek.get(0).getCim());
		assertEquals("asda",filmek.get(1).getCim());
		
	}
	
	@Test
	public void addFilmTest() {
		Filmtar filmtar = new Filmtar();
		Film film = new Film("teszt",1,2,33);
		filmtar.add(film);
		ArrayList<Film> filmek = filmtar.getFilmek();
		System.out.println(filmtar.getFilmek());
		assertEquals(film,filmek.get(filmek.size() - 1));
	}
	
	@Test
	public void searchFilmTest() {
		Filmtar filmtar = new Filmtar();
		filmtar.add(new Film("teszt15",1,2,44));
		filmtar.add(new Film("valami",2,33,1));
		ArrayList<Film> filmek = filmtar.search("cim", "teszt15");
		System.out.println(filmtar.getFilmek());
		assertEquals(1,filmek.size());
	}
	
	@Test
	public void extendFilmTest() {
		Filmtar filmtar = new Filmtar();
		filmtar.add(new Film("teszt4",null,1,44));
		filmtar.extend("hossz","teszt4" , "1");
		System.out.println(filmtar.getFilmek());
		assertEquals(Integer.valueOf(1),filmtar.getFilmek().get(0).getHossz());
	}
	
	@Test
	public void removeFilmTest() {
		Filmtar filmtar = new Filmtar();
		filmtar.add(new Film("teszt4",null,1,44));
		filmtar.add(new Film("valami",2,33,1));
		filmtar.remove("teszt4");
		assertEquals(1,filmtar.getFilmek().size());
	}
	
	@Test
	public void sorozatBeolvas() {
		Sorozattar sorozattar = new Sorozattar();
		FileKezelo.sorozatokatBeolvas(sorozattar);
		ArrayList<Sorozat> sorozatok = sorozattar.getSorozatok();
		//Sorozat test2 = new Sorozat("sad",1,2,3,4,5);
		assertEquals("sad",sorozatok.get(0).getCim());
		assertEquals("test2",sorozatok.get(1).getCim());
	}
	
	@Test
	public void addSorozatTest() {
		Sorozattar sorozattar = new Sorozattar();
		Sorozat sorozat = new Sorozat("teszt",1,2,3,4,5);
		sorozattar.add(sorozat);
		ArrayList<Sorozat> sorozatok = sorozattar.getSorozatok();
		assertEquals(sorozat,sorozatok.get(sorozatok.size() - 1));
	}
	
	@Test
	public void searchSorozatTest() {
		Sorozattar sorozattar = new Sorozattar();
		sorozattar.add(new Sorozat("teszt15",1,2,44,1,1));
		sorozattar.add(new Sorozat("valami",2,33,1,2,3));
		ArrayList<Sorozat> sorozatok = sorozattar.search("cim", "teszt15");
		System.out.println(sorozattar.getSorozatok());
		assertEquals(1,sorozatok.size());
	}
	
	@Test
	public void extendSorozatTest() {
		Sorozattar sorozattar = new Sorozattar();
		sorozattar.add(new Sorozat("teszt4",null,1,441,1,1));
		sorozattar.extend("hossz","teszt4" , "1");
		System.out.println(sorozattar.getSorozatok());
		assertEquals(Integer.valueOf(1),sorozattar.getSorozatok().get(0).getHossz());
	}
	
	@Test
	public void removeSorozatTest() {
		Sorozattar sorozattar = new Sorozattar();
		sorozattar.add(new Sorozat("teszt4",null,1,44,13,3));
		sorozattar.add(new Sorozat("valami",2,33,1,4,2));
		sorozattar.remove("teszt4");
		assertEquals(1,sorozattar.getSorozatok().size());
	}
}
