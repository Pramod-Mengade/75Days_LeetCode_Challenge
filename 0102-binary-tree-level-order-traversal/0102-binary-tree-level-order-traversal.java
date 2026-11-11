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
    ArrayList <List<Integer>> res = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        
            if (root == null) {
            return res;
        }
        q.offer(root);

        while(!q.isEmpty()){
            int size = q.size();
            ArrayList <Integer> arr = new ArrayList<>();

            while(size != 0){
                TreeNode temp = q.peek();
                if(temp.left != null) q.add(temp.left);
                
                if(temp.right != null) q.add(temp.right);
                int t = temp.val;
                arr.add(t);
                q.remove();

                size--;
            }
            res.add(arr);
        }
        return res;
        
    }
}