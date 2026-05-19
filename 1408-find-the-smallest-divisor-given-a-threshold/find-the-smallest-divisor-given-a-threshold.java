class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l =1;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i <nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int u =max;
        while(l <= u){
            int mid = (u+l)/2;
            long sum = 0;
            for(int i =0;i<nums.length;i++){
                sum = sum + (int)Math.ceil((double)nums[i]/mid);
            }
            if(sum<=threshold){
                min = mid;
                u = mid - 1;
            }
            else{
                l = mid +1;
            }
        }
        return min;
    }
}