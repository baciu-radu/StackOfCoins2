import static java.lang.Math.sqrt;

public class StackOfCoins {
    public long stackOfCoins(int[] coins, int n) {

        long totalCoins = 0;

        for (int i = 0; i < n; i++) {

            coins[maxCoinsIndex(coins)] = (int) sqrt(coins[maxCoinsIndex(coins)]);
        }
        for (int i = 0; i < coins.length; i++) {
            totalCoins += coins[i];
        }
        return totalCoins;
    }

    public int maxCoinsIndex(int[] coins) {
        int maxCoins = -1;
        int maxCoinsIndex = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] > maxCoins) {
                maxCoins = coins[i];
                maxCoinsIndex = i;
            }
        }
        return maxCoinsIndex;
    }
}
