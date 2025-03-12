import java.util.*;

public class my2 {
    public static void main(String arg[])
    {
        Scanner s= new Scanner(System.in);
        int dayno;
        System.out.println("enter any number");
        dayno=s.nextInt();
        switch(dayno)
        {
            case 1: 
            System.out.println("today is SUNDAY");
            break;
            case 2: 
            System.out.println("today is MONDAY");
            break;
            case 3: 
            System.out.println("today is TUESDAY");
            break;
            case 4: 
            System.out.println("today is WEDNESDAY");
            break;
            case 5: 
            System.out.println("today is THRUSDAY");
            break;
            case 6: 
            System.out.println("today is FRIDAY");
            break;
            case 7: 
            System.out.println("today is SATURDAY");
            break;
            default:
            System.out.println("involid day number");

        

        }
    }
    
}
