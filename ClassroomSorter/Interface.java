import java.util.Scanner;
/**
 * Write a description of class Interface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Interface
{
    private static Classroom mainClass;
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the LAST NAME for the teacher of this class? (Do not use a prefix or spaces!)");
        String lead = input.next();
        System.out.println("Where is this class located?");
        String room = input.next();
        System.out.println("Creating class with Teacher " + lead + " in room " + room + " Please Wait!");
        mainClass = new Classroom(room, lead);
        input.close();
        gotoMenu();
        
    }
    public static void gotoMenu(){
        Scanner menu = new Scanner(System.in);
        System.out.println("\u000c");
        System.out.println("Welcome to " + mainClass.getTeacher() + "'s Classroom! What would you like to do next?");  
        System.out.println(" 1. List Students \n 2. Sort Students \n 3. Add/Remove Students \n 4. Promote Students \n 5. Find Student \n 0. Exit");
        switch(menu.nextInt()){
            case 0: System.exit(0);
            case 1: menu.close(); getClassList();
            case 2: menu.close(); sortStudents();
            case 3: menu.close(); manipulateStudents();
            case 4: menu.close(); promoteStudentGrade();
            case 5: menu.close(); findStudent();//easiest to search by student id
        }
        
    }
    public static void findStudent(){
        System.out.println("What is the ID of the student you are looking for?");
        Scanner getID = new Scanner(System.in);
        int targetID = getID.nextInt();
        int wait=1;
        if(mainClass.findStudentByID(targetID)==null){
            System.out.println("STUDENT NOT FOUND RETURNING TO MENU.");
            System.out.println("Press 0 to continue!");
        }
        else{
            System.out.println("Student Info: " + mainClass.findStudentByID(targetID));
            System.out.println("Press 0 to continue!");
        }
        wait = getID.nextInt();
        while(wait!=0){
        }
        getID.close();
        gotoMenu();
    }
    public static void sortStudents(){
        mainClass.studentSorter();
        gotoMenu();
    }
    public static void getClassList(){
        mainClass.getStudents();
        System.out.println("Press 0 to go back to menu!");
        Scanner list = new Scanner(System.in);
        int wait = 1;
        wait = list.nextInt();
        while(wait!=0){
        
        }
        list.close();
        gotoMenu();
    }
    public static void promoteStudentGrade(){
       Scanner promotion = new Scanner(System.in); 
       System.out.println("What student would you like to promote?");
       mainClass.getStudents();
       int promo = promotion.nextInt();
       promotion.close();
       mainClass.promoteStudent(promo);
       gotoMenu();
    }
    public static void manipulateStudents(){
        Scanner students = new Scanner(System.in);
        System.out.println("Press 1 to add a student. Press 2 to remove a student.");
        int option = students.nextInt();
        if(option == 1){
            String fName; String lName; double gpah; int gradeLevel; int ident;
            System.out.println("What is the First Name of the new student?");
            fName = students.next();
            System.out.println("What is the Last Name of the new student?");
            lName = students.next();
            System.out.println("What is the GPA of the new student?");
            gpah = students.nextDouble();
            System.out.println("What is the Grade Level of the new student?");
            gradeLevel = students.nextInt();
            System.out.println("What is the ID Number of the new student?");
            ident = students.nextInt();
            
            mainClass.addStudent(fName, lName, gpah, gradeLevel, ident);
            students.close();
            gotoMenu();
        }
        else if(option == 2){
            System.out.println("Which student would you like to remove?");
            mainClass.getStudents();
            mainClass.removeStudent(students.nextInt());
            students.close();
            gotoMenu();
        }
        else{
            System.out.println("ERROR");
            gotoMenu();
        }
    }
}
