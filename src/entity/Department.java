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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author dfz6
 */
public class Department  implements mainData{
    
    private int deptNo;
    private String locations;
    private String deptName;
    ArrayList <Department> depts;

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public void add() {
        
        String sqlStatmen=" INSERT INTO department (dept_no, locations, dept_name) VALUES ('"+deptNo+"', '"+locations+"', '"+deptName+"')";
        GoToDB go= new GoToDB();
        boolean isAdd=go.executeNonQuery(sqlStatmen);
        if(isAdd){
          CreateTools.msgBox("Department is added");    
       }
    }

    @Override
    public void update( int numberRow) {
        String sqlStatmen="UPDATE `department` SET `locations` = '"+locations+"', `dept_name` = '"+deptName+"' WHERE `department`.`dept_no` = "+numberRow+"";
        GoToDB go= new GoToDB();
        boolean isUpdate=go.executeNonQuery(sqlStatmen);
        if(isUpdate){
          CreateTools.msgBox("Department is Updated");    
       }   
    }

    @Override
    public void delete( int rowNumber) {

         String sqlStatmen="DELETE FROM `department` WHERE dept_no = "+rowNumber;
        GoToDB go= new GoToDB();
        boolean isDelete=go.executeNonQuery(sqlStatmen);
        if(isDelete){
          CreateTools.msgBox("Department is Deleted");    
       }  
    }

     public Department getOneRow(int rowNumber) {

         String sqlStatmen="select* FROM `department` WHERE `department`.`dept_no` = "+rowNumber+"";
        GoToDB go= new GoToDB();
       ResultSet result=go.executeSelect(sqlStatmen);
       Department dept=new Department();

        try {
            while(result.next()){
                 dept.setDeptNo(Integer.parseInt(result.getString("dept_no")));
                dept.setLocations(result.getString("locations"));
                dept.setDeptName(result.getString("dept_name"));
            }
            return dept; 
        } catch (SQLException ex) {
        CreateTools.msgBox(ex.getMessage());
        }
         return null;
    }
   

    @Override
    public ArrayList<Department> getAllRows() {
        
        GoToDB go= new GoToDB();
       ResultSet result=go.executeSelect("select* FROM `department`");
      depts=new ArrayList<Department>();
       
        try {
            while(result.next()){
                  Department dept=new Department();
                 dept.setDeptNo(Integer.parseInt(result.getString("dept_no")));
                dept.setLocations(result.getString("locations"));
                dept.setDeptName(result.getString("dept_name"));
               depts.add(dept);
            }
            return depts;
        } catch (SQLException ex) {
        CreateTools.msgBox(ex.getMessage());
        }
        return null;
        
            } 

    

    @Override
    public Department getLastRowOfTable(){
 
     ArrayList<Department> de=getAllRows();
        Department last = de.get(de.size()-1);
        return last;
    }
    
    public ArrayList<Department>  searchData( int deptNo){
 
     GoToDB go= new GoToDB();
       ResultSet result=go.executeSelect("select* FROM `department` where dept_no="+deptNo);
       depts=new ArrayList<Department>();
       
        try {
            while(result.next()){
                  Department dept=new Department();
                 dept.setDeptNo(Integer.parseInt(result.getString("dept_no")));
                dept.setLocations(result.getString("locations"));
                dept.setDeptName(result.getString("dept_name"));
               depts.add(dept);
            }
            return depts;
        } catch (SQLException ex) {
        CreateTools.msgBox(ex.getMessage());
        }
        return null;
        
            } 
}
    
    

