public class setBit {

    public static void main(String[] args) {
        int n=5; //0101
        int pos=1; //position
        int bitMask= 1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
    
}
