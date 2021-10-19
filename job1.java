public class job1
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 10; i++)
        {
            Thread.sleep(30000);
            System.out.println(i);
        }
    }
}