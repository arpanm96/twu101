import java.util.Scanner;

public class Diamond {
        public static void main(String []args){

            DiamondHelper diamond = new DiamondHelper();
            diamond.setSymbol("*");
            printDiamond(diamond);
        }

        private static void printDiamond(DiamondHelper diamond) {

            diamond.isosceles(getNFromUser());
            diamond.diamondWithoutName(getNFromUser());
            diamond.diamondWithName(getNFromUser(),getNameFromUser());
        }

        private static int getNFromUser() {
            System.out.print("Enter n : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            return n;
        }
        private static String getNameFromUser() {
        System.out.print("Enter name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        return name;
        }
    }


