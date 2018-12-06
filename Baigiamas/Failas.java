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

	public void setArFailas(boolean arFailas) {
		this.arFailas = arFailas;
	}

}
