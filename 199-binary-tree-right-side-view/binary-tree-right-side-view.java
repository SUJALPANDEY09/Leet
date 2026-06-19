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
    List<Integer> ans = new ArrayList<>();
    private void func(TreeNode root , int level){
            if(root == null) return ;
            if(level == ans.size()) ans.add(root.val);
            func(root.right,level+1);
            func(root.left,level+1);
        }
    public List<Integer> rightSideView(TreeNode root) {
        
        int level = 0;
        func(root,level);
        
        return ans;
    }
}