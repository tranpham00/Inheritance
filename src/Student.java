abstract class Student implements StringSerializable{
    private String name;
    private double gpa;
    private String id;

    public Student(String n, double g, String i)
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

    public String getID()
    {
        return id;
    }

    public void setID(String i)
    {
        id = i;
    }

    public String toString()
    {
        return "Name: " + getName() + " GPA: " + getGPA() + " ID: " + getID() + " Degree: " + getDegree();
    }

    public String getSerialData()
    {
        return getName() + "," + getGPA() + "," + getID() + "," + getDegree();
    }

    abstract String getDegree();
}
