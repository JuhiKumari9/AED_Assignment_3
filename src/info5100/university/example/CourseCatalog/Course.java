/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;

/**
 *
 * @author kal bugrara
 */
public class Course {
    String number;
    String name;
    int credits;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    int price = 1500; //per credit hour
    
    public Course(String n, String numb, int ch){
        name = n;
        number = numb;
        credits = ch;
        
        
    }
    public String getCOurseNumber(){
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    public int getCoursePrice(){
        return price*credits;
        
    }
}
