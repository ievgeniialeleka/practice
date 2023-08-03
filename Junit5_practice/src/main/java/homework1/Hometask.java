package homework1;

public class Hometask {
    public int array667(int[] nums) {
        int count = 0;
        if(nums.length <= 1) return count;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)) {
                count++;
            }
        }
        return count;
    }
}
