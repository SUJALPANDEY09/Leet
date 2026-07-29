class Solution {
    public int findGCD(int[] nums) {
        int min =nums[0];
        int max =0;
        for(int i =0;i<nums.length;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        int gcd =1;
        while(min != 0){
            int rem = max%min;
            max = min;
            min = rem;
        }
        return max;
    }
}