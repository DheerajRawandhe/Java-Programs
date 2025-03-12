public class stringlength {
        public static void main(String[] args) {
            //concatenation
            String firstname="Dheeraj";
            String lastname="Rawandhe";
            String fullname=firstname +"@" + lastname;
            //dheerajrawandhe
            System.out.println(fullname.length());
            
            //chatAt
            for(int i=0; i<fullname.length(); i++)
            System.out.println(fullname.charAt(i));
        }
        
    }

    

