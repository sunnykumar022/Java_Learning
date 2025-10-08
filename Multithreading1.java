class Multithreading1{
    public static void main(String []args){
        MyThread1 m1=new MyThread1();
        MyThread2 m2 =new MyThread2();
        m1.start();
        m2.start();
        
    }
    
}
class MyThread1 extends Thread{
    public void run(){
        System.out.println("Thread1 is running");
    }
}
class MyThread2 extends Thread{
    public void run(){
        System.out.println("Thread 2 is running");
    }
}