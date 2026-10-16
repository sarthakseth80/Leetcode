class Solution {
    public void rotate(int[][] matrix) {
        // Transpose 
        // reverse

        int n = matrix.length;

        // Transpose
        for(int i = 0 ; i < n;i++){//row
            for(int j= i+1; j<n;j++){ // column
                int temp= matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse 

        for(int i = 0 ; i<n ;i++){
            int left = 0;
            int right = n-1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] =temp;

            left++;
            right--;
            }
           
        }
    }
}