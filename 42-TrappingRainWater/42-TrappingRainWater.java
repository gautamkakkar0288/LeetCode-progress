// Last updated: 03/08/2026, 21:10:16
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int Lmax=0,Rmax=0,total=0,l=0;
        int r=n-1;
        while(l<r){
            if(height[l]<=height[r]) {
                if(height[l]<Lmax) total+=Lmax-height[l];
                else Lmax=height[l];
                l=l+1;
            }
            else {
            if(Rmax>height[r]) total+=Rmax-height[r];
            else Rmax=height[r];
            r=r-1;
        }
        }
        return total;
        
    }
}