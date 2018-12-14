package com.vsc.zippers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import com.vsc.filescanning.FileScanner;
import com.vsc.systemouts.SwingZinute;


public class FileZipping extends FileZippingAll implements IZipping{

	public void sukurkZip(File objektai, String zipkeliasirzipfailas, int implementacija) throws IOException {
		FileScanner scan = new FileScanner();
		List<String> listas = scan.gautiPathSarasa(objektai);
		String kelias = objektai.toString();
		
		SwingZinute out = new SwingZinute();

		if (arFolderTuscias(listas)) {
			try {
				FileOutputStream outputfile = new FileOutputStream(zipkeliasirzipfailas + ".zip");
				ZipOutputStream outputzip = new ZipOutputStream(outputfile);
				// paduodamas failu sarasas kelimui i zip archyva
				if (kelias.charAt(kelias.length() - 1) == '\\') {
					for (String objektas : listas) {
						// keliamas failas is saraso i zip faila
						ZipEntry zip = new ZipEntry(objektas.substring(kelias.length()));
						outputzip.putNextEntry(zip);
					}
				} else {
					for (String objektas : listas) {
						// keliamas failas is saraso i zip faila
						ZipEntry zip = new ZipEntry(objektas.substring(kelias.length() + 1));
						outputzip.putNextEntry(zip);
					}
				}
				outputzip.close();
			} catch (IOException e) {
				out.zinutesErrorLangas(e, "Klaida");
			}
			out.zinutesLangas("Zip failas sukurtas", "ZIP");
		}
	}

	public boolean arFolderTuscias(List<String> objektai) {
		SwingZinute out = new SwingZinute();

		if (objektai.size() == 0) {
			out.zinutesLangas("Nera ko kelti i zip", "Klaida");
			return false;
		} else
			return true;
	}

}