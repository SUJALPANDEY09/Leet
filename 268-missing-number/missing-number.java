class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int i =0;
        while(i<nums.length){
            xor = xor ^nums[i] ^i;
            i++;
        }
        xor = xor ^i;
        return xor;
    }
}