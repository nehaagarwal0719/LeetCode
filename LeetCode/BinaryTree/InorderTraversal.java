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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        
        if(root!=null){
           l.addAll(inorderTraversal(root.left));
            l.add(root.val);
           l.addAll(inorderTraversal(root.right));
           
        }
        
        return l;
    }
}
