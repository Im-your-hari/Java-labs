import java.util.*;
class Employee
{
    private String name;
    private int age;
    private long phonenumber;
    private String address;
    private double salary;
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setPhonenumber(long phonenumber)
    {
        this.phonenumber=phonenumber;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public double printSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getAddress()
    {
        return address;
    }
    public long getPhonenumber()
    {
        return phonenumber;
    }
}

class Officer extends Employee
{
    private String specialization;
    private String department;
    public void setSpecialization(String specialization)
    {
        this.specialization=specialization;
    }
    public void setDepartment(String department)
    {
        this.department=department;
    }
    public String getDepartment()
    {
        return department;
    }
    public String getSpecialization()
    {
        return specialization;
    }
}

class Manager extends Employee
{
    private String specialization;
    private String department;
    public void setSpecialization(String specialization)
    {
        this.specialization=specialization;
    }
    public void setDepartment(String department)
    {
        this.department=department;
    }
    public String getDepartment()
    {
        return department;
    }
    public String getSpecialization()
    {
        return specialization;
    }
}

class Emp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Officer o=new Officer();
        System.out.println("ENTER THE OFFICER'S DETAILS::");
        System.out.println("NAME:");
        o.setName(sc.nextLine());
        System.out.println("ADDRESS:");
        o.setAddress(sc.nextLine());
        System.out.println("AGE:");
        o.setAge(sc.nextInt());
        System.out.println("PH NUMBER:");
        o.setPhonenumber(sc.nextLong());
        System.out.println("DEPARTMENT:");
        o.setDepartment(sc.nextLine());
        System.out.println("SPECIALIZATION:");
        o.setSpecialization(sc.nextLine());
        System.out.println("SALARY:");
        o.setSalary(sc.nextDouble());
        sc.nextLine();
        System.out.println("The officer details");
        System.out.println("Name:"+o.getName());
        System.out.println("Age:"+o.getAge());
        System.out.println("Number:"+o.getPhonenumber());
        System.out.println("Address:"+o.getAddress());
        System.out.println("Salary:"+o.printSalary());
        System.out.println("Department:"+o.getDepartment());
        System.out.println("Specialization:"+o.getSpecialization());
        Manager m=new Manager();
        System.out.println("ENTER THE MANAGER DETAILS::");
        System.out.println("NAME");
        m.setName(sc.nextLine());
        System.out.println("ADDRESS");
        m.setAddress(sc.nextLine());
        System.out.println("SPECIALIZATION");
        m.setSpecialization(sc.nextLine());
        System.out.println("DEPARTMENT");
        m.setDepartment(sc.nextLine());
        System.out.println("AGE");
        m.setAge(sc.nextInt());
        System.out.println("PH NUMBER");
        m.setPhonenumber(sc.nextLong());
        System.out.println("SALARY");
        m.setSalary(sc.nextDouble());
        sc.nextLine();
        System.out.println("The Manager Details");
        System.out.println("Name:"+m.getName());
        System.out.println("Age:"+m.getAge());
        System.out.println("Number:"+m.getPhonenumber());
        System.out.println("Address:"+m.getAddress());
        System.out.println("Salary:"+m.printSalary());
        System.out.println("Department:"+m.getDepartment());
        System.out.println("Specialization:"+m.getSpecialization());
    }
}
