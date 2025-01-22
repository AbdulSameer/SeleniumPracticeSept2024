package rahulShetty;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    @Override
    public int compareTo(Student other) {
        // Natural ordering by roll number
        return Integer.compare(this.rollNumber, other.rollNumber);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 2));

        System.out.println("Before sorting: " + students);

        // Sorting using natural ordering
        Collections.sort(students);

        System.out.println("After sorting: " + students);
    }
}
