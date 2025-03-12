public class clearBits {
    public static void main(String[] args) {
        int n=5; //0101
        int pos=2; //position
        int bitMask= 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    
}
}

//output --> Decimal values