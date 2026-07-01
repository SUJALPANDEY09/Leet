class Solution {
    private void permutation(int[] nums,List<List<Integer>> ans,List<Integer> list,boolean[] arr){
        if(list.size()== arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i =0;i<arr.length;i++){
            if(!arr[i]){
                list.add(nums[i]);
                arr[i] = true;
                permutation(nums,ans,list,arr);
                list.remove(list.size()-1);
                arr[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] arr = new boolean[nums.length];
        permutation(nums,ans,list,arr);
        return ans;
    }
}