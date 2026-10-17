class Solution {
    int findMax(int[] piles){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        return max;
    }
     
    int hours(int[] piles,int d){
        int n=piles.length;
        int hours=0;
        for(int i=0;i<n;i++){
            hours+=Math.ceil((double)piles[i]/(double)d);
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=findMax(piles);
        while(low<=high){
            int mid=(low+high)/2;
            int totalHours=hours(piles,mid);
            if(totalHours<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}