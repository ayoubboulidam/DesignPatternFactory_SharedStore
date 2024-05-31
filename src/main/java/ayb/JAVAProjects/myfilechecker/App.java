package ayb.JAVAProjects.myfilechecker;

import ayb.JAVAProjects.myfilechecker.checker.*;

public class App {
    public static void main(String[] args) {
        // Example inputs
        String filename = "example.doc";
        String directory = "/path/to/directory";
        OS os = OS.WINDOWS; // Change this to OS.LINUX to test for Linux

        // Create the appropriate factory based on OS
        OSFactory factory;
        if (os == OS.WINDOWS) {
            factory = new WindowsFactory();
        } else if (os == OS.LINUX) {
            factory = new LinuxFactory();
        } else {
            throw new UnsupportedOperationException("Unsupported OS: " + os);
        }

        // Create the file checker
        FileChecker fileChecker = factory.createFileChecker();

        // Check if the file is valid
        boolean isValid = fileChecker.isValidFile(filename, directory);

        // Print the result
        System.out.println("Is the file valid? " + isValid);
    }
}
