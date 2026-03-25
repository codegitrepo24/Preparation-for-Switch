// OOP basics — Class, Object, Constructor, Encapsulation
// Write a Student class with name, age, marks. Add    getters/setters. Create 3 objects. Print the;
public class Student{
    private String name;
    private int age;
    private double marks;
    private String subject;

    public Student(String name, int age, double marks, String subject){
        this.name =  name;
        this.age = age;
        setMarks(marks);
        this.subject = subject;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getMarks(){
        return marks;
    }

    public String getsubject(){
        return subject;
    }

    public void setMarks(double marks){
        if(marks < 0 || marks > 100){
            System.out.println("Invalid marks! Must be between 0 and 100.");
            return;
        }
        this.marks = marks;
    }

    public String getGrade(){
        if(marks >= 90) return "A";
        else if(marks >=80) return "B";
        else if(marks >=70) return "C";
        else if(marks >= 60) return "D";
        else return "F";

    }

    public boolean isPassing(){
        return marks >= 60;
    }

    public String toString(){
        return "Student[name = " +name+ ", age = " +age+ ", marks = " +marks+ ", grades = "+getGrade()+ ", subject = " + subject+ "]";
    }

}
