import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Student cameron = new Student("cameron", 3.4, "0123");
        Student omi = new Student("omi", 3.5, "1234");
        GradStudent andy = new GradStudent("andy", 4.0, "2345", "RK012", "12:00-2:30");
        GradStudent harbert = new GradStudent("harbert", 2.8, "3456", "RK011", "2:30-4:00");
        
        cameron.setGPA(3.8);
        omi.setID("1134");
        cameron.setName("cam");
        andy.setID("2355");
        harbert.setID("3366");

        ArrayList<Student> roster = new ArrayList();

        roster.add(cameron);
        roster.add(omi);
        roster.add(andy);
        roster.add(harbert);

        for(int i = 0; i < roster.size(); i++)
        {
            System.out.println(roster.get(i).toString());
        }
    }
}
