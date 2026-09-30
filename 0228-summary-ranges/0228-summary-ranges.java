class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        if(nums.length == 0){
            return answer;
       }

        int start=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i]+1){
                if(start==i){
                    answer.add(""+nums[start]);
                }
                else {
                answer.add(nums[start]+"->"+nums[i]);
                }
                start=i+1;
            }
        }
        if(start==nums.length-1){
            answer.add(""+nums[start]);
        }
        else{
            answer.add(nums[start]+"->"+nums[nums.length-1]);
        }
        return answer;
    }
}