class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> rs = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int SR = 0, SC = 0;
        int ER = n - 1, EC = m - 1;

        while (SR <= ER && SC <= EC) {

            // left -> right
            for (int i = SC; i <= EC; i++) {
                rs.add(matrix[SR][i]);
            }
            SR++;

            // top -> bottom
            for (int i = SR; i <= ER; i++) {
                rs.add(matrix[i][EC]);
            }
            EC--;

            // bottom -> left (safety check)
            if (SR <= ER) {
                for (int i = EC; i >= SC; i--) {
                    rs.add(matrix[ER][i]);
                }
            }
            ER--;

            // bottom -> top (safety check)
            if (SC <= EC) {
                for (int i = ER; i >= SR; i--) {
                    rs.add(matrix[i][SC]);
                }
            }
            SC++;
        }

        return rs;
    }
}
