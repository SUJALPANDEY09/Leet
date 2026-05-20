class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int u = ((matrix.length )*(matrix[0].length )) -1 ;
        int  l = 0;
        while(l<=u){
            int mid = (l+u)/2;
            int row = mid/matrix[0].length;
            int col =  mid % matrix[0].length;
            if(matrix[row][col] == target){
                return true;
            }
            if(matrix[row][col]>target){
                u = mid -1;
            }
            else{
                l = mid + 1;
            }
        }
        return false;
    }
}