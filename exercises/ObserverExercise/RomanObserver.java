public class RomanObserver {
    private static String[][] table =
            {{"CM", "D", "CD", "C"}, {"XC", "L", "XL", "X"}, {"IX", "V", "IV", "I"}};

    public void update(int val) {
        System.out.print("roman: ");
        if (val > 3999) {
            System.out.println("****");
            return;
        }
        while (val >= 1000) {
            System.out.print("M");
            val -= 1000;
        }
        for (int multiplier = 100, index = 0; multiplier >= 1;
             multiplier /= 10, index++) {
            if (val >= 9 * multiplier) {
                System.out.print(table[index][0]);
                val -= 9 * multiplier;
            } else if (val >= 5 * multiplier) {
                System.out.print(table[index][1]);
                val -= 5 * multiplier;
            } else if (val >= 4 * multiplier) {
                System.out.print(table[index][2]);
                val -= 4 * multiplier;
            }
            while (val >= 1 * multiplier) {
                System.out.print(table[index][3]);
                val -= 1 * multiplier;
            }
        }
        System.out.println();
    }
}
