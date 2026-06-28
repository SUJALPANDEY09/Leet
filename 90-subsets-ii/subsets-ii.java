class Solution {
    private void help(int index , int[] nums,List<Integer>list, Set<List<Integer>> ans){
        if(index == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        list.add(nums[index]);
        help(index+1,nums,list,ans);
        list.remove(list.size() -1);
        help(index+1,nums,list,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        help(0,nums,list,ans);
        return (new ArrayList<>(ans));
    }
}