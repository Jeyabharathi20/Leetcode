class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];

        List<List<Integer>> answer=new ArrayList<>();

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                answer.add(Arrays.asList(start,end));
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        answer.add(Arrays.asList(start, end));
        int[][] result=new int[answer.size()][2];
        for(int i=0;i<answer.size();i++){
            result[i][0]=answer.get(i).get(0);
            result[i][1]=answer.get(i).get(1);
        }
        return result;
    }
}