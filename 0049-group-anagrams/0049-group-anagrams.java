class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String word : strs){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            while(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(word);
        }
        return new ArrayList<>(map.values());
    }
}