import java.io.*;

class CustomFileNotFoundException extends Exception {
    public CustomFileNotFoundException(String message) {
        super(message);
    }
}

class FileReadPermissionException extends Exception {
    public FileReadPermissionException(String message) {
        super(message);
    }
}
public class Q10_FileReaderApp {
    public static void readFile(String filePath) throws CustomFileNotFoundException, FileReadPermissionException {
        File file = new File(filePath);
        if (filePath == null || !file.exists()) {
            throw new CustomFileNotFoundException("Error: File not found or path is null.");
        }
        if (!file.canRead()) {
            throw new FileReadPermissionException("Error: No permission to read the file.");
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file path as a command-line argument.");
            return;
        }
        try {
            readFile(args[0]);
        } catch (CustomFileNotFoundException | FileReadPermissionException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
