/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_principle;
public class Solid_Principle {


    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp = new Employee();
        emp.setName("Susmita sithi");
        emp.setEmployeeId("011132057");
        emp.setAddress("75 North Palace, North Raod Dhanmondi Dhaka-1205");
        emp.setSalary(50000);
        emp.setDateOfJoining(2010);
        emp.setImpact_factor(1.5f);
        
        
        float diff_imp = emp.Recv_impactFactor(3.15f);
        
        
        float salary = 0;
        if(emp.isPromotionDueThisYear(diff_imp)==true){
           salary = emp.calcNewSalary(diff_imp);
        }else{
            salary = emp.getSalary();
        }
        System.out.println("Name : " + emp.getName());
        System.out.println("Employee ID : " + emp.getEmployeeId());
        System.out.println("Address : " + emp.getAddress());
        System.out.println("Salary : " + salary);
        System.out.println("Salary Tax : " + emp.calcNewVAT(salary));       
        
    }
}
