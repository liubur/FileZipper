package Baigiamas1;

import java.io.File;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;

public class FileZippingUsingLib {

	public void sukurkZipUsingLib(File objektai, String kelias) {

		String kelias1 = kelias+"v2.zip";
		try {

			ZipFile zipFile = new ZipFile(kelias1);
			// zipFile.createZipFile(objektai, new ZipParameters());
			zipFile.createZipFileFromFolder(objektai, new ZipParameters(), false, 0);

		} catch (ZipException e) {
			e.printStackTrace();
		}
	}
}
