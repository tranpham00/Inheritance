public class GradStudent extends Student{
    private String office;
    private String officeHours;

    public GradStudent(String n, double g, int i, String o, String oH)
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
    public String toString()
    {
        return super.toString() + "Office: " + getOffice() + "Office Hours: " + getOfficeHours();
    }
}
