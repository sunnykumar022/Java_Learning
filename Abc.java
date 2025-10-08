class Abc{
    static{
        System.out.println("static1");
    }
    static{
        System.out.println("static 2");
    }
    {
        System.out.println("instance block1");
    }
    {
        System.out.println("instane block 2");
    }
    Abc(){
        System.out.println(" constructor");
    }
    Abc(int a){
        System.out.println("construtor argss1");
    }
    int method(){
        System.out.println("method1");
        return 0;
    }
    
    public static void main(String []args){
    Abc a=new Abc();
    Abc a1=new Abc(10);
    int b=a1.method();
    System.out.println(b);
    }
}