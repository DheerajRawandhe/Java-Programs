import java.util.*;

public class bits2 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int opertor=sc.nextInt();
            //opertor=1 : set oper=0 : clear
            int n=5; //0101
            int pos=1; //position
            
            
            int  bitMask=1<<pos;
            if(opertor == 1){
                //set
                int newNumber =bitMask | n;
                System.out.println(newNumber);
            }
            else
            {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber= newBitMask & n;
            System.out.println(newNumber);
            }

    
        
    }
    }

