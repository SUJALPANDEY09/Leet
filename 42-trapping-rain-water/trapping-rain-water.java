class Solution {
    private int[] prefix(int[]arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0]; 
            for(int i = 1;i<arr.length;i++){
                prefix[i] =Math.max(arr[i],prefix[i-1]);
            }
            return prefix;
        }
        private int[] suffix(int[]arr){
        int[] suffix = new int[arr.length];
        suffix[arr.length-1] = arr[arr.length-1]; 
            for(int i = arr.length-2;i>=0;i--){
                suffix[i] =Math.max(arr[i],suffix[i+1]);
            }
            return suffix;
        }
    public int trap(int[] height) {
        int[] suffix = suffix(height);
        int[] prefix = prefix(height);
        long sum = 0;
        for(int i = 0;i<height.length;i++){
            if(height[i]<suffix[i] && height[i]<prefix[i]){
                sum = sum + Math.min(suffix[i],prefix[i]) - height[i];
            }
        }
        return (int)sum;
    }
}