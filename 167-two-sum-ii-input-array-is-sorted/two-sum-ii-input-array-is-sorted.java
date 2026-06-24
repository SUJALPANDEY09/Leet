class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] ans = new int[2];
        int i =0;
        int j = numbers.length -1;
        while(i<j){
            if(target == numbers[i]+numbers[j]){
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            };
            if(target>numbers[i]+numbers[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}