// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int row = matrix.length;
//         int col = matrix[0].length;

//         for(int i =0; i< row; i++){
//             for(int j=0; j<col; j++){
//                 if(matrix[i][j] == 0){
//                     // row 0- toh col means j bdega i constant rahega
//                     for(int k =0; k < col; k++){
//                         if(matrix[i][k] != 0) matrix[i][k] = -1;
//                     }
//                     // col 0- toh row means i bdega j constant rahega
//                     for(int k =0; k < row; k++){
//                         if(matrix[k][j] != 0) matrix[k][j] = -1;
//                     }
//                 }
//             }
//         }

//         for(int i=0; i< row; i++){
//                 for(int j =0; j< col; j++){
//                     if(matrix[i][j] == -1) matrix[i][j] =0;
//                 }
//             }
//     }
// }

class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int [] n = new int[row];
        int [] m = new int[col];

        for(int i =0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] == 0){
                    n[i] =1;
                    m[j] =1;
                }
            }
        }

        for(int i =0; i<row; i++){
            for(int j=0; j<col; j++){
                if(n[i] == 1 || m[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}    