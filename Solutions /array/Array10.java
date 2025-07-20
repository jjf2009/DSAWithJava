public class Array10 {
    public static boolean main(Boolean[] args) {
    String sentence = "thequickbrownfoxjumpsoverthelazydog";

     if (sentence.length() < 26)
      return false; // early exit

    boolean[] seen = new boolean[26];

        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }

        // Check if all 26 letters were seen
        for (boolean b : seen) {
            if (!b) return false;
        }

    }

}
