public class Multi_thread {
    public static void main(String []args){
        A a=new A();
        B b=new B();
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        t1.start();
        t2.start();
    }
}
class A implements Runnable{
    
    public void run(){
        System.out.println("A is running");
        for(int i=0;i<26;i++){
            char b=(char) ('A'+i);
            System.out.println();
        }
    }
}
class B implements Runnable {
public void run(){
    System.out.println("B is runnning");
    for(int i=0;i<20;i++){
        System.out.println(i+1);
    }
}
    
}
