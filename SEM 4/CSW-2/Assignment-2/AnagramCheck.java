import java.util.HashMap;

public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        for (char c : str1.toCharArray()) {
            if (charFrequencyMap.containsKey(c)) {
                charFrequencyMap.put(c, charFrequencyMap.get(c) + 1);
            } else {
                charFrequencyMap.put(c, 1);
            }
        }

        for (char c : str2.toCharArray()) {
            if (!charFrequencyMap.containsKey(c)) {
                return false;
            }
            charFrequencyMap.put(c, charFrequencyMap.get(c) - 1);
            if (charFrequencyMap.get(c) == 0) {
                charFrequencyMap.remove(c);
            }
        }

        return charFrequencyMap.isEmpty();
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = areAnagrams(str1, str2);

        if (isAnagram) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }
}
