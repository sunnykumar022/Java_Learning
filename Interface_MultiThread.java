public class Interface_MultiThread {
    public static void main(String []args){
        A a=new A();
        a.sleep();
    }
}
 interface Classes{
    void sleep();

    
}
class A implements Classes{
    public void sleep(){
        System.out.println("A is sleeping");
    }

}