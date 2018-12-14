package com.vsc.systemouts;

import java.io.IOException;
import javax.swing.JOptionPane;
import net.lingala.zip4j.exception.ZipException;

public class SwingZinute implements SystemOutputs{

		public void zinutesLangas(String zinute, String pavadinimas) {
			JOptionPane.showMessageDialog(null, zinute, pavadinimas, JOptionPane.INFORMATION_MESSAGE);
		}

		public void zinutesErrorLangas(IOException zinute, String pavadinimas) {
			JOptionPane.showMessageDialog(null, zinute.getMessage().toString(), pavadinimas, JOptionPane.ERROR_MESSAGE);
		}
		
		public void zinutesErrorZipLangas(ZipException zinute, String pavadinimas) {
			JOptionPane.showMessageDialog(null, zinute.getMessage().toString(), pavadinimas, JOptionPane.ERROR_MESSAGE);
		}
}
