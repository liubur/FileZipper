package com.vsc.zippers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import com.vsc.filescanning.FileScanner;
import com.vsc.systemouts.SwingZinute;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;

public class FileZippingAll  implements IZipping,IZipping2{

	public void sukurkZip(File objektai, String zipkeliasirzipfailas) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	public IZipping pirmas = new IZipping() {

		public void sukurkZip(File objektai, String zipkeliasirzipfailas) throws IOException {
			FileScanner scan = new FileScanner();
			List<String> listas = scan.gautiPathSarasa(objektai);
			String kelias = objektai.toString();
			
			SwingZinute out = new SwingZinute();
			
			if (new FileZipping().arFolderTuscias(listas)) {
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
					System.out.println(e);
				}
				out.zinutesLangas("Zip failas sukurtas", "ZIP");
			}
			
		}
		
	};
	
	public IZipping2 antras = new IZipping2() {

		public void sukurkZip(File objektai, String kelias) {

			String kelias1 = kelias + "v2.zip";
			try {

				ZipFile zipFile = new ZipFile(kelias1);
				// zipFile.createZipFile(objektai, new ZipParameters());
				zipFile.createZipFileFromFolder(objektai, new ZipParameters(), false, 0);

			} catch (ZipException e) {
				e.printStackTrace();
			}
		}
		
	};
	
	
	// Metodas deleguotas pirmam zipinimo metodui
    public void sukurkpirmas(File objektai, String kelias) throws IOException {
        this.pirmas.sukurkZip(objektai, kelias);
    }

    // Metodas deleguotas antram zipinimo metodui
    public void sukurkantras(File objektai, String kelias) throws IOException {
        this.antras.sukurkZip(objektai, kelias);
    }
	

}
