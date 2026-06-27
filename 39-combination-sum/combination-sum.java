class Solution {

    private void fun(int[] candidates, int target,int index,List<Integer> list,List<List<Integer>> ans){
        if(index == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[index]<=target){
        list.add(candidates[index]);
        fun(candidates,target - candidates[index],index,list,ans);
        list.remove(list.size()-1);
        }
        fun(candidates,target,index+1,list,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        fun(candidates,target,0,list,ans);
        return ans;
    }
}