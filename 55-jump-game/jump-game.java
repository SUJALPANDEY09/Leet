class Solution {
    public boolean canJump(int[] nums) {
        int maxind = 0;
        for(int i =0 ; i<nums.length;i++){
            if(i<=maxind){
                maxind = Math.max(maxind,i+nums[i]);
                if(maxind>=nums.length-1) return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
}