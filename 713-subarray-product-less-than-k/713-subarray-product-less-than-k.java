class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
//       int left=0;
       
//         int product=1;
//         int ans=0;
//         if(k<=0){
//             return 0;
//         }
//         if(k<=1){
//             return 1;
//         }
//         for(int right=0;right<nums.length;right++){
//             product*=nums[right];
//                 while(product>=k){
//                     product/=nums[left];
//                     left++;
//                 }   ans+=right-left+1;
                 
                    
                
            
            
//         }
//         return ans;
            
            
         if (k <= 1) return 0;
        int prod = 1, ans = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) prod /= nums[left++];
            ans += right - left + 1;
        }
        return ans;    
            
        
    }
}