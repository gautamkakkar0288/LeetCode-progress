// Last updated: 03/08/2026, 21:08:27
class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        ArrayList <Integer> oddEle=new ArrayList<>();
        ArrayList <Integer> evenEle=new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            if(i%2==0)
            evenEle.add(nums[i]);
            else
            oddEle.add(nums[i]);
        }
        Collections.sort(evenEle);
        Collections.sort(oddEle,Collections.reverseOrder());
        int evenIndex=0;
        int oddIndex=0;
        int[] result=new int[n];
        for (int i=0;i<n;i++)
        {
            if(i%2==0)
            result[i]=evenEle.get(evenIndex++);
            else
            result[i]=oddEle.get(oddIndex++);
        }
        return result;
    }
}