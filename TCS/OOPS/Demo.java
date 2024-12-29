package OOPS;

public class Demo {
    public static void main(String args[]){
        //now creating object of student
        Student st1;
        st1=new Student();
        st1.StudentCity ="kanpur";
        st1.StudentId=123;
        st1.StudentName="kashish";
        st1.study();

Student st2;
        st2=new Student(741,"shyam","mumbai");

        Dog d1=new Dog();
    d1.eat();
    System.out.println(d1.color);

    

    }
    
}
//this keyword
//Refer current invoking object
//this()->for calling current class constructor from inside different constuctor of same class.

//class test{                       Test t=new Test()
                                    // t.show()//jb hum yha se call krenge tb thiska mtlb t hoga
//public void show(){               Test 2=new Test()
                                    //t2.show//jb hum yha se call krenge tb thiska mtlb t2 hoga
////this.a;

//we can also call one consturctor from other constructor using this keyword

//super refers to the immediate parent object.
//super() used to call parent class consturctor from inside  child constructor.
//whenver we call one constructor from inside other class constructor then use super() and this must be the first ine to be executed.



