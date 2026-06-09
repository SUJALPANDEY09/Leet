class Solution {
    public String minWindow(String s, String t) {
        int count = 0, mini =Integer.MAX_VALUE, r=0, l=0;
        int start = -1;
        Map<Character , Integer> map = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
            if(map.get(s.charAt(r))>0)count++;
            map.put(s.charAt(r),map.get(s.charAt(r)) -1);
            }
            
            while(count == t.length()){
                if(mini>r-l+1){
                mini = r-l+1;
                start = l;
                }
                if(map.containsKey(s.charAt(l))){
                    map.put(s.charAt(l),map.get(s.charAt(l))+1);
                if(map.get(s.charAt(l))>0)count--;}
                l++;
            }
            r++;
        }
        return start==-1?"":s.substring(start,start+mini);
    }
}