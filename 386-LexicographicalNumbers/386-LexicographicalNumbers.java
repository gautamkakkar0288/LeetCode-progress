// Last updated: 03/08/2026, 21:09:15
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<10;i++)
        {
            solve(i,n,list);
        }
        return list;

    }
        public void solve(int i,int n,List<Integer> list)
        {
            if(i>n) return;
            list.add(i);
            for(int j=0;j<10;j++)
            {
                int num=(i*10)+j;
                if(num>n) return;
                solve(num,n,list);
            }
        }
}