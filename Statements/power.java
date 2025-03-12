
public class power1
{
    public static void main(String arg[])
    {
        int n,p,i=1,x=1;
        Scanner s=new Scanner (System.in);
        n=s.nextInt();
        System.out.println("power of num");
        p=s.nextInt();
        while(i<=p)
        {
            x=x*n;
            i++;

        }
        System.out.println(n + "power" + p + " = " + x);



    }
    
}
