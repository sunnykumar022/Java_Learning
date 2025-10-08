import java.util.Arrays;

public class ARRAY {
    public static void main(String args[]){
        int []arr={10,2,50,4,6};//array use arrays class built in method 
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // System.out.println();
        String s="hello";
        String t="Hello";
      System.out.println(s.compareTo(t));  
      boolean flask=equalto(s, t);
      System.out.println("s is equal to t:"+flask);
    }
    static boolean equalto(String s,String t){
        if(s.length()!=t.length()) return false;
        for(int i=0;i<t.length();i++){
            int ch1=s.charAt(i);
            int ch2=t.charAt(i);
            if(ch1-ch2!=0) return false;

        }
        return true;

    }
}
