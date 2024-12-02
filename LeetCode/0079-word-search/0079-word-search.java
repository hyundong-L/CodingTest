class Solution {
    boolean[][] visited;
    int[] rMove = {1, -1, 0, 0};
    int[] cMove = {0, 0, 1, -1};

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        visited = new boolean[m][n];

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == word.charAt(0)) {
                    visited[r][c] = true;
                    
                    if (backtrack(r, c, 1, board, word)) {
                        return true;
                    }
                    
                    visited[r][c] = false;
                }
            }
        }
        
        return false;
    }

    private boolean backtrack(int r, int c, int count, char[][] board, String word) {
        if (count >= word.length()) return true;

        for (int i = 0; i < 4; i++) {
            int tempR = r + rMove[i];
            int tempC = c + cMove[i];
            
            if (tempR >= 0 && tempR < board.length && tempC >= 0 && tempC < board[0].length) {
                if (board[tempR][tempC] == word.charAt(count) && !visited[tempR][tempC]) {
                    visited[tempR][tempC] = true;
                    
                    if (backtrack(tempR, tempC, count + 1, board, word)) {
                        return true;
                    }
                    
                    visited[tempR][tempC] = false;
                }
            }
        }

        return false;
    }
}