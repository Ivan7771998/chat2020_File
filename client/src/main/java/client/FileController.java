package client;

import javafx.scene.control.TextArea;
import java.io.*;
import java.util.Scanner;

public class FileController {

    private FileOutputStream outputStream;
    private Scanner scanner;

    public FileController(String file) throws FileNotFoundException {
        outputStream = new FileOutputStream(file, true);
        scanner = new Scanner(new File(file));
    }

    public void saveHistory(String message) throws IOException {
        outputStream.write((message + "\n").getBytes());
    }

    public void loadHistory(TextArea textArea) throws IOException {
        int count = 100;
        while (count >= 0 && scanner.hasNext()) {
            count--;
            textArea.appendText(scanner.nextLine() + "\n");
        }
    }
}
