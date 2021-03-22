/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyAssignment;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Department department = new Department("Information Systems");

        // Added Courses
        Course course = department.newCourse("Application Engineering and Development", "INFO 5100", 4);
        Course course2 = department.newCourse("Web Design and User Experience Engineering", "INFO 6150", 4);
        Course course3 = department.newCourse("Data Science Engineering with Python", "INFO 6101", 4);
        Course course4 = department.newCourse("Program Structure and Algorithms", "INFO 6205", 4);
        Course course5 = department.newCourse("Data Management and Database Design", "INFO 6210", 4);

//        CourseCatalog courseCatalog =  new CourseCatalog(department);
        CourseSchedule courseschedule = department.newCourseSchedule("Spring2021");
        CourseSchedule courseschedule2 = department.newCourseSchedule("Fall2021");

        // 
        CourseOffer courseoffer = courseschedule.newCourseOffer(course.getCOurseNumber());
        CourseOffer courseoffer23 = courseschedule.newCourseOffer(course5.getCOurseNumber());
        courseoffer.generatSeats(5);
        courseoffer23.generatSeats(10);

        CourseOffer courseoffer2 = courseschedule.newCourseOffer(course2.getCOurseNumber());
        courseoffer2 = courseschedule.newCourseOffer(course4.getCOurseNumber());
        courseoffer2.generatSeats(5);

        CourseOffer courseOffer3 = courseschedule2.newCourseOffer(course2.getCOurseNumber());
        courseOffer3.generatSeats(5);

        // Adding faculty to courseOffer
        Person faculty = new Person("007", "Mr. Bugrara");
        FacultyProfile fp = new FacultyProfile(faculty);
        courseoffer.AssignAsTeacher(fp);

        Person faculty2 = new Person("008", "Mr. Amuthan");
        FacultyProfile fp2 = new FacultyProfile(faculty2);
        courseoffer2.AssignAsTeacher(fp2);

        FacultyDirectory facultyDirectory = new FacultyDirectory(department);
        facultyDirectory.newStudentProfile(faculty);
        facultyDirectory.newStudentProfile(faculty2);

        // end of faculty
        ArrayList<FacultyProfile> facultyProfiles = new ArrayList<FacultyProfile>();
        facultyProfiles.add(fp);
        facultyProfiles.add(fp2);

        FacultyAssignment fa = new FacultyAssignment(fp, courseoffer);
        FacultyAssignment fa2 = new FacultyAssignment(fp2, courseoffer2);

        // Person 
        PersonDirectory pd = department.getPersonDirectory();
        Person person = pd.newPerson("0112303", "Ajinkya Babar");
        Person person2 = pd.newPerson("0112304", "Juhi Kumari");
        Person person3 = pd.newPerson("0112323", "Amisha Gupta");

        //Student
        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person);
        StudentProfile student2 = sd.newStudentProfile(person2);
        StudentProfile student3 = sd.newStudentProfile(person3);

        CourseLoad courseload = student.newCourseLoad("Spring2021");
        CourseLoad courseload2 = student2.newCourseLoad("Spring2021");
        CourseLoad courseload3 = student3.newCourseLoad("Spring2021");

        courseload2.newSeatAssignment(courseoffer);
//        courseload.newSeatAssignment(courseoffer23);
        courseload.newSeatAssignment(courseoffer);

        courseload3.newSeatAssignment(courseOffer3);

        department.RegisterForAClass("0112303", "INFO 6210", "Spring2021");
//        department.RegisterForAClass("0112303", "INFO 6210", "Spring2021");
        department.RegisterForAClass("0112304", "INFO 6205", "Spring2021");
        department.RegisterForAClass("0112323", "INFO 6150", "Spring2021");

        int total = department.calculateRevenuesBySemester("Spring2021");
        System.out.println("department Name : " + department.getName());
        System.out.println("------------------List of All Courses-----------------------");
        for (Course courseList : department.getCourseCatalog().getCourseList()) {
            System.out.println(courseList.getCOurseNumber() + " - " + courseList.getName()
                    + " (" + courseList.getCredits() + ")");
        }

        System.out.println("------------------Faculty Details-----------------------");
        for (FacultyProfile faL : facultyProfiles) {

            System.out.println("Faculty Profile: " + faL.getPerson().getName());
            for (FacultyAssignment fa1 : faL.getFacultyassignments()) {
            }
        }

// List of students 
        System.out.println("------------------Student Details-----------------------");
        for (StudentProfile sp : department.getStudentDirectory().getStudentlist()) {

            System.out.println("Semester : " + sp.getCurrentCourseLoad().getSemester());
            System.out.println("Student Name : " + sp.getPerson().getName() + " ");
//                    + sp.getTranscript().getCourseLoadBySemester("Spring2021").getSeatassignments());

            for (SeatAssignment sa : sp.getTranscript().getCourseLoadBySemester("Spring2021").getSeatassignments()) {
                System.out.println("Course Name: " + sa.getSeat().getCourseoffer().getCourse().getName());
                System.out.println("Course Grade: " + sa.calculateGPA());
            }

            System.out.println("-----------------------------------------------------------");
        }

    }

}
