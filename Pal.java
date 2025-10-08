 class Pal {
    public static void main(String []args){
        String s="r[]]acec,,ar";
       boolean res=pal(s);
        System.out.println(res);
        
    }
    static boolean  pal(String s){
         int i=0;
        int j=s.length()-1;
        
        while(i!=j){
           
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            while(!ischar(s.charAt(i))){
                i++;
            }
            while(!ischar(s.charAt(j))){
                j--;
            }
        if(s.charAt(i)!=s.charAt(j)){
           return false;
        }
        }
        return true;   
     } 
      static boolean ischar(char ch){
        if((ch>='A' && ch <='Z')|| (ch>='a'&&ch<='z')){
            return true;
        }
        return false;
     }
}
