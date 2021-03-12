/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controls;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dfz6
 */
public class Table extends JTable{
    
   
  
    
    public void createTable( int numberOfColume, Object nameOfColumn[] ){// this name of the table
      
        JTable table = new JTable();
        DefaultTableModel modelTable= new DefaultTableModel();
        modelTable.setColumnCount(numberOfColume);
        modelTable.setColumnIdentifiers(nameOfColumn);
        table.setModel(modelTable);
        table.setAutoCreateRowSorter(true);
        JScrollPane pane=new JScrollPane(table);
        pane.setViewportView(table);

       }
    
   
         
       
        //create table with data
         
        //add the table to the frame
         
        
    }
    

