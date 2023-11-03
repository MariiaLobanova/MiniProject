package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String nameCourse;
    int idCourse;

    public Course(String nameCourse, int idCourse) {
        this.nameCourse = nameCourse;
        this.idCourse = idCourse;
    }
    public String getNameCourse() {
        return nameCourse;
    }
    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }
    public int getIdCourse() {
        return idCourse;
    }
    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    @Override
    public String toString() {
        return "Course='" + nameCourse + '\'' +
                ", id=" + idCourse;
    }
}
class CourseManagment{
        private List<Course> courses = new ArrayList<>();

        public void addCourse(String nameCorse, int idCourse){

            Course course = new Course(nameCorse, idCourse);
            courses.add(course);
            System.out.println(course+ " is added ");
        }

        public void deliteCourse(int idCourse){
            for(Course course: courses){
                if(course.getIdCourse()==idCourse){
                    courses.remove(course);
                    System.out.println(course + " is delited");
                }
            }
            System.out.println("not found");
        }

        public void displayCourses(){
            System.out.println("List of courses: ");
            for(Course course: courses){
                System.out.println(course);
            }
        }

        public void searchCourse(String courseData){ // allow to search by name or id
            for(Course course: courses){
                if (course.getNameCourse().equalsIgnoreCase(courseData)||String.valueOf(course.getIdCourse()).equalsIgnoreCase(courseData)){
                    System.out.println(course +" found");
                    return;
                }
            }
            System.out.println("Courses is not found");
        }

    public static void main(String[] args) {
        CourseManagment courseManagment = new CourseManagment();
        courseManagment.addCourse("Biology", 22);
        courseManagment.addCourse("Geology", 23);
        courseManagment.addCourse("History", 24);
        courseManagment.addCourse("Math", 25);

        courseManagment.displayCourses();

        courseManagment.deliteCourse(22);

        courseManagment.displayCourses();

    }
}

