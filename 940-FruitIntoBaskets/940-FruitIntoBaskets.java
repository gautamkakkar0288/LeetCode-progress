// Last updated: 14/08/2026, 20:55:32
class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int ans=0;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int right=0;right<fruits.length;right++){
            mpp.put(fruits[right],mpp.getOrDefault(fruits[right],0)+1);
            while(mpp.size()>2){
                mpp.put(fruits[left],mpp.get(fruits[left])-1);
                if(mpp.get(fruits[left])==0)
                mpp.remove(fruits[left]);
                left++;
            }
            ans=Math.max(ans,right-left+1);

        }
        return ans;
        

    }
}