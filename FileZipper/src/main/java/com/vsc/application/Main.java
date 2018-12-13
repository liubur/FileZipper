package com.vsc.application;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import com.vsc.filescanning.Failas;
import com.vsc.filescanning.FileScanner;
import com.vsc.systemouts.SwingZinute;
import com.vsc.zippers.FileZipping;
import com.vsc.zippers.FileZippingUsingLib;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String kelias = JOptionPane.showInputDialog("Folder:");
		
		String zipkelias = "C:\\2";
		
		if (kelias == null || kelias.isEmpty()) {
			SwingZinute out = new SwingZinute();
			out.zinutesLangas("Programa nutraukta", "Zip");
		} else {

		Failas f = new Failas();
		String zipPavadinimas = f.pavadinimasZipFailui(kelias);

		FileScanner scan = new FileScanner();

		// Implementacija Nr.1
		FileZipping zip = new FileZipping();
		zip.sukurkZip(scan.gautiPathSarasa(kelias), kelias, scan.zipKelioParuosimas(zipkelias) + zipPavadinimas);

		// Implementacija Nr.2
		File file1 = new File(kelias);
		FileZippingUsingLib zip1 = new FileZippingUsingLib();
		zip1.sukurkZipUsingLib(file1, scan.zipKelioParuosimas(zipkelias) + zipPavadinimas);
		}
	}

}
