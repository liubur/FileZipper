package FileScanning;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class FileScanner {

	List<String> failai = new ArrayList<String>();

	// pradiniu failu kelio paruosimas
	public String kelioParuosimas(String kelias) {
		if (kelias.substring(kelias.length() - 1).equals("\\")) {
		} else
			kelias = kelias + "\\";
		return kelias;
	}

	// zip kelio paruosimas
	public String zipKelioParuosimas(String zipkelias) {
		if (zipkelias.substring(zipkelias.length() - 1).equals("\\")) {
		} else
			zipkelias = zipkelias + "\\";
		return zipkelias;
	}

	public List<String> gautiPathSarasa(String dirName) throws IOException {
		File file1 = new File(dirName);
		
		Files.walkFileTree(file1.toPath(), new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
				failai.add(file.toString());
				//System.out.println(file);
				return FileVisitResult.CONTINUE;
			}
		});
		return failai;
	}

}
