package OOPS;

public class Dog extends Animal {
    public Dog(){
        //first line
        super(12);
        System.out.println("work");
    }
    int x=4;
    public void print(){
        System.out.println(x);
        System.out.println(super.x);//to access the parent x variable.
    }
    
    
}
