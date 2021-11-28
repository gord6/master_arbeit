public class Main {
    
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int n=scan.nextInt();
        String word = scan.next();
        System.out.println(repeatString(word, n));
    }
    
    public static String repeatString(String word, int n) {
        String result = "";
        for (int i = 0; i < n - 1; i++) {
        	result += word  + ", ";
        }
        result += word;
        return result;
    }
}