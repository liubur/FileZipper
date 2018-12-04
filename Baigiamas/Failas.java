package Darbas;

import java.io.File;

public class Failas {
	
	private String fileName = "";
	private String dateCreated = "";
	private boolean arFailas = false;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public boolean isArFailas(String str) {
		File check = new File(str);
		System.out.print("checking " + check);
		if (check.isFile())
			arFailas = true;
		else
			arFailas = false;
		
		return arFailas;
	}
	public void setArFailas(boolean arFailas) {
		this.arFailas = arFailas;
	}
	


}
