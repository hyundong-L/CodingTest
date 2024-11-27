class Solution {
        public int networkDelayTime(int[][] times, int n, int k) {
        List<int[]>[] graph = buildGraph(n, times);

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{k, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentNode = current[0];
            int currentDist = current[1];

            if (currentDist > dist[currentNode]) {
                continue;
            }

            for (int[] neighbor : graph[currentNode]) {
                int nextNode = neighbor[0];
                int weight = neighbor[1];

                if (dist[nextNode] > currentDist + weight) {
                    dist[nextNode] = currentDist + weight;
                    pq.offer(new int[]{nextNode, dist[nextNode]});
                }
            }
        }

        int maxDelay = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }
            maxDelay = Math.max(maxDelay, dist[i]);
        }

        return maxDelay;
    }

    private List<int[]>[] buildGraph(int n, int[][] times) {
        List<int[]>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : times) {
            graph[edge[0]].add(new int[]{edge[1], edge[2]});
        }
        return graph;
    }
}