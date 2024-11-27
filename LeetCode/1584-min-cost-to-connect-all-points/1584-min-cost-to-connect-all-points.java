class Solution {
    private int[] parent;

    public int minCostConnectPoints(int[][] points) {
        List<int[]> edges = new ArrayList<>();

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int cost = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                edges.add(new int[]{cost, i, j});
            }
        }

        edges.sort(Comparator.comparingInt(edge -> edge[0]));

        parent = new int[points.length];
        Arrays.fill(parent, -1);

        int cost = 0;
        int count = 0;

        for (int[] edge : edges) {
            int a = edge[1];
            int b = edge[2];
            int c = edge[0];

            int pa = findParent(a);
            int pb = findParent(b);

            if (pa != pb) {
                parent[pa] = pb;
                cost += c;
                count++;
                if (count == points.length - 1) break;
            }
        }

        return cost;
    }

    private int findParent(int x) {
        if (parent[x] == -1) return x;
        return parent[x] = findParent(parent[x]);
    }
}