public class Vowelcheck {
    public static void main(String args[]){
        String s="java is a programming language";
        String t=changevowel(s);
        System.out.println(t);
        String a=s.replaceAll("[aeiou]", "/");
        System.out.println(a);
        String b=s.replaceAll("[a-z]", "");
        System.out.println(b);

        String c="race,,caR]]";
        String d=c.replaceAll("[^a-zA-Z]","");
        System.out.println(d);
        boolean bool=isPalindrome(c);
        System.out.println("c is palindrome: "+ bool);


    }
    static String changevowel(String s){
     String t ="";
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u'){
                t+='/';
            }
            else{
                t+=s.charAt(i);
            }
        
        }
        return t;
    }
    static boolean isPalindrome(String s){
        String b=s.replaceAll("[^a-zA-Z]","");
        String d=b.toLowerCase();
        int i=0,j=d.length()-1;
        while(i<j){
            if(d.charAt(i)!=d.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    

}
