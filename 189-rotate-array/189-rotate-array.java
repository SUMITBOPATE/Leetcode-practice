class Solution {
    // int n=nums.length;
    
    public void rotate(int[] nums, int k) {
         int n=nums.length;
        k=k%nums.length;
        reverse(nums,0,n-1);
         reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        
    }
        
      public void reverse(int[] nums,int i,int j){
          
             int n=nums.length;
        
          int temp;
          
          while(i<j){
          temp=nums[i];
              nums[i]=nums[j];
              nums[j]=temp;
          i++;
              j--;
          }
      
          
          
          
          
      }  
        
        
        
        
    
}