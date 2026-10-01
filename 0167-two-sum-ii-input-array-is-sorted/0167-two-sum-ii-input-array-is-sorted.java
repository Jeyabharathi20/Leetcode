class Solution {
    public int[] twoSum(int[] numbers, int target) {
                Map<Integer,Integer> m=new HashMap();
        for(int i=0;i<numbers.length;i++){
            int key=target-numbers[i];
            if(m.containsKey(key)){
                return new int[]{m.get(key)+1,i+1};
            }
            else{
                m.put(numbers[i],i);
            }
        }
        return new int[]{};
    }
}