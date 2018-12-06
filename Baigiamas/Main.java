package Darbas2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		 String kelias = JOptionPane.showInputDialog("Folder:");
		 String zipkelias = JOptionPane.showInputDialog("Output folder:");

		//String kelias = "C:\\Users\\Akvile\\Desktop\\1";
		//String zipkelias = "C:\\Users\\Akvile\\Desktop\\2";

		FileScanner scan1 = new FileScanner();

		// System.out.println("Files and folders from"+ kelias);
		// System.out.println("Output kelias "+ zipkelias);

		FileZipping zip = new FileZipping();
		zip.createZip(scan1.kelioparuosimas(kelias), scan1.zipkelioparuosimas(zipkelias));
	}

}
