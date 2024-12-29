package OOPS;

public class Student {
    //data members instance members
    int StudentId;
    String StudentName;
    String StudentCity;
    //non parametrized constructor
    public Student(){
        this(96);
        System.out.println("creating object");
    }
    //parametrized constructor
    public Student(int st){
        System.out.println("creating object using parametrized constructor");

    }

    public Student(int i,String StudentName,String city){
        StudentId=i;

         this.StudentName=StudentName;
         this.StudentCity=StudentCity;

    }
    
    //Behaviour;member methods:methods(functions)
    public void study(){
        System.out.println(StudentName +" is studying");
    }
    public void study(float f){
        System.out.println(StudentName +" is studying");
    }

    public void showdetails(){
        System.out.println("My name is"+StudentName);
        System.out.println("My city is"+StudentCity);
        System.out.println("My id is"+StudentId);
    }
}
