package com.vsc.zippers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import com.vsc.systemouts.SwingZinute;


public class FileZipping {

	public void sukurkZip(List<String> objektai, String kelias, String zipkeliasirzipfailas) {

		SwingZinute out = new SwingZinute();

		if (arFolderTuscias(objektai)) {
			try {
				FileOutputStream outputfile = new FileOutputStream(zipkeliasirzipfailas + ".zip");
				ZipOutputStream outputzip = new ZipOutputStream(outputfile);
				// paduodamas failu sarasas kelimui i zip archyva
				if (kelias.charAt(kelias.length() - 1) == '\\') {
					for (String objektas : objektai) {
						// keliamas failas is saraso i zip faila
						ZipEntry zip = new ZipEntry(objektas.substring(kelias.length()));
						outputzip.putNextEntry(zip);
					}
				} else {
					for (String objektas : objektai) {
						// keliamas failas is saraso i zip faila
						ZipEntry zip = new ZipEntry(objektas.substring(kelias.length() + 1));
						outputzip.putNextEntry(zip);
					}
				}
				outputzip.close();
			} catch (IOException e) {
				System.out.println(e);
			}
			out.zinutesLangas("Zip failas sukurtas", "ZIP");
		}
	}

	private boolean arFolderTuscias(List<String> objektai) {
		SwingZinute out = new SwingZinute();

		if (objektai.size() == 0) {
			out.zinutesLangas("Nera ko kelti i zip", "Klaida");
			return false;
		} else
			return true;
	}

}