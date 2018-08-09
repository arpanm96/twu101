package triangle;

public class TriangleHelper {

    private String symbol;

 /*   public String getSymbol() {
        return symbol;
    }*/

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void asterisk() {
        System.out.println(symbol);
    }

    public void horizontalLine(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    public void verticalLine(int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(symbol);
        }
    }

    public void rightTriangle(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
