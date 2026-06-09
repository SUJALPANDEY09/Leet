class Solution {
    private int fun(int[] nums,int k){
        int count = 0;
        int r = 0;
        int l=0;
        Map<Integer , Integer> map = new HashMap<>();

        while(r<nums.length){
            map.put(nums[r],(map.getOrDefault(nums[r],0))+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l]) == 0){
                map.remove(nums[l]);}
                l = l +1;
            }
            count += r-l+1;
            r++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        return fun(nums,k) - fun(nums,k-1);
    }
}