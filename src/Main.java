public class Main
{
    public static void main(String[] args)
    {
        int testNum = 12;
        int test = 0;
        test = testNum % 2;
        if (test == 0)
        {
            System.out.println(testNum + " is an even number.");
        }
        else
        {
            System.out.println(testNum + " is an odd number.");

        }
    }
}