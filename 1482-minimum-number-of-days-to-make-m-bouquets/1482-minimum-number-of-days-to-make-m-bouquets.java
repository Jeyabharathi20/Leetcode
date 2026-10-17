class Solution {
    int findMin(int[] bloomDay){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<min){
                min=bloomDay[i];
            }
        }
        return min;
    }
    int findMax(int[] bloomDay){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>max){
                max=bloomDay[i];
            }
        }
        return max;
    }
    boolean possible(int[] bloomDay,int day,int m,int k){
        int count=0;
        int Bouquet=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                count++;
            }
            else{
                Bouquet+=(count/k);
                count=0;
            }
        }
            Bouquet+=(count/k);
           return Bouquet>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        
        int low=findMin(bloomDay),high=findMax(bloomDay);
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if((long)m*k>bloomDay.length)
               return -1;
        return low;
    }
}