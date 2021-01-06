package Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIO {

	public FileIO() {
		// reference https://codescracker.com/java/java-automatically-close-files.htm

		int i;
		var filePath = "";

		/* first, confirm that a filename has been specified */
		if (filePath.length() != 1) {
			System.out.println("Usage : FileOperationDemo filename");
			return;

		}

		/*
		 * the following code uses a try-with-resources statement to open a file and
		 * then automatically close it when the try block is left.
		 */
		try (FileInputStream fin = new FileInputStream(filePath)) {

			do {
				i = fin.read();

				if (i != -1)
					System.out.print((char) i);

			} while (i != -1);

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found..!!");

		} catch (IOException e) {
			System.out.println("An I/O Error Occurred..!!");

		}
	}

}
