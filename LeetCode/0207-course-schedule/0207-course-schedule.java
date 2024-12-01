class Solution {
public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] prerequisite : prerequisites) {
            graph[prerequisite[1]].add(prerequisite[0]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] cycle = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, graph, visited, cycle)) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int node, List<Integer>[] graph, boolean[] visited, boolean[] cycle) {
        if (cycle[node]) {
            return false;
        }
        if (visited[node]) {
            return true;
        }

        visited[node] = true;
        cycle[node] = true;

        for (int i = 0; i < graph[node].size(); i++) {
            if (!dfs(graph[node].get(i), graph, visited, cycle)) {
                return false;
            }
        }

        cycle[node] = false;
        return true;
    }
}