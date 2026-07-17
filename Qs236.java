// 236. Lowest Common Ancestor of a Binary Tree

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();

        getPath(root, p, path1);
        getPath(root, q, path2);
        int i =0;
        while(i<path1.size() && i< path2.size() && path1.get(i) == path2.get(i)){
            
            i++;
        }

        TreeNode lca = path1.get(i-1);
        return lca;
    }
    public static boolean getPath(TreeNode root, TreeNode target, List<TreeNode> path ){
        if (root == null) {
            return false;
        }
        path.add(root);

        if(root == target){
            return true;
        }

        if(getPath(root.left,target,path) || getPath(root.right,target,path)){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
}