package Stepik._2_BasicSyntaxis;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam,I'mAdam!"));

    }

    public static boolean isPalindrome(String text) {

        StringBuilder sb = new StringBuilder(text.replaceAll("[^a-zA-Z0-9]", ""));

        return sb.toString().equalsIgnoreCase(sb.reverse().toString());
    }
}

