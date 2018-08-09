import java.util.Scanner;

public class PrimeFactors {
    public static void main(String []args)
    {
        System.out.print("Enter no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generate(n);
    }
    private static void generate(int n)
    {
        for(int i = 2; i < n;i++)
        {
            if( isPrime(i) && (n % i == 0) )
                System.out.println(i);
        }
    }
    private static boolean isPrime(int i)
    {
        for(int j = 2; j <= i/2;j++)
        {
            if(i % j == 0)
                return false;
        }
        return true;
    }

}
