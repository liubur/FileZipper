package Baigiamas1;

import java.util.List;
import javax.swing.JOptionPane;

public class SystemOuts {

	public void objectPrint(List<String> objects) {
		
		for(String object : objects)
			System.out.println("objektas \"" + object + "\" pridetas");
		
		System.out.println("------------");
		System.out.println("Zip failas sukurtas");
	}
	
	public void messageBox(String zinute, String pavadinimas)
    {
		
        JOptionPane.showMessageDialog(null, zinute, pavadinimas, JOptionPane.INFORMATION_MESSAGE);
        
    }
	
}
