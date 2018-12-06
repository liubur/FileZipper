package Darbas2;

import java.io.File;

public class Failas {

	private String fileName = "";
	private boolean arFailas = false;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

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
