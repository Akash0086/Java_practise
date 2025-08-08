package practise.Strings;

public class revvow {
    public static void main(String[] args) {
        String input = "Hello World";
        String result = reverseVowels(input);
        System.out.println("Original: " + input);
        System.out.println("Modified: " + result);
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            // Move left pointer until a vowel is found
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // Move right pointer until a vowel is found
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            // Swap vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            // Move pointers inward
            left++;
            right--;
        }

        return new String(chars);
    }
}

  

