class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          int low=0;
        int high =matrix[0].length-1;
       while(high >= 0 && low <= matrix.length-1){
            int mid=(high + low )/2;
            if(matrix[low][high]==target){
                return  true;
            }
            else if (target <matrix[low][high])
            {
                high--;
              
            }
            else  if(target > matrix[low][high])
            {
            low++;
            }
       }
        return false;
    }
}