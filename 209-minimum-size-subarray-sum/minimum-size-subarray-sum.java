class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int r = 0;
        int l= 0;
        int min = Integer.MAX_VALUE;;
        int sum =0;
        while(r<nums.length){
            sum += nums[r];
            while(sum>=target){
                min = Math.min(min,((r-l) +1));
                sum -= nums[l];
                l++;
            }
            r++;
        }
        if(min == Integer.MAX_VALUE){
            min = 0;
        }
        return min;
    }
}