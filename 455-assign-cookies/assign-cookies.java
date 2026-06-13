class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int r = 0;
        int count = 0;
        for(int i = 0;i<s.length;i++){
            if(s[i] >= g[r]){
                count++;
                r++;
            }
            if(r == g.length)break;
        }
        return count;
    }
}