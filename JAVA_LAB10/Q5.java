public class Q5 {
    
    public static String stringToAscii(String input) {
        StringBuilder asciiCode = new StringBuilder();
        
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int ascii = (int) c;
            asciiCode.append(ascii).append(" ");
        }
        
        return asciiCode.toString();
    }
    
    public static void main(String[] args) {
        String input = "yams";
        String asciiCode = stringToAscii(input);
        System.out.println(asciiCode); 
    }
}
