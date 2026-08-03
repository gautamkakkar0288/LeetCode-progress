// Last updated: 03/08/2026, 21:10:01
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> current=new ArrayList<>();
        generatesubsets(0,nums,current,result);
        return result;
        
    }
    private void generatesubsets(int i,int[] nums,List<Integer> current, List<List<Integer>> result)
    {
        if(i==nums.length)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        generatesubsets(i+1,nums,current,result);

        current.remove(current.size()-1);

        generatesubsets(i+1,nums,current,result);
    }
}