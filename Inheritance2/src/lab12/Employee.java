/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author USER
 */
public class Employee extends Person{
    private String id;
    private String department;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String gender, int age, String id, String department, double salary) {
        super(name, gender, age);
        this.department = department;
        this.salary = salary;
        
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    @Override
    public String toString() {
        return super.toString()+"\nEmployee{" + "id=" + id + ", department=" + department + ", salary=" + salary + '}';
    }
    
}
