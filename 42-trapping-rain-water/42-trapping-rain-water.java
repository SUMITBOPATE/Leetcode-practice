class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int[] leftMax = new int[n], rightMax = new int[n];
        for (int i = 1; i < n; ++i)
            leftMax[i] = Math.max(height[i-1], leftMax[i-1]);
        for (int i = n-2; i >= 0; --i)
            rightMax[i] = Math.max(height[i+1], rightMax[i+1]);

        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            if (waterLevel >= height[i]) ans += waterLevel - height[i];
        }
        return ans;
    }
}
    
