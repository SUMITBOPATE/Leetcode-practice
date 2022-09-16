class Solution {
    public int trailingZeroes(int n) {
        int ans=0;
        while(n>0){
           int temp=n/5;
            ans+=temp;
            n=temp;
        }
    return ans;
    }
    
}