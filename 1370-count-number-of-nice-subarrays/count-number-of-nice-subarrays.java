class Solution {
    private int atMost(int[] num,int k){
        int r = 0,l = 0,sum = 0,count =0;
        if(k<0) return 0;
        while(r<num.length){
            if(num[r]%2 == 1){
            sum++;
            }
            while(sum>k){
                if(num[l]%2 == 1){
                sum--;
                }
                l++;
            }
            count += r - l +1;
            r++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        
        return atMost(nums,k)-atMost(nums,k-1);
    }
}