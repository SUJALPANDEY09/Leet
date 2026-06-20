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
class pair{
    TreeNode node;
    int num;
    pair(TreeNode node,int num){
        this.node = node;
        this.num = num;
    }
} 
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int ans =0;
        Queue<pair> q = new LinkedList<>();
        q.offer(new pair(root,0));

        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().num;
            int first =0,last =0;

            for(int i =0;i<size;i++){
                int cur = q.peek().num-min;
                TreeNode node1 =q.peek().node;
                q.poll();
                if(i==0)first = cur;
                if(i==size-1)last = cur;

                if(node1.left!=null)q.offer(new pair(node1.left,(cur*2)+1));
                if(node1.right!=null)q.offer(new pair(node1.right,(cur*2)+2));
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
}