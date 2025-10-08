public class Producer_Consumer {
    public static void  main(String []args){
        Product p=new Product();
        Producer producer=new Producer( p);
        Consumer consumer=new Consumer( p);
        producer.start();
        consumer.start();
    }
}

class Producer extends Thread{
    Product p;
    Producer(Product p){
        this.p=p;
    }
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Producer produces data: "+i);
            p.setData(i);
        }
    }

}
class Consumer extends Thread{
    Product p;
    Consumer(Product p){
        this.p=p;
    }
    public void run(){
        for(int i=0;i<=10;i++){
            int t=p.getData();
            System.out.println("Consumer consume data :"+t);
        }    
    }
}
class Product {
    int data;
    void setData(int data){
        this.data=data;
    }
    int getData(){
        return data;
    }
    
}
