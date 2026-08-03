// Last updated: 03/08/2026, 21:09:44
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int n=numbers.length;
        int r=n-1;

        while(l<r) {
            if((numbers[l]+numbers[r])==target) return new int[]{l+1,r+1};
            else if((numbers[l]+numbers[r])>target) r=r-1;
            else if((numbers[l]+numbers[r])<target) l=l+1;
        }
        return new int[]{-1,-1} ; 
        
    }
}