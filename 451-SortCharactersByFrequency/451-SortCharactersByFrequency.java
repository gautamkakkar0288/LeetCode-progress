// Last updated: 17/11/2026, 12:57:33
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }

        List<Character>[] bucket=new ArrayList[s.length()+1];
        for(char ch:mpp.keySet()){
        int freq=mpp.get(ch);
        if(bucket[freq]==null){
           bucket[freq]=new ArrayList<>();


        }
        bucket[freq].add(ch);
        }

        StringBuilder ans=new StringBuilder();

        for(int freq=s.length();freq>=1;freq--){
            if(bucket[freq]!=null){
                for(char ch:bucket[freq]){
                    for(int i=0;i<freq;i++){
                    ans.append(ch);
                    }
                }
            }
        }
        return ans.toString();
    }
}