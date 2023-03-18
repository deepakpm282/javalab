package javalab;

class main {
    //OOPS PART 1 here we discussed about the class and objects and this keyword.
    public static void main(String[] args) {
    
        Student student[] = new Student[5];

        Student deepak = new Student(15,"deepak_pm",78.8f);
        Student kunal=new Student();

        // deepak.greeting();
        kunal.Student();

        //  System.out.println(deepak.rno);
        //  System.out.println(deepak.name);
        //  System.out.println(deepak.marks);
        //  System.out.println(kunal.rno);

        }
    }
    // this s how you create a class
    class Student{
        int  rno;
       String name;
       float marks;

       void greeting(){
        System.out.println("Hello my name is "+ this.name);
       }

       public void Student() {
    }

    Student(){

        this.rno=16;
        this.name="deepak_P_m_";
        this.marks=98.8f;

       }

       Student(int roll,String naam,float mark){
        this.rno=roll;
        this.name=naam;
        this.marks=mark;

       }
}
// primitive data types are not implemented as objects in java hence they are stored in the stack memory only.


