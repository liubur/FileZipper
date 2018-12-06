package Darbas2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Folderis {

	private boolean arFolderis = false;

	List<String> failai = new ArrayList<String>();

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
