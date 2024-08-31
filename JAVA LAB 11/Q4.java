import java.io.*;

public class Q4 {
    public static void main(String[] args) {
        String sourceFilePath = "source.txt";
        String destFilePath = "destination.txt";

        try (Reader reader = new FileReader(sourceFilePath);
             Writer writer = new FileWriter(destFilePath)) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
