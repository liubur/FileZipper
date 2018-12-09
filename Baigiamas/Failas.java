package Darbas2;

import java.io.File;

public class Failas {

	private boolean arFailas = false;

	public boolean isArFailas(String str) {
		File check = new File(str);
		if (check.isFile()) {
			arFailas = true;
		} else
			arFailas = false;
		return arFailas;
	}

	public String pavadinimasZipFailui(String kelias) {
		String zipPavadinimas = null;
		String zipPavadinimas1 = null;
		if (kelias.charAt(kelias.length() - 1) == '\\') {
			zipPavadinimas1 = kelias.substring(0, kelias.length() - 1);
			zipPavadinimas = zipPavadinimas1.substring(zipPavadinimas1.lastIndexOf('\\') + 1);
		} else zipPavadinimas = kelias.substring(kelias.lastIndexOf('\\') + 1);
		return zipPavadinimas;
	}
}
