
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String fName;
    private String lName;
    private double gpa;
    
    /**
     * Constructor for student objects
     */
    public Student(String first, String last, double grade){
        //Initializing PIV
        fName = first;
        lName = last;
        gpa = grade;
    }
    
    /**
     * Returns the first name
     */
    public String getFName(){
        return fName;
    }
    /**
     * Returns the last name
     */
    public String getlName(){
        return lName;
    }
    /**
     * Returns the GPA 
     */
    public double getGPA(){
        return gpa;
    }
    
    /**
     * Allows you to change the GPA
     */
    public void changeGPA(double newGPA){
        gpa = newGPA;
    }
    
    public String toString(){
        return lName+", "+fName+" GPA: "+gpa;
    }
}
