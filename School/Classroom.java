import java.util.*;
/**
 * Write a description of class Classroom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classroom
{
    ArrayList<Student> roster = new ArrayList<>();
    
    /**
     * Constructor for classroom objects.
     */
    public Classroom(){
    
    }
    /**
     * Adds a student of the student type to the arraylist.
     */
    public void addStudent(Student newStudent){
        roster.add(newStudent);
    }
    /**
     * Removes a student with the reference currStudent
     */
    public void removeStudent(Student currStudent){
        if(roster.indexOf(currStudent) == -1){
            System.out.println("Student cannot be found!");
        }
        else{
            roster.remove(roster.indexOf(currStudent));
        }
    }
    /**
     * Sets GPA for specific student
     */
    public void setGPA(Student s, double newGPA){
        if(roster.indexOf(s)==-1){
            System.out.println("Student not found!");
        }
        else{
            roster.get(roster.indexOf(s)).changeGPA(newGPA);
        }
    }
    /**
     * returns how many students are in the class arraylist
     */
    public int getSize(){
        return roster.size();
    }
    /**
     * Shows all students with a GPA of 3 or higher (that have an A)
     */
    public String getAStudents(){
        String rS = "The following students have an A: \n";
        
        for(Student s : roster){
            if(s.getGPA()>=3){
                rS += s + "\n";
            }
        }
        return rS;
    }
    /**
     * Returns a string version of the Classroom.
     */
    public String toString(){
        String out = "";
        int index = 0;
        for (Student s : roster){
            out += index + ". " + s + "\n";
            index++;
        }
        return out;
    }
}
