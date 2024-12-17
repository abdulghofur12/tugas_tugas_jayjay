import java.util.Arrays;
public class Anagram{
    public static boolean AreAnagram(String strA, String strB) {
        strA = strA.toLowerCase();
        strB = strB.toLowerCase();
        if (strA.length() != strB.length()) {
            return false;
        }
        char[] charArrayA = strA.toCharArray();
        char[] charArrayB = strB.toCharArray();
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);
        return Arrays.equals(charArrayA, charArrayB);
    }

    public static void main(String[] args) {
        String stringA = "cat";
        String stringB = "tac";
        boolean result = AreAnagram(stringA, stringB);
        System.out.println("Apakah \"" + stringA + "\" dan \"" + stringB + "\" adalah anagram? " + result);
    }

}
