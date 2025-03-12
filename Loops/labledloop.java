public class labledloop 

 {
    public static void main(String arg[])
    {
        int m,n;
       loop:for(m=1;m<=10;m++)
        {
            for(n=1;n<=10;n++)
        {
            System.out.println(m*n);
            if(m==n)
            break loop;
        }
    }
}

}
