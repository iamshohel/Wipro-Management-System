import java.util.*;

interface EmployeeManagement {
    void work();
    void display();
}

class Employee implements EmployeeManagement {
    private String name;
    private int id;
    public void setName(String name) {
        this.name = name;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    
    @Override
    public void work() {
        System.out.println(name);
    }
    
    @Override
    public void display() {
        System.out.println("name: " + name);
        System.out.println("id: " + id);
    }
}

class Manager extends Employee {
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

  
    public void display() {
        super.display();
        System.out.println("department: " + department);
    }
}

class Company {
    private ArrayList<EmployeeManagement> employees = new ArrayList<>();

    public void addEmployee(EmployeeManagement emp) {
        employees.add(emp);
    }

    public void displayEmployees() {
        for (EmployeeManagement emp : employees) {
            emp.display();
            emp.work();
            System.out.println();
        }
    }
}
public class ManagementSystem {
    public static void main(String[] args) {
        Company company = new Company();
        Employee emp1 = new Employee();
        emp1.setName("Rohan");
        emp1.setId(101);
        company.addEmployee(emp1);
        Manager manager = new Manager();
        manager.setName("Shohel");
        manager.setId(102);
        manager.setDepartment("HR");
        company.addEmployee(manager);
        company.displayEmployees();
    }
}