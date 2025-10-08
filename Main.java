public class Main {
    public static void main(String[] args) {
        
        Bank b=new Bank();
        b.setDetails("Sunny",500000.5);
        String res=b.getDetails();
        System.out.println(res);

    }
    
}

class Bank{
    private String name;
    private double bal;
    void setDetails(String name,double bal){
        this.name=name;
        this.bal=bal;
    }
    String getDetails(){
        return "name:"+name+"\n"+"balance:"+bal;//String use when you want to return else use void 
    }

}

//without using settter we can chneg the value of private ->usung constructor
/*  legacy class->old classes of java
StringTokenizer-> new version is split()->



Inheritence -> IS A
single level
multi level
multiple->X

hierchiel
hybrid

*/
