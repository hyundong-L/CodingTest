class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp =  new ArrayList<>();
        dfs(1, n, k, temp, result);

        return result;
    }

    private void dfs(int start, int n, int k, List<Integer> temp, List<List<Integer>> res) {
        if (temp.size() == k) {
            res.add(new ArrayList<>(temp));
        }

        for (int i = start; i <= n; i++) {
            temp.add(i);
            dfs(i + 1, n, k, temp, res);
            temp.remove(temp.size() - 1);
        }
    }
}