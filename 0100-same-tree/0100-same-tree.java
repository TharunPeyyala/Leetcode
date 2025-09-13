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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> t1=new LinkedList<>();
        
        t1.add(p);
        t1.add(q);
        while(!t1.isEmpty()){
        TreeNode first=t1.poll();
        TreeNode second=t1.poll();
        if(first==null && second==null){
            continue;
        }else if(first==null || second==null || first.val!=second.val){
            return false;
        }
        t1.add(first.left);
        t1.add(second.left);
        t1.add(first.right);
        t1.add(second.right);
        }
        return true;

    }
}