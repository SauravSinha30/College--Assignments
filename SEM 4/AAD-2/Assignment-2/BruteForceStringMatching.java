public class BruteForceStringMatching {
    public static void bruteForceMatch(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();
        boolean found = false;

        for (int i = 0; i <= textLength - patternLength; i++) {
            int j;
            for (j = 0; j < patternLength; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }


            if (j == patternLength) { // If full pattern matched
                System.out.println("Pattern found at index: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Pattern not found in the text.");
        }
    }
    public static void main(String[] args) {
        String text = "ABAAABCDBBABCDDEBCABC";
        String pattern = "ABC";

        System.out.println("Text: " + text);
        System.out.println("Pattern: " + pattern);

        bruteForceMatch(text, pattern);
    }

}

