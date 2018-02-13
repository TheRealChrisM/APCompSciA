
/**
 * Write a description of class Classroom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Classroom
{
    private Student[] roster;
    private String location;
    private String teacher;
    private int classSize;
    public Classroom(String loc, String teach){
        location = loc;
        teacher = teach;
        roster = new Student[29];
        classSize = 0;
    }
    public String getLocation(){
        return location;
    }
    public String getTeacher(){
        return teacher;
    }
    public void getStudents(){
        System.out.println("Students for " + teacher + "'s class");
        for(int x = 0; x<roster.length; x++){
            System.out.println(x + ") " + roster[x]);
        }
    }
    public void addStudent(String first, String last, double gpa, int grade, int id){
        roster[classSize] = new Student(first, last, gpa, grade, id);
        classSize++;
    }
    public void removeStudent(int arrLoc){
        Student tmp;
        if(arrLoc < roster.length-1){
            roster[arrLoc] = null;
            if(arrLoc+1 < roster.length-1){
                for(int x = arrLoc+1; x<roster.length-2; x++){
                    roster[x] = roster[x+1];
                }
            }
        }
        classSize--;
    }
    public void promoteStudent(int arrLoc){
        roster[arrLoc].nextGrade();
    }
    public void studentSorterBySID(){
        int minVal;
        Student tmp;
        for(int x = 0; x<classSize; x++){
            minVal = x;
            for(int y = x; y<classSize; y++){
                if(roster[y].getSID() < roster[minVal].getSID()){
                    minVal = y;
                }
            }
            tmp = roster[x];
            System.out.println(tmp);
            System.out.println(roster[minVal]);
            roster[x] = roster[minVal];
            roster[minVal] = tmp;
        }
    }
    //0 for first & 1 for last
    public void studentSorterByName(int type){
        int minVal;
        boolean typeB;
        if(type==0){
            typeB = true;
        }
        else{
            typeB = false; 
        }
        Student tmp;
        for(int x = 0; x<classSize; x++){
            minVal = x;
            for(int y = x; y<classSize; y++){
                if(roster[y].getName(typeB).compareToIgnoreCase(roster[minVal].getName(typeB))<0){
                    minVal = y;
                }
            }
            tmp = roster[x];
            System.out.println(tmp);
            System.out.println(roster[minVal]);
            roster[x] = roster[minVal];
            roster[minVal] = tmp;
        }
    }
    public void updateGPA(int loc, double newGPA){
        roster[loc].updateGPA(newGPA);
    }
    public Student findStudentByID(int id){
        for(int x = 0; x<classSize;x++){
            if(roster[x].getSID()==id){
                return roster[x];
            }
        }
        return null;
        
    }
}
