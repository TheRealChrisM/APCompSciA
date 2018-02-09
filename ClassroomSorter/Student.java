
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
    private double GPA;
    private int grade;
    private int sID;
    public Student(String first, String last, double aGrade, int gradeLevel, int id){
        fName = first;
        lName = last;
        GPA = aGrade;
        grade = gradeLevel;
        sID = id;
    }
    //true for first, false for last
    public String getName(boolean fOrL){
        if(fOrL){
            return fName;
        }
        else{
            return lName;
        }
    }
    public double getGPA(){
        return GPA;
    }
    public int getGrade(){
        return grade;
    }
    public void nextGrade(){
        grade++;
    }
    public int getSID(){
        return sID;
    }
    public String toString(){
        return lName + ", " + fName + " (GPA: " + GPA + " | Grade: " + grade + " | Student ID: " + sID + ")";
    }
}
