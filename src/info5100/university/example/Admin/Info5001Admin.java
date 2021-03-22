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

        int patientId = 1000;

        do {
            System.out.println("-------------------------------------------------");
            System.out.println("1 - Student Operations");
            System.out.println("2 - Courses Operations");
            System.out.println("3 - Faculty Operations");
//            System.out.println("4 - History of all patients");
//            System.out.println("5 - Number of People in the community with blood pressure is abnormal.");
//            System.out.println("6 - Number of abnormal cases for each community.");
            System.out.println("8 - To exit application  ");
            System.out.print("Enter your choice:  ");
            int mainChoice = input.nextInt();
            switch (mainChoice) {
                case 1:
                    System.out.println("Student Operations:");
//                    patientDetials(++patientId);
                    studentOperations();
                    valid = true;
                    break;
                case 2:
                    System.out.println("Course Operations:");
                    courseOperations();
                    valid = true;
                    break;
                case 3:
                    System.out.println("History of Individual patient");
//                    individualPatientHistory();
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

    public static void studentOperations() {
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter Patient Id: 
        boolean valid = false;
        System.out.println("1 - Add Student");
        System.out.println("2 - Update Student");
        System.out.println("3 - Delete Student");
        System.out.println("4 - List of all Students");
        int id = input.nextInt();

        switch (id) {
            case 1:
                System.out.println("Student Operation:");
//                    patientDetials(++patientId);
                addStudent();
                valid = true;
                break;
            case 2:
                System.out.println("Update Student:");
//                    addExistingPatient();
                valid = true;
                break;
            case 3:
                System.out.println("Delete Student");
//                    individualPatientHistory();
                valid = true;
                break;
            case 4:
                System.out.println("List of all Students: ");
                    getStudents();
                valid = true;
                break;
//                case 8:
//                    System.out.println("Exiting the application");
//                    System.exit(0);
            default:
                System.out.println("Incorrect input!! Please re-enter choice from menu");

        }

    }

    public static void addStudent() {
        Scanner studentName = new Scanner(System.in);
        System.out.println("Enter Student Name.");
        String id = "100";
//        Person p = new Person(id, studentName.next());
        Person person = pd.newPerson("0112303", studentName.nextLine());
        //Student
//        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person);

    }

    public static void getStudents() {
        for (StudentProfile sp : department.getStudentDirectory().getStudentlist()) {
            System.out.println("Student Name : " + sp.getPerson().getName());
        }

    }
    
    
    
//    Course Operation 
     public static void courseOperations() {
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter Patient Id: 
        boolean valid = false;
        System.out.println("1 - Add Course");
        System.out.println("2 - Update Course");
        System.out.println("3 - Delete Course");
        System.out.println("4 - List of all Courses");
        int id = input.nextInt();

        switch (id) {
            case 1:
                System.out.println("Course Operation:");
//                    patientDetials(++patientId);
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
//                    individualPatientHistory();
                valid = true;
                break;
            case 4:
                System.out.println("List of all Courses: ");
                    getCourses();
                valid = true;
                break;
//                case 8:
//                    System.out.println("Exiting the application");
//                    System.exit(0);
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
      
      
      public static void getCourses() {
          for (Course c : department.getCourseCatalog().getCourseList()) {
            System.out.println("Course Name  : " + c.getName());
            System.out.println("Course Number : " + c.getCOurseNumber());
            System.out.println("Course Credit : " + c.getNumber());
        }
      }

}
