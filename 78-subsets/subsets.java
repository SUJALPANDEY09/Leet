class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int subsets = (1 << nums.length)-1;
        for(int i =0 ; i<=subsets ; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j =0;j<nums.length;j++){
                if((i&(1<<j)) != 0)arr.add(nums[j]);
            }
            ans.add(arr);
        }
        return ans;
    }
}