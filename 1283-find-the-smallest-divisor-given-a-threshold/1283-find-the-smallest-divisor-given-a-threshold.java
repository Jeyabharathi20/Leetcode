class Solution {
    int sum(int[] nums,int d){
        int sum=0,n=nums.length;
        for(int i=0;i<n;i++){
            sum+=Math.ceil((double)nums[i]/d);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
      int max=nums[0];
      for(int i=0;i<nums.length;i++){
        if(nums[i]>max){
            max=nums[i];
        }
      }
     int low=0,high=max;
     while(low<=high){
        int mid=(low+high)/2;
        if(sum(nums,mid)<=threshold){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
     }
        return low;
    }
}