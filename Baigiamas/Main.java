package Darbas2;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException {

		String kelias = JOptionPane.showInputDialog("Folder:");
		//String zipkelias = JOptionPane.showInputDialog("Output folder:");

		//String kelias = "C:\\1";
		String zipkelias = "C:\\2";

		Failas f = new Failas();
		String zipPavadinimas = f.pavadinimasZipFailui(kelias);
		
		FileScanner scan = new FileScanner();
		
		FileZipping zip = new FileZipping();
		zip.sukurkZip(scan.gautiPathSarasa(kelias), kelias, scan.zipKelioParuosimas(zipkelias), zipPavadinimas);
	}

}
