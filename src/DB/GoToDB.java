/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import company.CreateTools;
import java.sql.*;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author dfz6
 */
public class GoToDB {
    
    private String url="";
    private Connection con;

    
    public  String setURL(){
     
        url="jdbc:mysql://localhost:3306/randa_company?useUnicode=true&characterEncoding=UTF-8";
        return url;
    }
    
    
     public  String setURL(String dbName){
     
        url="jdbc:mysql://localhost:3306/" +dbName+ "?useUnicode=true&characterEncoding=UTF-8";
        return url;
    }
     
     
     public void setConnection(){
     
        try {
            con=DriverManager.getConnection(setURL(),"root","");
        } catch (SQLException ex) {
            CreateTools.msgBox(ex.getMessage());
        }
     
     }
     
     
     public boolean checkUserAndPassword(String userName , String password){
     
         
        try {
            setConnection();
            Statement stm= con.createStatement();
            String checkStm="select * from users where username='"+userName+"' and password='"+password+"'";
            stm.executeQuery(checkStm);
            while(stm.getResultSet().next()){
            
                con.close();
                return true;
            }
            con.close();
        } catch (SQLException ex) {
            CreateTools.msgBox(ex.getMessage());
        }
         return false;

     }
     
     
     public boolean executeNonQuery(String stmt){// insert update delete
     
    
        try {
             setConnection();
            Statement stm= con.createStatement();
              stm.executeUpdate(stmt);
            con.close();
            return true;
            
        } catch (SQLException ex) {
            CreateTools.msgBox(ex.getMessage());
            return false;
        }
        
     }
     
     
     public void fillCombo(String tableName, String columnName, String columnNumber,JComboBox combo ){
      
        try {
            setConnection();
            Statement st=con.createStatement();
            String queryStatment="select * from "+tableName;
              

            ResultSet result=st.executeQuery(queryStatment);
            while(result.next()){
               
           //String name=Integer.parseInt(result.getString(columnNumber))+" - "+ result.getString(columnName);
           // combo.addItem(name);

          int number=Integer.parseInt(result.getString(columnNumber));
           combo.addItem(number);

                        }
            
            
          /*  ArrayList <String> values= new ArrayList<>();
            String[] valuesList=new String[values.size()];
           
            while(result.next()){
            values.add(result.getString(columnName));
            }
             for(int i=0;i<values.size();i++){
             valuesList[i]=values.get(i);
            }*/
           
          
            con.close();
           // combo.setModel(new DefaultComboBoxModel(valuesList));
        } catch (SQLException ex) {
            CreateTools.msgBox(ex.getMessage());
        }
     }
     
      public ResultSet createTable( String tableDBName , JTable  createTable,String [] columeNames ){// this name of the table
      
           try {
            setConnection();
            Statement st=con.createStatement();
            String queryStatment="select * from "+tableDBName;
             
            ResultSet  result=st.executeQuery(queryStatment);
            DefaultTableModel  table=(DefaultTableModel)createTable.getModel();
            for(int i=0 ; i<columeNames.length ; i++){   
             String columeName=columeNames[i];
             table.addColumn(columeName);
            }
            
            result=st.executeQuery(queryStatment);

            /*  while(result.next()){
              String salary=result.getString("salary");
              String addess=result.getString("address");

              String data[]= {salary,addess};
              
              table.addRow(data);
              
            
           // }
          
            }*/
           con.close();
           return result;
        } catch (SQLException ex) {
           CreateTools.msgBox(ex.getMessage());
        }
       return null;
      }
     ResultSet  result = null;
      public ResultSet executeSelect( String stemt ){// this name of the database
     
           try {
            setConnection();
            Statement st=con.createStatement();
            String queryStatment=stemt;
              result=st.executeQuery(queryStatment);
        
          
           
        } catch (SQLException ex) {
           CreateTools.msgBox(ex.getMessage());
        }
        return result;
      }

       
    
      
}
