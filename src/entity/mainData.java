/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author dfz6
 */
public interface mainData <E> {
    
    public void add();
    
    public void update(int noRow);
    
    public void delete(int rowNumber);
    
  public mainData<E> getLastRowOfTable();
 
    public ArrayList<E> getAllRows();
    
  
    
  /*  public void getOneRow(JTable table);

    public  void getCustemRows(String statment , JTable table);
    
    public String getValueByName(String name);
    
    public String getNameByValue(String value);
    */
}
