public class Mult2 {
    public static void main(String []args){
        A obj1=new A();
        A obj2=new A();
        obj1.setName("printNu");
        obj2.setName("printCh");
        obj1.start();
        obj2.start();
    }
}
class A extends Thread{
    public void run(){
     Thread t=Thread.currentThread();
     String s=t.getName();
     if(s.equals("printNu")){
        printNum();
     }else{
        printChar();
     }
    }
    void printChar(){
         for(int i=0;i<26;i++){
            char b=(char) ('A'+i);
            System.out.println(b);
        }
    }
    void printNum(){
        for(int i=0;i<20;i++){
        System.out.println(i+1);
    }
    }
}
