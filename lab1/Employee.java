public class Employee {
    private String firstName;
    private String lastName;
    private double salary = 0;

    public Employee (String firstName, String Lname, double salary){
        this.firstName = firstName;
        lastName = Lname;
        this.salary = salary;
    }
    public Employee (String firstName, String Lname){
        this.firstName = firstName;
        lastName = Lname;
    }

    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public void setSalary(double salary){
        if(salary>0){
            this.salary = salary;
        }
    }
    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public double getSalary(){
        return salary;
    }
    public double getYearlySalary(){
        return (salary*12);
    }
    public void setSalaryRaise(double raise){
        if(raise>0){
            salary = salary * raise;
        }
    }

    public class EmployeeTest{
        
        public static void main(String[] args){
            Employee Employee1 = new Employee("John", "Bimbibi", 12312);
            System.out.println(Employee1.firstName);
            System.out.println(Employee1.lastName);
            System.out.println(Employee1.salary);
            Employee1.setfirstName("Egor");
            Employee1.setlastName("TheGoat");
            Employee1.setSalary(1000000);
            System.out.println(Employee1.firstName);
            System.out.println(Employee1.lastName);
            System.out.println(Employee1.salary);

            Employee Employee2 = new Employee("Anton", "Shkredin", 1000);
            Employee Employee3 = new Employee("Alex", "Pravin", 1000);

            System.out.println(Employee2.getYearlySalary());
            System.out.println(Employee3.getYearlySalary());

            Employee2.setSalaryRaise(1.1);
            Employee3.setSalaryRaise(1.1);

            System.out.println(Employee2.getYearlySalary());
            System.out.println(Employee3.getYearlySalary());
    }
    }
}
