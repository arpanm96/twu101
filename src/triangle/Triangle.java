package triangle;

import java.util.Scanner;

public class Triangle {

    public static void main(String []args){

        TriangleHelper triangle = new TriangleHelper();
        triangle.setSymbol("*");
        printTriangle(triangle);
    }

    private static void printTriangle(TriangleHelper triangle) {
        triangle.asterisk();
        triangle.horizontalLine(getNFromUser());
        triangle.verticalLine(getNFromUser());
        triangle.rightTriangle(getNFromUser());
    }

    private static int getNFromUser() {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }
}
