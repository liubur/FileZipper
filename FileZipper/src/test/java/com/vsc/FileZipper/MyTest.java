package com.vsc.FileZipper;

import static org.junit.Assert.assertTrue;
import java.io.File;
import org.junit.Test;

public class MyTest {
	
	@Test
	public void successFileCreate() {

		File file = new File("C:\\2\\1.zip");
		assertTrue(file.exists());

	}
	
	@Test
	public void successFileList() {
		//TODO
	}
}
