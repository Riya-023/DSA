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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> wrapper = new ArrayList<>();

        if( root == null) return wrapper; //base case

        q.offer(root);

        while(!q.isEmpty()){
            int levelSize = q.size();
            List<Integer> list = new ArrayList<>();

            for(int i=0; i< levelSize; i++){
                TreeNode curr = q.poll();
                list.add(curr.val);
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
           
            wrapper.add(list);
        }
        return wrapper;
    }
}