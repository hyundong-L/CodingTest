class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] x : flights) {
            list.get(x[0]).add(new int[]{x[1], x[2]});
        }

        Queue<int[]> Q =new LinkedList<>();
        
        if (src == dst) {
            return 0;
        }
        
        int[] v = new int[n];
        Arrays.fill(v,Integer.MAX_VALUE);
        v[src] = 0;
        Q.offer(new int[]{src, 0});
        int level=0;

        while (!Q.isEmpty() && level < k + 1) {
            int size = Q.size();
 
            for (int i = 0; i < size; i++) {
                int[] cur = Q.poll();
 
                for (int[] next : list.get(cur[0])) {
                    if (cur[1] + next[1] < v[next[0]]) {
                        v[next[0]] = cur[1] + next[1];
                        Q.offer(new int[]{next[0], v[next[0]]});
                    }
                }
            }
            level++;
        }

        return v[dst] == Integer.MAX_VALUE ? -1 : v[dst];
    }
}