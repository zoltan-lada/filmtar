package FilmTar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileKezelo {

	public static void filmeketBeolvas(Filmtar filmtar) {
        try {
            File filmtxt = new File("film.txt");
            Scanner olvaso = new Scanner(filmtxt);
            while (olvaso.hasNextLine()) {
                String adat = olvaso.nextLine();
                String[] token = adat.split(";");
                if(token.length > 4) {
                	filmtar.add(new DokumentumFilm(!token[0].equals("-") ? token[0] : null,
                		!token[1].equals("-") ? Integer.valueOf(token[1]) : null,
                		!token[2].equals("-") ? Integer.valueOf(token[2]) : null,
                		!token[3].equals("-") ? Integer.valueOf(token[3]) : null,
                		!token[4].equals("-") ? token[4] : null));
                }
                filmtar.add(new Film(!token[0].equals("-") ? token[0] : null,
                		!token[1].equals("-") ? Integer.valueOf(token[1]) : null,
                		!token[2].equals("-") ? Integer.valueOf(token[2]) : null,
                		!token[3].equals("-") ? Integer.valueOf(token[3]) : null));
            }
            olvaso.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nincs megfelelo fajl");
            e.printStackTrace();
        }
    }

    public static void sorozatokatBeolvas(Sorozattar sorozattar) {
        try {
            File sorozatTxt = new File("sorozat.txt");
            Scanner olvaso = new Scanner(sorozatTxt);
            while (olvaso.hasNextLine()) {
                String adat = olvaso.nextLine();
                String[] token = adat.split(";");
                sorozattar.add(new Sorozat(!token[0].equals("-") ? token[0] : null,
                		!token[1].equals("-") ? Integer.valueOf(token[1]) : null,
                		!token[2].equals("-") ? Integer.valueOf(token[2]) : null,
                		!token[3].equals("-") ? Integer.valueOf(token[3]) : null,
                		!token[4].equals("-") ? Integer.valueOf(token[4]) : null,
                		!token[5].equals("-") ? Integer.valueOf(token[5]) : null)
                );
            }
            olvaso.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nincs megfelelo fajl");
            e.printStackTrace();
        }
    }
    
    public static void filmeketKiir(Filmtar filmtar) {
        try {
            FileWriter fw = new FileWriter("film.txt");
            for (Film film : filmtar.getFilmek()) {
                fw.write(film.toString()+"\n");
            }
            fw.close();
            System.out.println("Sikeres mentes");
        } catch (IOException e) {
            System.out.println("Hiba tortent a mentes kozben.");
            e.printStackTrace();
        }
    }

    public static void sorozatokatKiir(Sorozattar sorozattar) {
        try {
            FileWriter fw = new FileWriter("sorozat.txt");
            for (Sorozat sorozat : sorozattar.getSorozatok()) {
                fw.write(sorozat.toString()+"\n");
            }
            fw.close();
            System.out.println("Sikeres mentes");
        } catch (IOException e) {
            System.out.println("Hiba tortent a mentes kozben.");
            e.printStackTrace();
        }
    }
	
}
