// Last updated: 16/11/2026, 12:49:04
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);

        }
        int multiple=k;
        while(set.contains(multiple)){
            multiple+=k;
        }
        return multiple;
        
    }
}