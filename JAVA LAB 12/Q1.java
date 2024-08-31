import java.io.FileInputStream;
import java.io.IOException;

public class Q1 {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java BinaryFileComparator <file1> <file2>");
            return;
        }

        String file1Path = args[0];
        String file2Path = args[1];

        try (FileInputStream fis1 = new FileInputStream(file1Path);
             FileInputStream fis2 = new FileInputStream(file2Path)) {

            int bytePos = 0;
            int b1, b2;

            while ((b1 = fis1.read()) != -1 && (b2 = fis2.read()) != -1) {
                if (b1 != b2) {
                    System.out.println("Files differ at byte position: " + bytePos);
                    return;
                }
                bytePos++;
            }

            if (fis1.read() != -1 || fis2.read() != -1) {
                System.out.println("Files have different lengths");
            } else {
                System.out.println("Files are identical");
            }

        } catch (IOException e) {
            System.out.println("Error comparing files: " + e.getMessage());
        }
    }
}
