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

// ----------------------------------------------------------------------
//Recursive solution
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }
    private void inorder(TreeNode root, List<Integer> res){
        if(root == null) return ;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);

    }
}
// ----------------------------------------------------------------------

//Iterative Solution
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         Stack<TreeNode> stack = new Stack<>();
//         List<Integer> res = new ArrayList<>();

//         TreeNode curr = root;

//         while(curr!=null || !stack.isEmpty()){

//             while(curr!=null){
//                 stack.push(curr);
//                 curr = curr.left;
//             }

//             // curr is null , so we backtrack
//             curr = stack.pop();
//             res.add(curr.val);
//             curr = curr.right;
//         }
//         return res;
//     }
// }