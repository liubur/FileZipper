package com.vsc.filescanning;

import java.io.File;

public class Folderis {

	public boolean isArFolderis(String str) {
		boolean arFolderis = false;
		File check = new File(str);
		if (check.isDirectory()) {
			arFolderis = true;
		} else
			arFolderis = false;
		return arFolderis;
	}
}
