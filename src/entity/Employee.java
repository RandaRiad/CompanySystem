/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import DB.GoToDB;
import company.CreateTools;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dfz6
 */
public class Employee implements mainData{
    
    private int EmpNo;
    private String empName;
    private String address;
    private double salary;
    private String hiringDate;
    private String birthDay;
    private int deptNO;
     private String deptName;
     ArrayList <Employee> emps;

     
    SimpleDateFormat f=new SimpleDateFormat();

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHiringDate() {
       // String date =f.format(hiringDate);
        return hiringDate;
    }

    public void setHiringDate(String hiringDate) throws ParseException {
        this.hiringDate = hiringDate;
    }

    public String getBirthDay() {
         //String date =f.format(birthDay);
        return birthDay;
    }

    public void setBirthDay(String birthDay) throws ParseException {
        this.birthDay = birthDay;
    }

    public int getDeptNO() {
        return deptNO;
    }

    public void setDeptNO(int deptNO) {
        this.deptNO = deptNO;
    }

    @Override
    public void add() {
           String sqlStatmen="INSERT INTO `employee` (`emp_no`, `address`, `salary`, `hiring_data`, `birth_date`, `dept_no`, `emp_name`) VALUES ('"+EmpNo+"', '"+address+"', '"+salary+"', '"+hiringDate+"', '"+birthDay+"', '"+deptNO+"', '"+empName+"')";
        GoToDB go= new GoToDB();
        boolean isAdd=go.executeNonQuery(sqlStatmen);
        if(isAdd){
          CreateTools.msgBox("Employee is added");    
       }
    }

    @Override
    public void update(int noRow) {

         String sqlStatmen="UPDATE `employee` SET `address` = '"+address+"', `salary` = '"+salary+"', `hiring_data` = '"+hiringDate+"', `birth_date` = '"+birthDay+"', `dept_no` = '"+deptNO+"', `emp_name` = '"+empName+"' WHERE `employee`.`emp_no` = "+noRow;
        GoToDB go= new GoToDB();
        boolean isUpdate=go.executeNonQuery(sqlStatmen);
        if(isUpdate){
          CreateTools.msgBox("Employee is Updated");    
       }  
    }

    @Override
    public void delete(int rowNumber) {

      String sqlStatmen="DELETE FROM `employee` WHERE `employee`.`emp_no` = "+rowNumber;
        GoToDB go= new GoToDB();
        boolean isDelete=go.executeNonQuery(sqlStatmen);
        if(isDelete){
          CreateTools.msgBox("Employee is Deleted");    
       }  
    }

    @Override
    public Employee  getLastRowOfTable() {
       ArrayList<Employee> emp=getAllRows();
        Employee last = emp.get(emp.size()-1);
        return last;
    }

    @Override
    public ArrayList getAllRows() {

        
        GoToDB go= new GoToDB();
       ResultSet result=go.executeSelect("select* FROM `employee`");
      emps=new ArrayList<>();
       
        try {
            while(result.next()){
                  Employee emp=new Employee();
                emp.setEmpNo(Integer.parseInt(result.getString("emp_no")));
                emp.setAddress(result.getString("address"));
                emp.setBirthDay(result.getDate("birth_date").toString());
                emp.setDeptNO(Integer.parseInt(result.getString("dept_no")));
                emp.setEmpName(result.getString("emp_name"));
                emp.setHiringDate(result.getDate("hiring_data").toString());
                emp.setSalary(Double.parseDouble(result.getString("salary")));
               emps.add(emp);
            }
            return emps;
        } catch (SQLException ex) {
        CreateTools.msgBox(ex.getMessage());
        } catch (ParseException ex) {
        CreateTools.msgBox(ex.getMessage());
        }
        return null;
        
    }
    public Employee getOneRow(int rowNumber) {

         String sqlStatmen="SELECT * FROM `employee` WHERE emp_no="+rowNumber;
        GoToDB go= new GoToDB();
       ResultSet result=go.executeSelect(sqlStatmen);
       Employee emp=new Employee();

        try {
            while(result.next()){
                 emp.setEmpNo(Integer.parseInt(result.getString("emp_no")));
                emp.setAddress(result.getString("address"));
                emp.setBirthDay(result.getDate("birth_date").toString());
                emp.setDeptNO(Integer.parseInt(result.getString("dept_no")));
                emp.setEmpName(result.getString("emp_name"));
                emp.setHiringDate(result.getDate("hiring_data").toString());
                emp.setSalary(Double.parseDouble(result.getString("salary")));

            }
            return emp; 
        } catch (SQLException ex) {
        CreateTools.msgBox(ex.getMessage());
        } catch (ParseException ex) {
        CreateTools.msgBox(ex.getMessage());
        }
         return null;
    }
    
     public ArrayList<Employee>  searchData( int emptNo){
 
     GoToDB go= new GoToDB();
       ResultSet result=go.executeSelect("select* FROM `employee` where emp_no="+emptNo);
       emps=new ArrayList<Employee>();
       
        try {
            while(result.next()){
                 Employee emp=new Employee();
                       emp.setEmpNo(Integer.parseInt(result.getString("emp_no")));
                emp.setAddress(result.getString("address"));
                emp.setBirthDay(result.getDate("birth_date").toString());
                emp.setDeptNO(Integer.parseInt(result.getString("dept_no")));
                emp.setEmpName(result.getString("emp_name"));
                emp.setHiringDate(result.getDate("hiring_data").toString());
                emp.setSalary(Double.parseDouble(result.getString("salary")));
               emps.add(emp);
            }
            return emps;
        } catch (SQLException ex) {
        CreateTools.msgBox(ex.getMessage());
        } catch (ParseException ex) {
        CreateTools.msgBox(ex.getMessage());
        }
        return null;
        
            } 

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
}
