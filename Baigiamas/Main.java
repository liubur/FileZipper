package Darbas2;

import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException {

		//String kelias = JOptionPane.showInputDialog("Folder:");
		//String zipkelias = JOptionPane.showInputDialog("Output folder:");

		String kelias = "C:\\1";
		String zipkelias = "C:\\2";

		FileScanner scan1 = new FileScanner();

		FileZipping zip = new FileZipping();
		zip.createZip2(scan1.getPathList(kelias), kelias, scan1.zipKelioParuosimas(zipkelias));
	}

}
