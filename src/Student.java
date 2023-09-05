public class Student {
    private String name;
    private double gpa;
    private int id;

    public Student(String n, double g, int i)
    {
        name = n;
        gpa = g;
        id = i;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }

    public double getGPA()
    {
        return gpa;
    }

    public void setGPA(double g)
    {
        gpa = g;
    }

    public int getID()
    {
        return id;
    }

    public void setID(int i)
    {
        id = i;
    }

    public String toString()
    {
        return "Name: " + getName() + "GPA: " + getGPA() + "ID: " + getID();
    }
}
