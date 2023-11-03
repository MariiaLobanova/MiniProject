package org.example;

import java.util.ArrayList;
import java.util.List;

//Implement Student and Course Classes with CRUD operations
//What to do: Create Student and Course classes. Inside these classes, implement CRUD methods.
//Expected: Student and Course classes each having fields for name, ID, etc., and methods for add, update, delete, and display records.
public class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return " name='" + name + '\'' +
                ", id=" + id;
    }
}
class StudentManagment{
    private List<Student> students = new ArrayList<>();

    public void addStudent(String name, int id){

        Student student = new Student(name, id);
        students.add(student);
        System.out.println("Student" + student+ " is added ");
    }

    public void deliteStudent(int id){
        for(Student student: students){
            if(student.getId()==id){
                students.remove(student);
                System.out.println(student + " is delited");
            }
        }
        System.out.println("not found");
    }

    public void displayStudents(){
        System.out.println("List of students: ");
        for(Student student: students){
            System.out.println(student);
        }
    }

    public void searchStudent(String data){ // allow to search by name or id
        for(Student student: students){
            if (student.getName().equalsIgnoreCase(data)||String.valueOf(student.getId()).equalsIgnoreCase(data)){
                System.out.println(student +" found");
                return;
            }
        }
        System.out.println("Student is not found");
    }

    public static void main(String[] args) {
        StudentManagment studentManagment = new StudentManagment();
        studentManagment.addStudent("Mariia" ,1);
        studentManagment.addStudent("Victor" ,2);
        studentManagment.addStudent("Mark" ,3);
        studentManagment.addStudent("Anton" ,4);
        System.out.println("-----------");

        studentManagment.searchStudent("3");
        studentManagment.searchStudent("Anton");
        System.out.println("-----------");

        studentManagment.displayStudents();
        System.out.println("-----------");

        studentManagment.deliteStudent(1);
        System.out.println("-----------");

        studentManagment.displayStudents();
    }

}
