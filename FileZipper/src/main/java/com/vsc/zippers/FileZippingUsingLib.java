package com.vsc.zippers;

import java.io.File;
import com.vsc.systemouts.SwingZinute;
import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;

public class FileZippingUsingLib extends FileZippingAll implements IZipping{

	public void sukurkZip(File objektai, String kelias, int implementacija) {
		
		SwingZinute out = new SwingZinute();
		String kelias1 = kelias+"v2.zip";
		try {

			ZipFile zipFile = new ZipFile(kelias1);
			// zipFile.createZipFile(objektai, new ZipParameters());
			zipFile.createZipFileFromFolder(objektai, new ZipParameters(), false, 0);

		} catch (ZipException e) {
			//e.printStackTrace();
			out.zinutesErrorZipLangas(e, "Klaida");
		}
		out.zinutesLangas("Zip failas sukurtas", "ZIP");
	}
}
