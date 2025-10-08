public class Multilevel{

    public static void main(String []args){
        B c=new B();
    }
    
}
 class A{
    A(String name){
        System.out.println("My name is "+name);
    }
    void m1(){
        System.out.println("class A");
    }
}
 class B extends A{
    B(){
        super("Sunny");
        System.out.println("This is child class comstructor");
    }
    void m2(){
        System.out.println("class B");
    }

}
