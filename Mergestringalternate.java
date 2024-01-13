public class Mergestringalternate {
    public static void main(String[] args){
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
        

    }
    public static String mergeAlternately(String word1, String word2) {
            int word1length = word1.length();
            int word2length = word2.length();
    
            StringBuilder appendedStringBuilder = new StringBuilder();
    
            int length = Math.max(word1length, word2length);
            for(int i = 0; i < length; i++){
                if (i < word1length) {
                    appendedStringBuilder.append(word1.charAt(i));
                }
                if (i < word2length) {
                    appendedStringBuilder.append(word2.charAt(i));
                }
            }
            return appendedStringBuilder.toString();            
        }
    
}
