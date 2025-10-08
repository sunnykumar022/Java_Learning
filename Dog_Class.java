public class Dog_Class{
    // Java Program to Demonstrate the 
// use of a class with instance variable 
// Class Declaration

//instance variable
    String name;
    int age;
    String breed;
    
    public Dog_Class(String name, int age, String breed)//constructor declaration
    {
        this.name=name;
        this.age=age;
        this.breed=breed;
    }


    //mwthods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getBreed(){
        return breed;
    }
    public String print_info(){
        return ("Name : "+this.getName()+"\nAge : "+this.getAge()+"\nBreed : "+this.getBreed());
    }
    public static void main (String args[]){
        Dog_Class d1=new Dog_Class("Tuffy",5,"Pappilon");
        System.out.println(d1.print_info());
        Dog_Class d2=new Dog_Class("Varun",18,"DesiDog");
        System.out.println(d2.print_info());

    }
    
}