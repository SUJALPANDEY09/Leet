class Solution {
    public int characterReplacement(String s, int k) {
        int r =0;
        int l=0,maxl=0,maxf=0;
        int[] hash = new int[26];
        Arrays.fill(hash,0);
        while(r<s.length()){
            hash[s.charAt(r) - 'A']++;
            maxf=Math.max(maxf,hash[s.charAt(r) - 'A']);
            if((r-l+1)-maxf > k){
                hash[s.charAt(l) - 'A']--;
                l++;
            }
            if((r-l+1)-maxf<=k){
                maxl = Math.max(maxl,r-l+1);
            }
            r++;
        }
        return maxl;
    }
}