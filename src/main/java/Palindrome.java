public class Palindrome{
    public boolean check(String s){
     String r=new StringBuilder(s).reverse().toString();
     return s.equals(r);
    }
    }
    