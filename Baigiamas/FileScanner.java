package Darbas2;

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

	// failu ir folderiu saraso talpykla
	String[] objects = new String[10];

	List<String> failai = new ArrayList<String>();
	List<String> folderiai = new ArrayList<String>();

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

//	// grazina failu saraso masyva
//	public List<String> failusarasas(String kelias) {
//
//		File file = new File(kelias);
//		objects = file.list();
//		Failas f = new Failas();
//
//		for (int i = 0; i < objects.length; i++) {
//			if (f.isArFailas(kelias + objects[i])) {
//				failai.add(objects[i]);
//			}
//		}
//		return failai;
//	}
//
//	// grazina failu saraso lista
//	public List<String> folderiusarasas(String kelias) {
//
//		File file = new File(kelias);
//		objects = file.list();
//		Folderis f = new Folderis();
//
//		for (int i = 0; i < objects.length; i++) {
//			if (f.isArFolderis(kelias + objects[i])) {
//				folderiai.add(objects[i]);
//			}
//		}
//		return folderiai;
//	}
	
	public List<String> getPathList(String dirName) throws IOException {
	
	File file1 = new File(dirName);	
	List<String> failai= new ArrayList<>();
		
    Files.walkFileTree(file1.toPath(), new SimpleFileVisitor<Path>() {
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            failai.add(file.toString());
            return FileVisitResult.CONTINUE;
        }
    });
    return failai;
	}
}
