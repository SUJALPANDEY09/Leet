class Solution {
    public int pivotIndex(int[] nums) {
        int sum =0;
        int r =0;
        int l =0;
        for(int i=0;i<nums.length;i++){
            sum+= nums[i];
        }

        for(int i=0;i<nums.length;i++){
            r = sum - l;
            l += nums[i];
            if(r == l){
                return i;
            }
        }
        return -1;
    }
}