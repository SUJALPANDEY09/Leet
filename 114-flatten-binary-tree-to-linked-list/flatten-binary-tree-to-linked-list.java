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
    private void helper(TreeNode root,List<TreeNode> list){
        if(root == null) return;

        list.add(root);
        helper(root.left,list);
        helper(root.right,list);
    }
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        helper(root,list);
        if(root != null){
        TreeNode mover = list.get(0);
        for(int i = 1;i<list.size();i++){
            TreeNode temp = list.get(i);
            mover.right = temp;
            mover.left = null;
            mover = temp; 
        }
        mover.right =null;
        mover.left =null;
        }
    }
}