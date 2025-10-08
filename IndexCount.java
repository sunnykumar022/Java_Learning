import java.util.Scanner;

public class IndexCount {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.next().charAt(0);
        int ind=indexNum(ch,str);
        System.out.println("first Index value:"+ind);
        int lastInd=lastIndexValue(ch, str);
        System.out.println("last index value:"+lastInd);

        // String t="   Hello world  ";
        // String trimValue=newTrim(t);

        String a="hello";
        int n=4;
        String charat=charatPos(a, n);
        System.out.println(charat);
    }
     static int  indexNum(char ch,String str){
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)) return i;
        }
        return -1;
     
     }
     static int lastIndexValue(char ch,String str){
        for(int i=str.length()-1;i>=0;i--){
            if(ch==str.charAt(i)) return i;
        }
        return -1;
     }

    //  static String newTrim(String str){
    //    int i=0,j=str.length()-1;
    //    int start,end;
    //    while(i<str.length()){
    //     if(str.charAt(i)!=' '){
    //         start=i;
    //         break;
    //     }
    //     i++;
    //    }
    //    while(j>=0){
    //     if(j!=' '){
    //         end=j;
    //     }
    //     j--;
    //    }
    //    return str.substring(start, end);
    //  }

    static String charatPos(String str,int n){
        return str.substring(n,n+1);
    }
}
