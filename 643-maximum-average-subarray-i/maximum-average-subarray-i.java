class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Double.NEGATIVE_INFINITY;
        double avg =0;
        int window =0;
        double sum =0;
        int r =0, l = 0;
        while(r!= nums.length){
            sum += nums[r];
            window++;
            if(window > k){
                sum = sum - nums[l];
                l++;
                window--;
            }
            if(window  == k){
                 max = Math.max(sum/k,max);
            }
           
            r++;
        }
        return max;
    }
}