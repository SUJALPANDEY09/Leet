class Solution {
    private void help(int index , int[] nums,List<Integer>list, List<List<Integer>> ans){
        if(index == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        help(index+1,nums,list,ans);
        list.remove(list.size() -1);
        help(index+1,nums,list,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        help(0,nums,list,ans);
        return ans;
    }
}