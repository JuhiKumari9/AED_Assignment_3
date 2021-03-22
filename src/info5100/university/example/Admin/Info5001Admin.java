/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Admin;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author ababar
 */
public class Info5001Admin {

    public static Department department = new Department("Information Systems");
    public static PersonDirectory pd = department.getPersonDirectory();
    public static StudentDirectory sd = department.getStudentDirectory();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean valid = false;

        int studentId = 100100;

        do {
            System.out.println("-------------------------------------------------");
            System.out.println("1 - Student Operations");
            System.out.println("2 - Courses Operations");
            System.out.println("3 - Faculty Operations");
            System.out.println("8 - To exit application  ");
            System.out.print("Enter your choice:  ");
            int mainChoice = input.nextInt();
            switch (mainChoice) {
                case 1:
                    System.out.println("Student Operations:");
                    studentOperations(++studentId);
                    valid = true;
                    break;
                case 2:
                    System.out.println("Course Operations:");
                    courseOperations();
                    valid = true;
                    break;
                case 3:
                    System.out.println("Faculty Operations");
                    valid = true;
                    break;
                case 8:
                    System.out.println("Exiting the application");
                    System.exit(0);
                default:
                    System.out.println("Incorrect input!! Please re-enter choice from menu");

            }
        } while (true);
    }

    public static void studentOperations(int sId) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        System.out.println("1 - Add Student");
        System.out.println("2 - Update Student");
        System.out.println("3 - Delete Student");
        System.out.println("4 - List of all Students");
        int id = input.nextInt();

        switch (id) {
            case 1:
                System.out.println("Student Operation:");
                addStudent(sId);
                valid = true;
                break;
            case 2:
                System.out.println("Update Student:");
                valid = true;
                break;
            case 3:
                System.out.println("Delete Student");
                deleteStudent();
                valid = true;
                break;
            case 4:
                System.out.println("List of all Students: ");
                getStudents();
                valid = true;
                break;
            default:
                System.out.println("Incorrect input!! Please re-enter choice from menu");

        }

    }

    public static void addStudent(int sId) {
        Scanner studentName = new Scanner(System.in);
        System.out.println("Enter Student Name.");
        String s = String.valueOf(sId);
        Person person = pd.newPerson(s, studentName.nextLine());
        StudentProfile student = sd.newStudentProfile(person);

    }

    public static void getStudents() {
        for (StudentProfile sp : department.getStudentDirectory().getStudentlist()) {
            System.out.println("Student Id: " + sp.getPerson().getPersonId() + " Student Name : " + sp.getPerson().getName());
        }

    }
    
    public static void deleteStudent() {

         Scanner choice = new Scanner(System.in);
        System.out.println("Enter Student Number.");
        String studentId = choice.nextLine();
        Iterator<StudentProfile> itr = (ListIterator<StudentProfile>) department.getStudentDirectory().getStudentlist().listIterator(); 
        while (itr.hasNext()) 
        { 
            if(itr.next().getPerson().getPersonId().equalsIgnoreCase(studentId)) {
                    itr.remove();   
            }
        }
        
    }

//    Course Operation 
    public static void courseOperations() {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        System.out.println("1 - Add Course");
        System.out.println("2 - Update Course");
        System.out.println("3 - Delete Course");
        System.out.println("4 - List of all Courses");
        int id = input.nextInt();

        switch (id) {
            case 1:
                System.out.println("Course Operation:");
                addCourse();
                valid = true;
                break;
            case 2:
                System.out.println("Update Course:");
//                    addExistingPatient();
                valid = true;
                break;
            case 3:
                System.out.println("Delete Course");
                deleteCourse();
                valid = true;
                break;
            case 4:
                System.out.println("List of all Courses: ");
                getCourses();
                valid = true;
                break;
            default:
                System.out.println("Incorrect input!! Please re-enter choice from menu");

        }

    }

    public static void addCourse() {
        Scanner choice = new Scanner(System.in);
        System.out.println("Enter Course Name.");
        String courseName = choice.nextLine();
        System.out.println("Enter Course Number.");
        String courseNumber = choice.nextLine();
        System.out.println("Enter Course Credit.");
        int courseCredit = choice.nextInt();

        Course course = department.newCourse(courseName, courseNumber, courseCredit);

    }

    public static void deleteCourse() {

         Scanner choice = new Scanner(System.in);
        System.out.println("Enter Course Number.");
        String courseNumber = choice.nextLine();
        Iterator<Course> itr = (ListIterator<Course>) department.getCourseCatalog().getCourseList().listIterator(); 
        while (itr.hasNext()) 
        { 
            if(itr.next().getCOurseNumber().equalsIgnoreCase(courseNumber)) {
                    itr.remove();   
            }
        }
        
    }

    public static void getCourses() {
        for (Course c : department.getCourseCatalog().getCourseList()) {
            System.out.println("------------------------------------------");
            System.out.println("Course Name  : " + c.getName());
            System.out.println("Course Number : " + c.getCOurseNumber());
            System.out.println("Course Credit : " + c.getCredits());
        }
    }

}
