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
// -------------------------------------------------------------------
// Recursive
class Solution{
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> res = new ArrayList<>();
        postorder(root, res);
        return res;
    }
    private void postorder(TreeNode root, List<Integer> res){
        if(root == null) return;
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }
}

//  -------------------------------------------------------------------
// Iterative Approach
// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         Stack<TreeNode> st1 = new Stack<>();
//         Stack<TreeNode> st2 = new Stack<>();

//         List<Integer> res = new ArrayList<>();
//         if(root == null) return res;
//         st1.push(root);

//         while(! st1.isEmpty()){
//             TreeNode curr = st1.pop();
//             st2.push(curr);

//             if(curr.left != null) st1.push(curr.left);
//             if(curr.right != null) st1.push(curr.right);

//         }

//         while(!st2.isEmpty()){
//             res.add(st2.pop().val);
//         }
//     return res;
//     }
// }