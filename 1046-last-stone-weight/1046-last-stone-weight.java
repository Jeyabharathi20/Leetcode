class Solution {
    public int lastStoneWeight(int[] stones) {
         int n=stones.length;
        while(n>1){
        Arrays.sort(stones);
        int x=stones[n-2];
        int y=stones[n-1];
        int difference=y-x;
        if(difference>0){
           stones[n-2]=difference;
           n--;
        }
        else{
            n-=2;
        }

        }
        if(n==0) return 0;
        else return stones[0];
    }
}