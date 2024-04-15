package trycatch;

import java.io.IOException;

public class WriteFile {

	public void open() {
		System.out.println("Open file");
	}

	public void write() throws IOException {
		throw new IOException();

	}

	public void close() {
		System.out.println("Save the file and close the program");
	}

}
