public class ZeroArrayTransForm {

    public boolean isZeroArray(int[] nums, int[][] queries) {
        for( int[] query : queries){
            int start = query[0];
            int end = query[1];
            for(int i=start; i<end; i++){
                int num = nums[i];
                nums[i] = Math.max(num - 1, 0);
            }
        }
        for(int num : nums){
            if(num !=0){
                return false;
            }
        }
        return true;
    }

    //chatgpt speed up
    public boolean isZeroArraySpeedUp(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];

        // Apply each query using a difference array
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            diff[start] -= 1;
            if (end + 1 < n) {
                diff[end + 1] += 1;
            }
        }

        // Apply the prefix sum to get final decrements
        int dec = 0;
        for (int i = 0; i < n; i++) {
            dec += diff[i];
            nums[i] += dec;  // Since diff is storing -1 for decrement
            if (nums[i] > 0) return false;
        }

        return true;
    }
}
