// Last updated: 03/08/2026, 21:09:30
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null ||root ==p || root==q)
        {
            return root;

        }
        TreeNode LA=lowestCommonAncestor(root.left, p,  q);
        TreeNode RA=lowestCommonAncestor(root.right, p,q);

        if(LA!=null && RA!=null)
        return root;
        
        return (LA!=null)?LA:RA;
        
    }
}