package Darbas2;

import java.io.File;

public class Folderis {

	private boolean arFolderis = false;

	public boolean isArFolderis(String str) {
		File check = new File(str);
		if (check.isDirectory()) {
			arFolderis = true;
		} else
			arFolderis = false;
		return arFolderis;
	}

	public void setArFolderis(boolean arFolderis) {
		this.arFolderis = arFolderis;
	}

}
