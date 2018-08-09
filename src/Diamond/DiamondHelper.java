public class DiamondHelper {
    private String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void isosceles(int n) {
        int spaceCount = n;
        for (int i = 1; i <= n; i++) {
            printSpace(spaceCount--);
            printSymbolRow(2 * i - 1);
        }
    }

    public void diamondWithoutName(int n) {
        int spaceCount = n;
        for (int i = 1; i <= n; i++) {
            printSpace(spaceCount--);
            printSymbolRow(2 * i - 1);
        }
        spaceCount += 2;
        for (int i = n - 1; i >= 1; i--) {
            printSpace(spaceCount++);
            printSymbolRow(2 * i - 1);
        }
    }

    public void diamondWithName(int n, String name) {
        int spaceCount = n;
        for (int i = 1; i <= n; i++) {
            printSpace(spaceCount--);
            if (i != n)
                printSymbolRow(2 * i - 1);
            else
                System.out.println(name);
        }
        spaceCount += 2;
        for (int i = n - 1; i >= 1; i--) {
            printSpace(spaceCount++);
            printSymbolRow(2 * i - 1);
        }
    }

    private void printSpace(int spaceCount) {
        for (int k = spaceCount; k >= 1; k--)
            System.out.print(" ");
    }

    private void printSymbolRow(int i) {
        for (int j = 1; j <= i; j++)
            System.out.print(symbol);
        System.out.println();
    }

}
