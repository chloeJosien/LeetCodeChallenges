import org.testng.annotations.Test;

public class LongestSubstringWithoutRepeatsTest {

    LongestSubstringWithoutRepeats longestSubstringWithoutRepeats = new LongestSubstringWithoutRepeats();

    @Test
    public void testing(){
        int result = longestSubstringWithoutRepeats.lengthOfLongestSubstringGPT("abcabcbb");
        System.out.println(result);
    }

}