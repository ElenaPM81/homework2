
public class homework2 {
    public static void main(String[] args) {
        String s = "name\":Ivanov\", \"country\": \"Russia\", \"city\":\"Moscow\", \"age\":\"null";
        System.out.println(s.replaceAll("\\p{P}", " "));
        System.out.println(s.replace(",", " "));
        System.out.println(s.replace("null", " "));  
        System.out.println(s.replaceAll("\\s", " "));
        System.out.println(s.toLowerCase());
      
    }
} 
              
      