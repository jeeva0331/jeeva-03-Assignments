class Employee
{
    int empId;
    String empName;

    Employee()
    {
        empId = 100;
        empName = "Not Assigned";
    }

    void display()
    {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }

    public static void main(String args[])
    {
        Employee e1 = new Employee();
        e1.display();
    }
}
