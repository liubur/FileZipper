package com.vsc.FileZipper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import org.junit.Test;
import com.vsc.filescanning.Failas;
import com.vsc.filescanning.FileScanner;
import com.vsc.zippers.FileZipping;
import com.vsc.zippers.FileZippingAll;
import com.vsc.zippers.IZipping;

public class MyTest {
	
	@Test
	public void successFileCreate() throws IOException {
		
		String kelias = "C:\\1";
		String zipkelias = "C:\\2";

		File file = new File(kelias);
		Failas f = new Failas();
		String zipPavadinimas = f.pavadinimasZipFailui(kelias);

		FileScanner scan = new FileScanner();
		//FileZippingAll zip2 = new FileZippingAll();
		IZipping zip2 = new FileZipping();
		zip2.sukurkZip(file, scan.zipKelioParuosimas(zipkelias) + zipPavadinimas, 0);
		
		//Resultato failas
		File result = new File("C:\\2\\1.zip");
		assertTrue(result.exists());

	}
	
	@Test
	public void checkFileName() {
		String kelias = "C:\\1";
		//Rezultatas kurio tikimasi
		String zipPavadinimoResultatas = "1";
		
		Failas f = new Failas();
		String zipPavadinimas = f.pavadinimasZipFailui(kelias);
		
		assertEquals(zipPavadinimoResultatas, zipPavadinimas);
	}
}
