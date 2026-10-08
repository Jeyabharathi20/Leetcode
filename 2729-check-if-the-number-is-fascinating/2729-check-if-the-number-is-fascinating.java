class Solution {
    public boolean isFascinating(int n) {
        int[] freq=new int[10];
        String result=""+n+2*n+3*n;
        for(int i=0;i<result.length();i++){
            int digit=result.charAt(i)-'0';
            freq[digit]++;
        }
        for(int i=1;i<=9;i++){
            if(freq[i]!=1){
                return false;
            }
        }
        return true;
    }
}