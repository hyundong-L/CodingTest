class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> linkedList = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        
        linkedList.add(0);
        dfs(graph, 0, linkedList, result);
        
        return result;
    }

    private void dfs(int[][] graph, int index, List<Integer> list, List<List<Integer>> result) {
        if (index == graph.length - 1) {
            result.add(new LinkedList<>(list));
            
            return;
        }
        
        for (int neighbor : graph[index]) {
            list.add(neighbor);
            dfs(graph, neighbor, list, result);
            list.remove(list.size() - 1);
        }
    }
}