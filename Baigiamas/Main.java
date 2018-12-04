package Darbas;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String kelias = JOptionPane.showInputDialog("Folder:");
		String zipkelias = JOptionPane.showInputDialog("Output folder:");

		//reikalingas metodui isArFailas isskirti tik failus (be folderiu)
		if(kelias.substring(kelias.length() - 1).equals("\\")){
		}else kelias = kelias + "\\";

		
		FileScanner scan1 = new FileScanner();
		
		//paruosiamas failu sarao masyvas
		String[] failai = scan1.failusarasas(kelias);
		System.out.println("-----------------");
		System.out.println("File and folder list in folder "+ kelias);
		System.out.println("Output kelias "+ zipkelias);

		

	}

}
