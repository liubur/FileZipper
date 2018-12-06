package Darbas2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileScanner {

	// failu ir folderiu saraso talpykla
	String[] objects = new String[10];
	// pabandyti su ArrayList
	List<String> failai = new ArrayList<String>();
	List<String> folderiai = new ArrayList<String>();

	// pradiniu failu kelio paruosimas
	public String kelioparuosimas(String kelias) {
		if (kelias.substring(kelias.length() - 1).equals("\\")) {
		} else
			kelias = kelias + "\\";
		return kelias;
	}

	// zip kelio paruosimas
	public String zipkelioparuosimas(String zipkelias) {
		if (zipkelias.substring(zipkelias.length() - 1).equals("\\")) {
		} else
			zipkelias = zipkelias + "\\";
		return zipkelias;
	}

	// grazina failu saraso masyva
	public List<String> failusarasas(String kelias) {

		File file = new File(kelias);
		objects = file.list();
		Failas f = new Failas();

		for (int i = 0; i < objects.length; i++) {
			if (f.isArFailas(kelias + objects[i])) {
				failai.add(objects[i]);
			}
		}
		return failai;
	}

	// grazina failu saraso lista
	public List<String> folderiusarasas(String kelias) {

		File file = new File(kelias);
		objects = file.list();
		Folderis f = new Folderis();

		for (int i = 0; i < objects.length; i++) {
			if (f.isArFolderis(kelias + objects[i])) {
				folderiai.add(objects[i]);
			}
		}
		return folderiai;
	}
}
