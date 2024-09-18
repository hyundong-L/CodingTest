class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;

        int[] coinList = new int[amount + 1];
        Arrays.fill(coinList, amount + 1);
        coinList[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    coinList[i] = Math.min(coinList[i], coinList[i - coin] + 1);
                }
            }
        }

        return coinList[amount] > amount ? -1 : coinList[amount];
    }
}