class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0;i<s.length()-1;i++){
            int c=s.charAt(i)-'0';
            int d=s.charAt(i+1)-'0';
            if(Math.abs(c-d)>2){
                return false;
            }
        }
        return true;
    }
}