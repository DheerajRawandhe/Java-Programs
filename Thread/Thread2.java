class my extends Thread
{
    public void run()
    {
        try
        {
            while(true)
            {
                Thread.sleep(2000);
                System.out.println("RCB :-E SALA CUP NAMMADU");
            }
        }
        catch(Exception e)
        {
        System.out.println("thread is interrupted");
        }
}
public class Thread2
{
    public static void main(String[] args)
    {
        my m=new my();
        m.run();
        
    }
}
}