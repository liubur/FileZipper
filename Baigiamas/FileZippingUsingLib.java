package Baigiamas1;

import java.io.File;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;

public class FileZippingUsingLib {

	public void sukurkZipUsingLib(File objektai, String kelias) {

	try {
		
		ZipFile zipFile = new ZipFile(kelias);
		//zipFile.createZipFile(objektai, new ZipParameters());
		zipFile.createZipFileFromFolder(objektai, new ZipParameters(), false, 0);
		
		} catch (ZipException e) {
        e.printStackTrace();
		}
	}
}





