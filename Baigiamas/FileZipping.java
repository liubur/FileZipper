package Darbas2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileZipping {

	List<String> failai = new ArrayList<String>();
	List<String> folderiai = new ArrayList<String>();

	public void createZip(String kelias, String zipkelias) {

		FileScanner scan1 = new FileScanner();
		failai = scan1.failusarasas(scan1.kelioparuosimas(kelias));
		folderiai = scan1.folderiusarasas(scan1.kelioparuosimas(kelias));

		if (failai.size() == 0 && folderiai.size() == 0) {
			System.out.println("Nera ko kelti i zip");
		} else {
			try {
				FileOutputStream outputfile = new FileOutputStream(zipkelias + "zipfile.zip");
				ZipOutputStream outputzip = new ZipOutputStream(outputfile);

				// paduodamas failu sarasas kelimui i zip archyva
				for (String failas : failai) {
					// keliamas failas is saraso i zip faila
					ZipEntry zip = new ZipEntry(failas);
					System.out.println("Failas \"" + failas + "\" pridetas");
					outputzip.putNextEntry(zip);

				}
				for (String folderis : folderiai) {
					// keliamas folderis is saraso i zip faila
					ZipEntry zip = new ZipEntry(folderis);
					System.out.println("Folderis \"" + folderis + "\" pridetas");
					outputzip.putNextEntry(zip);
				}
				outputzip.close();
			} catch (IOException e) {
				System.out.println(e);
			}
			System.out.println("------------");
			System.out.println("Zip failas sukurtas");
		}
	}
}
