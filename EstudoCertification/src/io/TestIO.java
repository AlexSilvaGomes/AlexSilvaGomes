package io;

import java.io.*;

/**
 * @author ALSGomes
 *
 */
public class TestIO {

	public void method() {

		try {
			BufferedWriter w = new BufferedWriter(new PrintWriter("texto.txt"));		
			BufferedReader r = new BufferedReader(new FileReader("text.txt"));
		} catch (IOException e) {
            
		}
	}

}
