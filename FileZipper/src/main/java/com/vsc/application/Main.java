package com.vsc.application;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import com.vsc.filescanning.Failas;
import com.vsc.filescanning.FileScanner;
import com.vsc.systemouts.SwingZinute;
import com.vsc.zippers.FileZippingAll;


public class Main {

	public static void main(String[] args) throws IOException {
		
		String kelias = JOptionPane.showInputDialog("Folder:");
		String zipkelias = "C:\\2";
		
		if (kelias == null || kelias.isEmpty()) {
			SwingZinute out = new SwingZinute();
			out.zinutesLangas("Programa nutraukta", "Zip");
		} else {

		File file = new File(kelias);
		Failas f = new Failas();
		String zipPavadinimas = f.pavadinimasZipFailui(kelias);

		FileScanner scan = new FileScanner();
		
		FileZippingAll zip2 = new FileZippingAll();
		zip2.sukurkpirmas(file, scan.zipKelioParuosimas(zipkelias) + zipPavadinimas);
		zip2.sukurkantras(file, scan.zipKelioParuosimas(zipkelias) + zipPavadinimas);
		}
		
	}
	
}

