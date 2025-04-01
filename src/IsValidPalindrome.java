public class IsValidPalindrome {
    public boolean isPalindrome(String s) {
        String cleanedUp = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(cleanedUp.isEmpty()){
            return true;
        }
        int left =0;
        int right = cleanedUp.length()-1;
        char [] letters = cleanedUp.toCharArray();
        while(left < right){
            if(letters[left] != letters[right]){
                return false;
            }
            left++;
            right --;
        }
        return true;
    }
}
