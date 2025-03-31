import java.util.Arrays;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int previousNum = nums [0];
        int currentCount=1;

        int maxCount =0;
        int maxNumReturn =0;
        for (int i =1; i<nums.length; i++) {
            int num = nums[i];
            if (previousNum == num) {
                currentCount++;
            }
            else {
                if (currentCount > maxCount) {
                    maxNumReturn = previousNum;
                    maxCount = currentCount;
                }
                previousNum = num;
                currentCount = 1;
            }
        }
        //final max check
        if (currentCount > maxCount) {
            maxNumReturn = previousNum;
        }
        return maxNumReturn;
    }
}
