public class Main{
    public static void main(String[] args){
        Student s1 = new Student("Ritu", 19, 95.5, "Anatomy");
        Student s2 = new Student("Karan", 22, 83, "Maths");
        Student s3 = new Student("Bhushan", 22, 75, "Science");
        Student s4 = new Student("Kundan", 24, -10, "Programming");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        

        s3.setMarks(63);
        System.out.println("Updated: " + s3);

        s1.setMarks(150);
        System.out.println("Updated: " + s1);

        System.out.println(s1.getName()+ " got grade " + s1.getGrade());
        System.out.println(s4.getName() + " is pass " + s4.isPassing());

    }
}