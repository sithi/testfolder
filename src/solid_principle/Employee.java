/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_principle;
import java.util.Date;

public class Employee {
    private String employeeId;
    private String name;
    private String address; 
    private int dateOfJoining;
    private int salary;
    private int salary_TAX;
    private float impact_factor;

    public Employee(String employeeId, String name, String address, int dateOfJoining, int salary, int salary_TAX, float impact_factor) {
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
        this.salary_TAX = salary_TAX;
        this.impact_factor = impact_factor;
    }

    public Employee() {
        
    }
    
    
    
    //Add Getter and Setters

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    
    public int getDateOfJoining() {
        return dateOfJoining;
    }
    

    public void setDateOfJoining(int dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public float getImpact_factor() {
        return impact_factor;
    }

    public void setImpact_factor(float impact_factor) {
        this.impact_factor = impact_factor;
    }
       
    
    
    
    public float Recv_impactFactor(float impctfctr)
    {
        float diff = 0;
        diff = (float)(impctfctr - impact_factor );
        return diff;
    }
    
    public boolean isPromotionDueThisYear(float diff_imp){
        int currentYear = 0,jobtime = 0;
        Date date = new Date();
        currentYear = date.getYear() + 1900 ;
        jobtime = currentYear - dateOfJoining;
        if(diff_imp > 1.2 && jobtime >= 2){
          return true;  
        }else
            return false;        
    }
    public float calcNewSalary(float diff_imp){
        float extra_salary=0;
        extra_salary = diff_imp * 7500;
        return salary + extra_salary;
    } 
    public float calcNewVAT(float Newsalary){
        float newSalaryTax=0;
        newSalaryTax = (Newsalary * 17)/100;
        return newSalaryTax;
    }
}
