import java.util.ArrayList;
import java.util.HashSet;

public class LongestSubstringWithoutRepeats {

    public int lengthOfLongestSubstring(String s) {
        char [] sCharacters = s.toCharArray();
        int longestFoundSubstring =0;
        ArrayList<Character> substring = new ArrayList<Character>();
        for(int i=0; i<sCharacters.length; i++){
            substring.add(sCharacters[i]);
            for(int j=i+1; j<sCharacters.length; j++) {
                char currentCharacter = sCharacters[j];
                if(!substring.contains(currentCharacter)){
                    substring.add(currentCharacter);
                }
                else{
                    longestFoundSubstring = Math.max(longestFoundSubstring, substring.size());
                    substring.clear();
                    substring.add(currentCharacter);
                }
            }
            longestFoundSubstring = Math.max(longestFoundSubstring, substring.size());
            substring.clear();
        }
        return longestFoundSubstring;
    }

    public int lengthOfLongestSubstringGPT(String s) {
        HashSet<Character> uniqueChars = new HashSet<>();
        int longestFoundSubstring = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            // Expand the window by moving right pointer
            while (uniqueChars.contains(s.charAt(right))) {
                // Shrink the window from the left side if we find a duplicate
                uniqueChars.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the window
            uniqueChars.add(s.charAt(right));

            // Update the longest substring length
            longestFoundSubstring = Math.max(longestFoundSubstring, right - left + 1);
        }

        return longestFoundSubstring;
    }
}
