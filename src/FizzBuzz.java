public class FizzBuzz {
    public static void main(String []args)
    {
        FizzBuzz();
    }

    private static void FizzBuzz() {
        for(int i = 1; i <= 100; i++)
        {
            if( isFizz(i) && isBuzz(i) )
                System.out.println("FizzBuzz");
            else if(isFizz(i))
                System.out.println("Fizz");
            else if(isBuzz(i))
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

    private static boolean isFizz(int i)
    {
        return ( i % 3 == 0 );
    }

    private static boolean isBuzz(int i)
    {
        return ( i % 5 == 0);
    }
}
