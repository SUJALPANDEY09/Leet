import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;

        char[] sorts = s.toCharArray();
        Arrays.sort(sorts);
        String sorteds = new String(sorts);

        char[] sortt = t.toCharArray();
        Arrays.sort(sortt);
        String sortedt = new String(sortt);

        for(int i = 0;i<s.length();i++){
            if(sorteds.charAt(i) == sortedt.charAt(i)) continue;
            else{return false;}
        }
        return true;
    }
}