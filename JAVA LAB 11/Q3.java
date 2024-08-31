import java.io.*;

public class Q3 {

    public static void main(String[] args) {
        
        try {
            File inputFile = new File("input.txt");
            File outputFile = new File("output.txt");
            FileReader fr = new FileReader(inputFile);
            FileWriter fw = new FileWriter(outputFile);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line != null) {
                String[] words = line.split("\\s+");
                for(int i=0; i<words.length; i++) {
                    String word = words[i];
                    if(!word.isEmpty()) {
                        char firstChar = Character.toUpperCase(word.charAt(0));
                        String capitalizedWord = firstChar + word.substring(1);
                        words[i] = capitalizedWord;
                    }
                }
                String capitalizedLine = String.join(" ", words);
                fw.write(capitalizedLine + "\n");
                line = br.readLine();
            }
            fr.close();
            br.close();
            fw.close();
            System.out.println("Successfully capitalized words in input.txt and wrote to output.txt");
        } catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
