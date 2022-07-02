package strings;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s.trim().length() == 0) {
            return true;
        }
        s = s.trim().toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            while (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        System.out.println(new ValidPalindrome().isPalindrome(s1));
        System.out.println(new ValidPalindrome().isPalindrome(s2));
    }

}
