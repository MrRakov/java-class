//Employee class comes from file Employee.java
public class EmployeeTeam{
    private Employee employee;
    private Employee boss;

    public EmployeeTeam(Employee Boss, Employee employee) {
        boss = Boss;
        this.employee = employee;
    }

    public void printEmployeeDetails(){
        System.out.println("employees first name is: "+employee.getfirstName());
        System.out.println("employees last name is: "+employee.getlastName());
        System.out.println("employees salary is: " + employee.getSalary());
    } 

    public void printAllEmployeesDetails(){
        System.out.println("employees first name is: "+employee.getfirstName());
        System.out.println("employees last name is: "+employee.getlastName());
        System.out.println("employees salary is: " + employee.getSalary());
        System.out.println("Boss's first name is: "+boss.getfirstName());
        System.out.println("Boss's last name is: "+boss.getlastName());
        System.out.println("Boss's salary is: " + boss.getSalary());
    } 

    public void updateSalaryOfEmployee(String firstname, double newSalary){
        if(newSalary>0 & this.employee.getfirstName() == firstname){
            this.employee.setSalary(newSalary);
        }
        else if(newSalary>0 & this.boss.getfirstName() == firstname){
            this.boss.setSalary(newSalary);
        }
    }
    public void giveRaiseToAllEmployees(){
        this.employee.setSalaryRaise(1.1);
        this.boss.setSalaryRaise(1.1);;
    }

    public class EmployeeTeamDemo{
        public static void main(String[] args){
            Employee Employee1 = new Employee("Anton", "Shkredin", 1000);
            Employee Boss1 = new Employee("Alex", "Pravin", 10000);
            EmployeeTeam employeeTeam1 = new EmployeeTeam(Boss1, Employee1);

            employeeTeam1.printAllEmployeesDetails();
            employeeTeam1.printEmployeeDetails();
            employeeTeam1.updateSalaryOfEmployee("Anton", -100);
            employeeTeam1.giveRaiseToAllEmployees();
            employeeTeam1.printAllEmployeesDetails();
            employeeTeam1.printEmployeeDetails();
        }
    }
}