package ProblemSet.GeeksForGeeks;

public class Strings {
    public static void main(String[] args) {
        System.out.println(isPalindrome("AbbbbbbbbbbbbbbbA"));
        System.out.println(isPalindromeTP("abbooobb"));
    }
    public static void printWords(String s){
        String[] words = s.split(" ");
        for(String word : words){
            if (word.length()%2==0)
                System.out.println(word);
        }
    }
    //using subString method
    public static String insertString(String originalString, String stringToBeInserted, int index) {
        return originalString.substring(0, index) + " " + stringToBeInserted + originalString.substring(index);
    }
    //using StringBuffer.insert method
    public static String insertStringBuffer(String originalString, String stringToBeInserted, int index) {
        StringBuffer sb = new StringBuffer(originalString);
        sb.insert(index + 1, stringToBeInserted);
        return sb.toString();
    }
    //Regular checking whether a string is a Palindrome
    public static boolean isPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }
    //Two pointer technique
    public static boolean isPalindromeTP(String str){
        int j = str.length()-1;
        int i = 0;
        while (i<j){
            if (str.charAt(i) != str.charAt(j))
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
