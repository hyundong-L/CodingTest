class Solution {
    public int numIslands(char[][] grid) {
        int width = grid[0].length;
        int height = grid.length;
        int cnt = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (grid[i][j] == '1') {
                    cnt++;
                    bfs(grid, i, j, width, height);
                }
            }
        }

        return cnt;
    }

    private int[][] ways = {
            {1, 0}, {0, 1}, {-1, 0}, {0, -1}
    };

    private void bfs(char[][] grid, int i, int j, int width, int height) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});

        grid[i][j] = '0';

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int x = poll[0], y = poll[1];

            for (int[] way : ways) {
                int moveX = x + way[0];
                int moveY = y + way[1];

                if (moveX >= 0 && moveX < height && moveY >= 0 && moveY < width && grid[moveX][moveY] == '1') {
                    grid[moveX][moveY] = '0';
                    queue.add(new int[]{moveX, moveY});
                }
            }
        }
    }
}