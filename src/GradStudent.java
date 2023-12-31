public class GradStudent extends Student{
    private String office;
    private String officeHours;

    public GradStudent(String n, double g, String i, String o, String oH)
    { 
        super(n, g, i);
        office = o;
        officeHours = oH;
    }

    public String getOffice()
    {
        return office;
    }

    public void setOffice(String o)
    {
        office = o;
    }

    public String getOfficeHours()
    {
        return officeHours;
    }

    public void setOfficeHours(String oH)
    {
        officeHours = oH;
    }

    // @override
    public void setID(String i)
    {
        super.setID("GR-" + i);
    }

    // @override
    public String toString()
    {
        return super.toString() + " Office: " + getOffice() + " Office Hours: " + getOfficeHours() + " Degree: " + getDegree();
    }

    public String getSerialData()
    {
        return super.getSerialData() + "," + getOffice() + "," + getOfficeHours() + "," + getDegree();
    }

    public String getDegree()
    {
        return "graduate degree";
    }
}
