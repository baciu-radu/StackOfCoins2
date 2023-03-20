public class Main {

    public static void main(String[] args) {

        int[] coins = new int[]{81, 49, 16, 4, 100};
//        int[] coins = new int[]{0, 1, 1, 1, 0};
//        int[] coins = new int[]{0, 0, 0, 0, 0};
//        int[] coins = new int[]{-1, -1, -1, -1, -1};
//        int[] coins = new int[]{-15, 81, 49, 1, 25};
        StackOfCoins stackOfCoins = new StackOfCoins();

        try {
            CheckStacksNegativeException.validate(coins);
            System.out.println("Total coins remaining: " + stackOfCoins.stackOfCoins(coins, 5));

            System.out.println("Remaining stacks are: ");
            for (int i : coins) {
                System.out.println("[" + i + "]");
            }

        } catch (StacksNegativeException ex) {
            System.err.println("Caught exception");
            System.err.println("Exception occured: " + ex);
        }


    }

}