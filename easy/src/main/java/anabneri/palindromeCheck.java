package anabneri;

public class palindromeCheck {
    public static boolean isPalindrome(String str) {
        // O(n) time complexity and O(1) space complexity

        // store everything of the list in a array

        StringBuilder  reversedString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }

        return str.equals(reversedString.toString());
    }
}
