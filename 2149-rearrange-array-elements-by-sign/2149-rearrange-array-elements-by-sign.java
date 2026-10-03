class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0,neg=1;
        int[] answer=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                answer[pos]=nums[i];
                pos+=2;
            }
            else{
                answer[neg]=nums[i];
                neg+=2;
            }
        }
        return answer;
    }
}