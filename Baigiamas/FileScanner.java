package Darbas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileScanner {

	//failu ir folderiu saraso talpykla
	String[] objects = new String[10];
	
	String[] files = new String[10];
	
	//grazina failu saraso masyva
	public String[] failusarasas(String kelias) {
		
		File file = new File(kelias);
		objects = file.list();
		//objects1 = file.list();
		Failas f = new Failas();
		
		int m = 0;
		for (int i = 0; i < objects.length; i++) {
			if(f.isArFailas(kelias+objects[i])) {
				files[m] = objects[i];
				m++;
				System.out.println(" - failas");
			}else System.out.println(" - Folderis");
		}
		
		System.out.println("Objects in directory:"+ objects.length);
		
		System.out.println("Only Files:");
		for (int i = 0; i < files.length; i++) {
			if (files[i] != null)
			System.out.println(files[i]);
		}	
		return objects;
	}
}
