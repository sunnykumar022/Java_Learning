public class Multithreading {

    public static void main(String[] args)throws Exception {//- throws Exception is used because join() can throw InterruptedException.

        System.out.println("Main is started");
        Bathroom bath = new Bathroom();
        Boy b=new Boy(bath);
        b.setName("boy");
        Girl g=new Girl(bath);
        g.setName("girl");
        Others o=new Others(bath);
        o.setName("others");
        Thread t=Thread.currentThread();
        String s=t.getName();
        b.start();//starts the boy thread
        b.join();//join() makes the Thread wait until Boy finishes
        g.start();
        g.join();
        o.start();
        o.join();
        System.out.println("MAin is terminated");
    }
}
class Boy extends Thread{
    Bathroom bath;
    Boy(Bathroom bath){
        this.bath=bath;
    }
    public void run(){
        System.out.println("Boy is started ");
        bath.use();
        System.out.println("Boy is terminated");
    }
}
class Girl extends Thread {
    Bathroom bath;//- This declares a variable named bath of type Bathroom.
/*- When a Boy/Girl object is created, you pass a Bathroom object to it.
- this.bath = bath; assigns the passed object to the class variable.
- Now, the Boy thread has access to the shared Bathroom.
 */
    Girl(Bathroom bath){//initilization via constructor
        this.bath=bath;
    }
    public void run(){
        System.out.println("Girl is started");
        bath.use();
        System.out.println("Girl is terminated");
    }
    
}
class Others extends Thread {
    Bathroom bath;
    Others(Bathroom bath){
        this.bath=bath;
    }
    public void run(){
        System.out.println("Other is strated");
        bath.use();
        System.out.println("Other is terminated");
    }
    
}
class Bathroom{
    void use(){
        synchronized(this){
        Thread t=Thread.currentThread();
        String s=t.getName();
        System.out.println(s+ " is entered bathroom");
        System.out.println(s+" is using bathroom");
        System.out.println(s + " is left bathroom");
            // System.out.println("Synchronized block");
        }
    }
    
}