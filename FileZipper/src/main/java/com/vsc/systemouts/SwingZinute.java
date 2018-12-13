package com.vsc.systemouts;

import javax.swing.JOptionPane;

public class SwingZinute implements SystemOutputs{

		public void zinutesLangas(String zinute, String pavadinimas) {
			JOptionPane.showMessageDialog(null, zinute, pavadinimas, JOptionPane.INFORMATION_MESSAGE);
		}
	};
