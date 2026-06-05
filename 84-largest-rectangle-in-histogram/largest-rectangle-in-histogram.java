class Solution {
    private int[] nse(int[]arr){
        int[] nser = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = arr.length -1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            nser[i] = st.isEmpty()?arr.length:st.peek();
            st.push(i);
        }
    return nser;
    }
    private int[] pse(int[]arr){
        int[] pser = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i= 0 ; i < arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            pser[i] = st.isEmpty()?-1:st.peek();
            st.push(i);
        }
    return pser;
    }
    public int largestRectangleArea(int[] heights) {
        int[] nse = nse(heights);
        int[] pse = pse(heights);
        int sum = 0;
        for(int i = 0;i<heights.length;i++){
            sum = Math.max(sum, heights[i] * (nse[i] - pse[i] - 1));
        }
        return sum;
    }
}