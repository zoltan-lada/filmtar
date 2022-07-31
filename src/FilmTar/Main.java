package FilmTar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Filmtar filmtar = new Filmtar();
        Sorozattar sorozattar = new Sorozattar();
        Boolean kellolvasni = true;

        FileKezelo.filmeketBeolvas(filmtar);
        FileKezelo.sorozatokatBeolvas(sorozattar);
        konzolraKiir(sorozattar,filmtar);
        Scanner sc = new Scanner(System.in);
        while (kellolvasni) {
            System.out.print("add film/sorozat cim hossz kiadev korhatar:\n"
            		+ "remove film/sorozat kivant cim:\n"
            		+ "search film/sorozat cim/kiadev/korhatar kivant szoveg:\n"
            		+ "extend film/sorozat cim hossz/kiadev/korhatar/resz/evad:\n"  +
            		"Adjon meg egy parancsot: ");
            DokumentumFilm doksi = new DokumentumFilm("doksi",1,2,3,"leiras");
            System.out.println(doksi);
            String sor = sc.nextLine();
            String[] s = sor.split(" ");
            if (s[0].equals("add") && s[1].equals("film")) {
            	if(s.length > 6) {
            		filmtar.add(new DokumentumFilm(!s[2].equals("-") ? s[2] : null,
            			!s[3].equals("-") ? Integer.valueOf(s[3]) : null,
            			!s[4].equals("-") ? Integer.valueOf(s[4]) : null,
            			!s[5].equals("-") ? Integer.valueOf(s[5]) : null,
            			!s[6].equals("-") ? s[6] : null));
            	}else {
            		filmtar.add(new Film(!s[2].equals("-") ? s[2] : null,
                		!s[3].equals("-") ? Integer.valueOf(s[3]) : null,
                		!s[4].equals("-") ? Integer.valueOf(s[4]) : null,
                		!s[5].equals("-") ? Integer.valueOf(s[5]) : null));
            	}
            } else if (s[0].equals("add") && s[1].equals("sorozat")) {
                sorozattar.add(new Sorozat(!s[2].equals("-") ? s[2] : null,
                		!s[3].equals("-") ? Integer.valueOf(s[3]) : null,
                		!s[4].equals("-") ? Integer.valueOf(s[4]) : null,
                		!s[5].equals("-") ? Integer.valueOf(s[5]) : null,
                		!s[6].equals("-") ? Integer.valueOf(s[6]) : null,
                		!s[7].equals("-") ? Integer.valueOf(s[7]) : null));
            } else if (s[0].equals("remove") && s[1].equals("film")) {
                filmtar.remove(s[2]);
            } else if (s[0].equals("remove") && s[1].equals("sorozat")) {
                sorozattar.remove(s[2]);
            } else if (s[0].equals("search") && s[1].equals("film") ) {
            	filmtar.filmListazo(filmtar.search(s[2], s[3]));
                System.out.println();
            } else if (s[0].equals("search") && s[1].equals("sorozat") ) {
            	sorozattar.sorozatListazo(sorozattar.search(s[2], s[3]));
            } else if(s[0].equals("extend") && s[1].equals("film")) {
            	filmtar.extend(s[2], s[3], s[4]);
            } else if(s[0].equals("extend") && s[1].equals("sorozat")) {
            	sorozattar.extend(s[2], s[3], s[4]);
            } else if (s[0].equals("q")) {
                FileKezelo.filmeketKiir(filmtar);
                FileKezelo.sorozatokatKiir(sorozattar);
                kellolvasni = false;
            }

        }
        sc.close();
    }

    public static void konzolraKiir(Sorozattar sorozattar, Filmtar filmtar){
        for(Film film : filmtar.getFilmek()){
            System.out.println(film);
        }
        for(Sorozat sorozat : sorozattar.getSorozatok()){
            System.out.println(sorozat);
        }
    }
}
