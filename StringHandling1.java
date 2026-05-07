public class Main {
    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        String result = "";

        // Check all substrings
        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);

                // Check if substring contains all characters
                if (containsAll(sub, t)) {

                    // Store smallest substring
                    if (result.equals("") || sub.length() < result.length()) {
                        result = sub;
                    }
                }
            }
        }

        System.out.println(result);
    }

    // Function to check all characters are present
    static boolean containsAll(String sub, String t) {

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (sub.indexOf(ch) == -1) {
                return false;
            }
        }

        return true;
    }
}
