// Last updated: 17/11/2026, 12:58:08
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode node=q.poll();
                list.add(node.val);
                if(node.left!=null)
                q.add(node.left);
                if(node.right!=null)
                q.add(node.right);

            }
            if(!flag)
                Collections.reverse(list);
            
            ans.add(list);
            flag=!flag;
        }
        return ans;
    }
}