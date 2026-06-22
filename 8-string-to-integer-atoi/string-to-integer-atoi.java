class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        long sum = 0;
        int i =0;
        while(i<s.length() && s.charAt(i) == ' '){
            i++;
        }
       if(i<s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')){
         if(s.charAt(i) == '-')sign =-1;
         i++;
       }
       while(i<s.length() && Character.isDigit(s.charAt(i))){
        int digit = s.charAt(i) -'0';
        sum = (sum*10)+digit;

        if(sum*sign > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(sum*sign < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        i++;
       }
       return(int) (sum*sign);
    }
}