class Solution {
    public void rotate(int[][] matrix) {
        //1. 전치 행렬 구하기
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int tmp = matrix[j][i];

                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }

        //2. 오른쪽으로 뒤집기
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int tmp = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
    }
}