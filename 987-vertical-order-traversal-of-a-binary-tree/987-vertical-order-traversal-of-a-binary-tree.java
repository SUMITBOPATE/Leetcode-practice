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
    
       Map<Integer, PriorityQueue<int[]>> dist;
    
    Solution() {
        dist = new  TreeMap<>();
    }
    
    private void storeWithDistances(TreeNode root, int hDist, int level) {
        if(root == null) return;
        if(dist.get(hDist) == null) dist.put(hDist, new PriorityQueue<>((a, b) -> {
            if(a[0] == b[0]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        }));
        dist.get(hDist).offer(new int[]{level, root.val});
        storeWithDistances(root.left, hDist - 1, level + 1);
        storeWithDistances(root.right, hDist + 1, level + 1);
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        storeWithDistances(root, 0, 0);
        List<List<Integer>> result = new ArrayList<>();
        for(int hDist : dist.keySet()) {
            List<Integer> column = new ArrayList<>();
            var sorted = dist.get(hDist);
            while(!sorted.isEmpty()) column.add(sorted.poll()[1]);
            result.add(column);
        }
        return result;  
    }
}