package lab5_maven;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Report implements Commands {

	@Override
	public void execute(String argument) {
		File f = new File(argument);
		try {
			Desktop.getDesktop().open(f);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
