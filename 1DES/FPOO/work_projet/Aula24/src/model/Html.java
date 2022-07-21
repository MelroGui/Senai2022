package model;

import java.io.FileWriter;

public class Html {
	
		public static void save(String texto, String fileName) {
			try {
			FileWriter fw = new FileWriter(new String(fileName));
			fw.write(texto);
			fw.flush();
			fw.close();
			} catch (Exception e) {
			e.printStackTrace();
	}
}
}
