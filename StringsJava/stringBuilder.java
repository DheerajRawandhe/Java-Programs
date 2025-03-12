public interface stringBuilder {
        public static void main(String[] args) {
            StringBuilder sb=new StringBuilder("DHEERAJ");
            System.out.println(sb);
            
           //insert S --> SDHEERAJ
            sb.insert(0, "S");
            System.out.println(sb);

            //delete the extra 'S'
            sb.delete(0,1);
            System.out.println(sb);
     }
        
    }
    
    

