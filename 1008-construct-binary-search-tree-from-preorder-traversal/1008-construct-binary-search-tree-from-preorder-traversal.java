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
    int nodeidx;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder==null){
           return null;
        }
        nodeidx=0;
        return bsthelper(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private TreeNode bsthelper(int[] preorder,int start,int end){
      if(nodeidx==preorder.length||preorder[nodeidx]<start||preorder[nodeidx]>end){
           return null;
      }
        int val=preorder[nodeidx++];
        TreeNode node=new TreeNode(val);
        node.left=bsthelper(preorder,start,val);
        node.right=bsthelper(preorder,val,end);
        return node;
    }
}