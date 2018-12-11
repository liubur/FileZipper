package Baigiamas1;

import java.io.File;
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
		
		//Implementacija Nr.1
		FileZipping zip = new FileZipping();
		zip.sukurkZip(scan.gautiPathSarasa(kelias), kelias, scan.zipKelioParuosimas(zipkelias), zipPavadinimas);

		//Implementacija Nr.2
		File file1 = new File(kelias);
		FileZippingUsingLib zip1 = new FileZippingUsingLib();
		zip1.sukurkZipUsingLib(file1, scan.zipKelioParuosimas(zipkelias)+zipPavadinimas+"v2.zip");

	}

}
