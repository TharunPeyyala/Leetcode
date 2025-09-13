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
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter=0;
        HashMap<TreeNode,Integer> hm=new HashMap<>();
        Stack<TreeNode> st=new Stack<>();
        if(root!=null){
            st.push(root);
        }
        while(!st.isEmpty()){
            TreeNode node=st.peek();
            if(node.left!=null && !hm.containsKey(node.left)){
                st.push(node.left);
            }else if(node.right!=null && !hm.containsKey(node.right)){
                st.push(node.right);
            }else{
                st.pop();
                int leftDepth=hm.getOrDefault(node.left,0);
                int rightDepth=hm.getOrDefault(node.right,0);
                hm.put(node,1+Math.max(leftDepth,rightDepth));
                diameter=Math.max(diameter,leftDepth+rightDepth);

            }

        }
        return diameter;
    }
}