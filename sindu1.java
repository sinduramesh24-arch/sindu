package student;


public class student {
    String name;
    int rollNo;
    int age;

    // Constructor
    student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    // Display student details
    void display() {
        System.out.println("student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        student s1 = new student("Aisiri", 101, 19);
        student s2 = new student("Meghana", 102, 19);
        student s3 = new student("Vaishnavi", 103, 19);
        student s4 = new student("Vamshi", 104, 21);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}


