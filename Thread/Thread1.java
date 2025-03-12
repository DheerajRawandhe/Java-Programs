class my extends Thread1
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
public class Thread1
{
    public static void main(String[] args)
    {
        my m=new my();
        m.run();
        
    }
}
}