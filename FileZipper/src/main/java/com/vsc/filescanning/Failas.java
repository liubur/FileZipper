package com.vsc.filescanning;

import java.io.File;

public class Failas {

	public boolean isArFailas(String str) {
		boolean arFailas = false;
		File check = new File(str);
		if (check.isFile()) {
			arFailas = true;
		} else
			arFailas = false;
		return arFailas;
	}

	//paima pradinio folderio pavadinima ir grazina ji zipFailo pavadinimui
	public String pavadinimasZipFailui(String kelias) {
		String zipPavadinimas = null;
		String zipPavadinimas1 = null;
		if (kelias.charAt(kelias.length() - 1) == '\\') {
			zipPavadinimas1 = kelias.substring(0, kelias.length() - 1);
			zipPavadinimas = zipPavadinimas1.substring(zipPavadinimas1.lastIndexOf('\\') + 1);
		} else
			zipPavadinimas = kelias.substring(kelias.lastIndexOf('\\') + 1);
		return zipPavadinimas;
	}
}
