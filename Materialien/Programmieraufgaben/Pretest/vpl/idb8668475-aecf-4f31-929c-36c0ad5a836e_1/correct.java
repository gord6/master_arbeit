public class Main {
    
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String sentence = scan.nextLine();
        
        System.out.println(findShort(sentence));
    }
    
    public static int findShort(String sentence) {
        String[] words = sentence.split(" ");
        int shortestLength = words[0].length();
        int wordsCount = words.length;
        
        for(int i = 1; i < wordsCount; i++){
          if(shortestLength > words[i].length())
            shortestLength = words[i].length();
        }
        return shortestLength;
    }
}